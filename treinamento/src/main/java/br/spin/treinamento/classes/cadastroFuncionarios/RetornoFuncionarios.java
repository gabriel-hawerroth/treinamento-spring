package br.spin.treinamento.classes.cadastroFuncionarios;

public class RetornoFuncionarios {

    private ListaFuncionarios[] lista;
    private int totalFuncionarios;
    private double totalHomens;
    private double totalMulheres;
    private String porcentSexos;

    public RetornoFuncionarios(ListaFuncionarios[] lista, int totalFuncionarios, int totalHomens, int totalMulheres) {
        this.lista = lista;
        this.totalFuncionarios = totalFuncionarios;
        this.totalHomens = totalHomens;
        this.totalMulheres = totalMulheres;
    }

    public ListaFuncionarios[] getLista() {
        return lista;
    }

    public void setLista(ListaFuncionarios[] lista) {
        this.lista = lista;
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        this.totalFuncionarios = totalFuncionarios;
    }

    public double getTotalHomens() {
        return totalHomens;
    }

    public void setTotalHomens(double totalHomens) {
        this.totalHomens = totalHomens;
    }

    public double getTotalMulheres() {
        return totalMulheres;
    }

    public void setTotalMulheres(double totalMulheres) {
        this.totalMulheres = totalMulheres;
    }

    public String getPorcentSexos() {
        return porcentSexos;
    }

    public void setPorcentSexos(int totalHomens, int totalMulheres) {
        this.porcentSexos = "Total de homens é: " + totalHomens + " / " +
                (double) totalHomens / this.lista.length * 100 + "% | Total de mulheres: " +
                totalMulheres + " / " + (double) totalMulheres / this.lista.length * 100 + "%";
    }
}
