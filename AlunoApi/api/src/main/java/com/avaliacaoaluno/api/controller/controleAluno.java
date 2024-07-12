package com.avaliacaoaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.avaliacaoaluno.api.model.Aluno;
import com.avaliacaoaluno.api.repository.AlunoRespository;

@Controller
public class controleAluno {

    @Autowired
    private  AlunoRespository A ;


    @RequestMapping ("/Aluno")
    public List <Aluno> salvar (@RequestBody Aluno aluno ){ 
        return  A.findAll();

      
    }

      




}
