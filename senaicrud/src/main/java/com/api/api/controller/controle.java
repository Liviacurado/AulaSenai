package com.api.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.api.model.Pessoa;
import com.api.api.repository.PessoaRepositorio;



@RestController
public class controle {
    @Autowired 

    private PessoaRepositorio funcao;

    @PostMapping("/cadastro")
    public Pessoa salvar (@RequestBody Pessoa pessoinha){
        return funcao.save(pessoinha);

    }
    @GetMapping ("/tudo")
     public List<Pessoa> busca(){
        return funcao.findAll();

    }
    @GetMapping("/tudo/{id}")
    public List<Pessoa> selecionaId (@PathVariable int id) {
        return funcao.findById(id);
    }
   
    @GetMapping("")
    public String mensagem(){
        return "Olá Mundo!";
    }

    @GetMapping("/bemvindo")
    public String bemVindo() {
        return "Bem vindo ao Spring";
    }

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem vindo(a) " +nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p){
        return p;
    }
    
}