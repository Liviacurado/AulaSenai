package turistando.trabalhojava.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import turistando.trabalhojava.Model.GastoModel;

public interface GastoRepository extends JpaRepository<GastoModel, Integer>{

 public List<GastoModel> findAll();

}
