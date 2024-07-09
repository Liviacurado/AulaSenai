package com.senai.primeirospassos.Controller;
import com.senai.primeirospassos.model.Usuario;
import com.senai.primeirospassos.View.UsuarioView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {


    @Autowired 

    private UsuarioView View;

    @GetMapping ("/usuarios")
    public List<Usuario> getAll (){
        return View.listAll();
    }
}
