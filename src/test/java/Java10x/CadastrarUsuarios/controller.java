package Java10x.CadastrarUsuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping
@RestController

public class controller {

    @GetMapping("/")

    public String boasVindas(){
        return "Olá mundo";
    }
    
    
}
