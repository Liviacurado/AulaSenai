package turistando.trabalhojava.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import turistando.trabalhojava.Model.AbastecimentoModel;


public interface AbastecimentosRepository extends JpaRepository <AbastecimentoModel, String >{

    public List<AbastecimentoModel> findAll();

 

}
