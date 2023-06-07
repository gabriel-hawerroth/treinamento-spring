package br.spin.treinamento.classes.listaSalarios;

public class RetornoSalarios {

    private ListaSalarios[] listaSalarios;
    private String media;
    private String maiorSalario;

    public RetornoSalarios(ListaSalarios[] listaSalarios, String media, String maiorSalario) {
        this.listaSalarios = listaSalarios;
        this.media = media;
        this.maiorSalario = maiorSalario;
    }

    public ListaSalarios[] getListaSalarios() {
        return listaSalarios;
    }

    public void setListaSalarios(ListaSalarios[] listaSalarios) {
        this.listaSalarios = listaSalarios;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMaiorSalario() {
        return maiorSalario;
    }

    public void setMaiorSalario(String maiorSalario) {
        this.maiorSalario = maiorSalario;
    }

}
