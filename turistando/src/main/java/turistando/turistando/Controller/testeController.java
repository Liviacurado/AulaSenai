package turistando.turistando.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testeController {

    @GetMapping("/teste")
    public String teste(){
        return "tá funcionando";
    }

}
