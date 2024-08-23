package autenticacao.autent.Security.Autent;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import autenticacao.autent.Model.UsuarioModel;
import autenticacao.autent.Security.Details.UsuariosDetailsIm;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class UsuarioAutenticFiltro extends OncePerRequestFilter{

    @SuppressWarnings("rawtypes")
    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private autenticacao.autent.Repository.UsuarioRepository usuarioRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException{
        if(checkIfEndpointIsNotPublic(request)){
            String token = RecuperaToken(request);
            if(token != null){
                String objeto = jwtTokenService.getSubjectFromToken(token);
                UsuarioModel usuario = usuarioRepository.findByEmail(objeto).get();
                UsuariosDetailsIm usuarioDetailsIm = new UsuariosDetailsIm(usuario);

                Authentication authentic = new UsernamePasswordAuthenticationToken(usuarioDetailsIm.getUsername(), null, usuarioDetailsIm.getAuthorities()); 

                SecurityContextHolder.getContext().setAuthentication(authentic);
            }
            else{
                throw new RuntimeException("Faltando Token!");
            }
        }

        filterChain.doFilter(request, response);
    }

    private String RecuperaToken(HttpServletRequest request){
        String autoriza = request.getHeader("Authorization"); 
        
        if(autoriza != null){
            return autoriza.replace("Bearer ","");
        }

        return null;
    }

    private boolean checkIfEndpointIsNotPublic(HttpServletRequest request){
        String uri = request.getRequestURI();
        return !Arrays.asList(autenticacao.autent.Security.Config.SegurancaConfig.ENDPOINTS_AUTHENTICATION_NOT_REQUIRED).contains(uri);
    }
}

