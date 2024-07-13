package com.avaliacaoaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaoaluno.api.model.Alunomodel;
import com.avaliacaoaluno.api.repository.AlunoRespository;

@RestController
public class controleAluno {

    @Autowired
    private  AlunoRespository A ;
     private Nota

    @RequestMapping ("/Aluno")
    public List <Alunomodel> salvar (@RequestBody Alunomodel aluno ){ 
        return  A.findAll();

      
    }

      




}
