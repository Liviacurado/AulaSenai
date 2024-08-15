package turistando.turistando.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import turistando.turistando.Model.VeiculoModel;
import turistando.turistando.Repository.Veiculorepository;



@RestController
public class VeiculoController {
    @Autowired

    private Veiculorepository veiculorepository;


    @PostMapping("/cadastrarveiculo")
    public VeiculoModel cadastrarveiculo(VeiculoModel veiculo) {
       return veiculorepository.save(veiculo);
        
        
    }

    @GetMapping("/listarVeiculos")
    public List<VeiculoModel> listarVeiculos () {
        return veiculorepository.findAll();
    }
    
    
    @PutMapping("/modificarVeiculo/{id}")
    public VeiculoModel modificarVeiculo(@PathVariable String id,@RequestBody VeiculoModel veiculo) {
       return veiculorepository.save(veiculo);
        
        
    }

    @DeleteMapping("/deletarVeiculo/{id}")
    public void deletarVeiculo(@PathVariable String id ){
      veiculorepository.deleteById(id);

    }

}
