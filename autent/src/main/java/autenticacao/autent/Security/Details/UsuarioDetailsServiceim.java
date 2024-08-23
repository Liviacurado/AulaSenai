package autenticacao.autent.Security.Details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import autenticacao.autent.Model.UsuarioModel;
import autenticacao.autent.Repository.UsuarioRepository;

public class UsuarioDetailsServiceim implements UserDetailsService{

    @Autowired

    private UsuarioRepository usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
        UsuarioModel usuario = usuarioRepository.findByEmail(username).orElseThrow(()-> new RuntimeException("Usuário não encontrado"));

        return new UsuariosDetailsIm(usuario);
    }

}
