package turistando.turistando.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import turistando.turistando.Model.AbastecimentoModel;
import turistando.turistando.Repository.Abastecimentorepository;


@RestController
public class AbastecimentoController {

    @Autowired

    private Abastecimentorepository abastecimentorepository;

    @PostMapping("/cadastrarabastecimento")
    public AbastecimentoModel cadastrarabastecimento(AbastecimentoModel abastecimento) {
        return abastecimentorepository.save(abastecimento);
    }
    








}
