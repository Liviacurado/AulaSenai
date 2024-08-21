package turistando.trabalhojava.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import turistando.trabalhojava.Model.VeiculoModel;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, String>{
 public List<VeiculoModel> findAll();

}
