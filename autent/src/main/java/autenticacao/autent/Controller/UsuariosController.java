package autenticacao.autent.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import autenticacao.autent.DTOs.RecoveryJwtTokenDTO;
import autenticacao.autent.DTOs.UsuarioLoginDTO;
import autenticacao.autent.DTOs.criarUsuarioDTO;
import autenticacao.autent.Service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping("/login")
    public ResponseEntity<RecoveryJwtTokenDTO> autenticarUsuario(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {

        RecoveryJwtTokenDTO token = usuarioService.authenticateUsuario(usuarioLoginDTO);
        
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Void> criarUsuario(@RequestBody criarUsuarioDTO criarUsuarioDTO) {
        usuarioService.CriarUsuario(criarUsuarioDTO);
        
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    

}


