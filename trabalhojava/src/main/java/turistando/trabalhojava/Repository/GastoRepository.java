package turistando.trabalhojava.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import turistando.trabalhojava.Model.GastoModel;

@Repository
public interface GastoRepository extends JpaRepository<GastoModel, Integer>{

 public List<GastoModel> findAll();

}
