package turistando.trabalhojava.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import turistando.trabalhojava.Model.AbastecimentoModel;

@Repository
public interface AbastecimentosRepository extends JpaRepository <AbastecimentoModel, String >{

    public List<AbastecimentoModel> findAll();

 

}
