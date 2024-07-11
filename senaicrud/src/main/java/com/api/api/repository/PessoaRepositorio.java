package com.api.api.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.api.model.Pessoa;

@Repository
public interface PessoaRepositorio extends CrudRepository< Pessoa, Integer> {
List<Pessoa>findAll(); 

List<Pessoa> findById(int idade);

}