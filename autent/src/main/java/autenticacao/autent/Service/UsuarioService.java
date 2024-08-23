package autenticacao.autent.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import autenticacao.autent.DTOs.RecoveryJwtTokenDTO;
import autenticacao.autent.DTOs.UsuarioLoginDTO;
import autenticacao.autent.DTOs.criarUsuarioDTO;
import autenticacao.autent.Model.RulesModel;
import autenticacao.autent.Model.UsuarioModel;
import autenticacao.autent.Repository.UsuarioRepository;
import autenticacao.autent.Security.Autent.JwtTokenService;
import autenticacao.autent.Security.Config.SegurancaConfig;
import autenticacao.autent.Security.Details.UsuariosDetailsIm;

@Service
public class UsuarioService {
 @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private SegurancaConfig segurancaConfig;

    public RecoveryJwtTokenDTO authenticateUsuario(UsuarioLoginDTO usuarioLoginDTO){

        UsernamePasswordAuthenticationToken usuarioPassword = new UsernamePasswordAuthenticationToken(usuarioLoginDTO.email(), usuarioLoginDTO.password());

        Authentication authentication = authenticationManager.authenticate(usuarioPassword);

        UsuariosDetailsIm usuariosDetailsim = (UsuariosDetailsIm) authentication.getPrincipal();

        return new RecoveryJwtTokenDTO(jwtTokenService.generateToken(usuariosDetailsim));

    }

    public void CriarUsuario(criarUsuarioDTO criarUsuarioDTO){
        UsuarioModel usuarioModel = UsuarioModel.builder()
            .email(criarUsuarioDTO.email())
            .password(segurancaConfig.passwordEncoder().encode(criarUsuarioDTO.password()))
            .rules(List.of(RulesModel.builder().tipo(criarUsuarioDTO.rules()).build()))
            .build();

            usuarioRepository.save(usuarioModel);

    }
}
