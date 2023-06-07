package br.spin.treinamento.controller;

import br.spin.treinamento.classes.Tabuada.ListaTabuada;
import br.spin.treinamento.classes.Tabuada.RetornoTabuada;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tabuada")
public class Tabuada {

    @PostMapping("/calcular")
    public RetornoTabuada calcular(@RequestBody ListaTabuada lista) {
        int qtdValores = 10;
        String[] tabuada = new String[qtdValores];
        for (int i = 1; i <= qtdValores; i++) {
            tabuada[i - 1] = lista.getNum() + " x " + i + " = " + lista.getNum() * i;
        }

        return new RetornoTabuada(tabuada);
    }
}
