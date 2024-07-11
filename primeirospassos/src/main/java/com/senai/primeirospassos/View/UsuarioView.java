package com.senai.primeirospassos.View;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.senai.primeirospassos.model.Usuario;


@Repository
public class UsuarioView {
public void save (Usuario usuario){

    System.out.println("Salvar - recebendo meu novo usuário");
    System.out.println(usuario);
}
    
public List<Usuario> listAll (){
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario ("Livia","1234"));
    usuarios.add (new Usuario("Guilherme","30303"));
     return usuarios;
}

}
