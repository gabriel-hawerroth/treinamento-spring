package br.spin.treinamento.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest")
public class GetController {

    @GetMapping("/")
    public String myFirstRequest() {
        return "My first request";
    }

    @GetMapping("/parametro")
    public String requisicaoParametro(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "sobrenome", required = false) String sobrenome
    ) {
        if (sobrenome == null) {
            sobrenome = "";
        }
        return "Olá " + nome + " " + sobrenome;
    }

    @GetMapping("/path/{idade}")
    public String requisicaoComParametroPath(
            @PathVariable(name = "idade") String idade
    ) {
        return "Idade: " + idade;
    }

}
