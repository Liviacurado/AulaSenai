package com.escola.secretaria.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    
import com.escola.secretaria.model.Alunomodel;

  @SuppressWarnings ("rawtypes")
        public interface AlunoRepository extends JpaRepository<Alunomodel, Integer>{ 
     
        @SuppressWarnings ("null")
          public List <Alunomodel> findAll();
          
    }
    

