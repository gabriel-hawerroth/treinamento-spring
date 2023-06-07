package br.spin.treinamento.controller;

import br.spin.treinamento.classes.OperacaoCalculadora;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lista")
public class ListController {

    @PostMapping("/numeros")
    public Integer somaNumeros(@RequestBody List<Integer> lista) {
        Integer auxiliar = 0;

        for (int i = 0; i < lista.size(); i++) {
            auxiliar = auxiliar + lista.get(i);
        }
        return auxiliar;
    }

    @PostMapping("/classes")
    public List<OperacaoCalculadora> recebeListaClasse(@RequestBody List<OperacaoCalculadora> lista) {
        return lista;
    }
}
