package br.spin.treinamento.classes;

public class OperacaoCalculadora {

    private Double num1;
    private Double num2;

    // 1 - Soma | 2 - Subtração | 3 - Divisão | 4 - Multiplicação
    private Integer operacao;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Integer getOperacao() {
        return operacao;
    }

    public void setOperacao(Integer operacao) {
        this.operacao = operacao;
    }
}
