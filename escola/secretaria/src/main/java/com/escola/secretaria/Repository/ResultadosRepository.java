package com.escola.secretaria.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.secretaria.model.Resultadosmodel;
    
    public interface ResultadosRepository extends JpaRepository<Resultadosmodel, Integer> {
        
        public List<Resultadosmodel> findAll();
        

                                                
    }
   
