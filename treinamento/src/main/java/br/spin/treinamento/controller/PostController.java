package br.spin.treinamento.controller;

import br.spin.treinamento.classes.Formulario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
public class PostController {

    @PostMapping("/")
    public String primeiroPost() {
        return "Requisição POST";
    }

    @PostMapping("/formulario")
    public Formulario postFormulario(@RequestBody Formulario formulario) {
        return formulario;
    }
}
