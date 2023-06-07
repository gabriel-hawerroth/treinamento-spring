package br.spin.treinamento.controller;

import br.spin.treinamento.classes.feedbacks.ListaFeedbacks;
import br.spin.treinamento.classes.feedbacks.RetornoFeedbacks;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feedback")
public class Feedback {

    @PostMapping("/lista")
    public RetornoFeedbacks postFeedbacks(@RequestBody ListaFeedbacks[] lista) {
        double totalVotos = 0, votos1 = 0, votos2 = 0, votos3 = 0,
                porcentagemVotos1 = 0, porcentagemVotos2 = 0, porcentagemVotos3 = 0;
        for (int i = 0; i < lista.length; i++) {
            totalVotos += 1;
            if (lista[i].getCd_feedback() == 1) {
                votos1 += 1;
            } else if (lista[i].getCd_feedback() == 2) {
                votos2 += 1;
            } else if (lista[i].getCd_feedback() == 3) {
                votos3 += 1;
            }
        }
        porcentagemVotos1 = (votos1 / totalVotos) * 100;
        porcentagemVotos2 = (votos2 / totalVotos) * 100;
        porcentagemVotos3 = (votos3 / totalVotos) * 100;
        porcentagemVotos1 = (int) porcentagemVotos1;
        porcentagemVotos2 = (int) porcentagemVotos2;
        porcentagemVotos3 = (int) porcentagemVotos3;

        String totVotos = "O total de votos é: " + totalVotos;
        String porcentVotos = ", 1-Boa: " + porcentagemVotos1 + "% / 2-Mediana: " + porcentagemVotos2 + "% / 3-Ruim: "
                + porcentagemVotos3 + "%";
        return new RetornoFeedbacks(totVotos, porcentVotos);
    }

}
