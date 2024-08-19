package turistando.turistando.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import turistando.turistando.Model.AbastecimentoModel;
import turistando.turistando.Repository.Abastecimentorepository;



@RestController
public class AbastecimentoController {
 // crie uma excessao para caso o preencimento seja nullo (not null)
    @Autowired

    private Abastecimentorepository abastecimentorepository;

    @PostMapping("/cadastrarabastecimento")
    public AbastecimentoModel cadastrarabastecimento(AbastecimentoModel abastecimento) {
        return abastecimentorepository.save(abastecimento);
    }
    

    @GetMapping("/listarabastecimentos")
    public List<AbastecimentoModel> listarabastecimentos () {
        return abastecimentorepository.findAll();
    }
    


}
