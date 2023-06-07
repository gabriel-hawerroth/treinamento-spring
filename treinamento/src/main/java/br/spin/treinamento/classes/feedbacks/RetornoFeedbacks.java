package br.spin.treinamento.classes.feedbacks;

public class RetornoFeedbacks {

    private String totalVotos;
    private String porcentagemVotos;

    public RetornoFeedbacks(String totalVotos, String porcentagemVotos) {
        this.totalVotos = totalVotos;
        this.porcentagemVotos = porcentagemVotos;
    }

    public String getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(String totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getPorcentagemVotos() {
        return porcentagemVotos;
    }

    public void setPorcentagemVotos(String porcentagemVotos) {
        this.porcentagemVotos = porcentagemVotos;
    }

}
