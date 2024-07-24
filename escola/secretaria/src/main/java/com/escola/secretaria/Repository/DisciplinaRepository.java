package com.escola.secretaria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.secretaria.model.Disciplinasmodel;


public interface  DisciplinaRepository extends JpaRepository<Disciplinasmodel, Integer> {


    @SuppressWarnings ("null")
    public List<Disciplinasmodel> findAll();


    
}
