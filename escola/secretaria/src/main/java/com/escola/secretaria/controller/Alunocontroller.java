package com.escola.secretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 

import com.escola.secretaria.Repository.AlunoRepository;
import com.escola.secretaria.model.Alunomodel;



@RestController
public class Alunocontroller {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/lista")
    public List<Alunomodel> lista(){
        return alunoRepository.findAll();
    }
    @GetMapping("/teste")

    public String teste (){
        return "hello";

    }
    @PostMapping ("/insere")
    public Alunomodel inserir (@RequestBody Alunomodel aluno){
        return alunoRepository.save(aluno);

    }


}
