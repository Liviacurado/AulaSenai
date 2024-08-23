package turistando.trabalhojava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import turistando.trabalhojava.Model.AbastecimentoModel;
import turistando.trabalhojava.Repository.AbastecimentosRepository;

@RestController
public class AbastecimentosController {
@Autowired

    private AbastecimentosRepository abastecimentosrepository;

    @PostMapping("/cadastrarabastecimento")
    public AbastecimentoModel cadastrarabastecimento(AbastecimentoModel abastecimento) {
        return abastecimentosrepository.save(abastecimento);
    }
    

    @GetMapping("/listarabastecimentos")
    public List<AbastecimentoModel> listarabastecimentos () {
        return abastecimentosrepository.findAll();
    }
    

}