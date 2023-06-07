package br.spin.treinamento.controller;

import br.spin.treinamento.classes.listaSalarios.ListaSalarios;
import br.spin.treinamento.classes.listaSalarios.RetornoSalarios;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("salario")
public class Salarios {

    @PostMapping("/lista")
    public RetornoSalarios postListaSalarios(@RequestBody ListaSalarios[] lista) {
        String nomeMaiorSalario = "";
        Integer maiorSalario = 0;
        double soma = 0;
        for (ListaSalarios salarios : lista) {
            soma += salarios.getSalario();
            if (salarios.getSalario() > maiorSalario) {
                nomeMaiorSalario = salarios.getNome();
                maiorSalario = salarios.getSalario();
            }
        }
        double media = soma / lista.length;
        String med = "A média salarial é: R$" + media;
        String maior = "O maior salário é do " + nomeMaiorSalario + " e o salário é de: R$" + maiorSalario;
        return new RetornoSalarios(lista, med, maior);

    }

}
