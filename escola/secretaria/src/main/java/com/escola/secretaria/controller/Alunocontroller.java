package com.escola.secretaria.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.escola.secretaria.Repository.AlunoRepository;
import com.escola.secretaria.Repository.DisciplinaRepository;
import com.escola.secretaria.Repository.ResultadosRepository;
import com.escola.secretaria.model.Alunomodel;
import com.escola.secretaria.model.Disciplinasmodel;
import com.escola.secretaria.model.Resultadosmodel;

@RestController
public class Alunocontroller {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired 
    private ResultadosRepository resultadoRepository;

    @GetMapping("/lista")
    public List<Alunomodel> lista() {
        return alunoRepository.findAll();
    }

    @GetMapping("/teste")
    public String teste() {
        return "Tá rodando";
    }

    @PostMapping("/inseriraluno")
    public Alunomodel inserirAluno(@RequestBody Alunomodel aluno) {
        return alunoRepository.save(aluno);

    }

    @PostMapping("/inserirdisciplina")
    public Disciplinasmodel inserirDisciplina(@RequestBody Disciplinasmodel disciplinas) {
        return disciplinaRepository.save(disciplinas);

    }

    @GetMapping("/mostrardisciplina")
    public List<Disciplinasmodel> listaDisciplina() {
        return disciplinaRepository.findAll();
    }
    
    @PostMapping("/lancarnotas")
    public Resultadosmodel inserirNotas(@RequestBody Resultadosmodel resultados){
        return resultadoRepository.save(resultados);
    }


}
