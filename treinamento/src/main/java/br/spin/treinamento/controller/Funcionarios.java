package br.spin.treinamento.controller;

import br.spin.treinamento.classes.cadastroFuncionarios.ListaFuncionarios;
import br.spin.treinamento.classes.cadastroFuncionarios.RetornoFuncionarios;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastro")
public class Funcionarios {

    @PostMapping("/funcionarios")
    public RetornoFuncionarios funcionarios(@RequestBody ListaFuncionarios[] lista) {
        int totalFuncionarios = lista.length;
        int totalHomens = 0;
        int totalMulheres = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getSexo().equals("Masculino")) {
                totalHomens += 1;
            } else if (lista[i].getSexo().equals("Feminino")) {
                totalMulheres += 1;
            }
        }
        RetornoFuncionarios retorno = new RetornoFuncionarios(lista, totalFuncionarios, totalHomens, totalMulheres);
        retorno.setPorcentSexos(totalHomens, totalMulheres);
        return retorno;
    }
}
