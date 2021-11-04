package br.com.zup.SimulacaoInvestimentos.dtos;

public class RetornoInvestimentoDto {

    private double valorPrevisto;
    private double valorTotalDoLucro;
    private double valorTotal;

    public RetornoInvestimentoDto() {
    }

    public RetornoInvestimentoDto(double valorPrevisto, double valorTotalDoLucro, double valorTotal) {
        this.valorPrevisto = valorPrevisto;
        this.valorTotalDoLucro = valorTotalDoLucro;
        this.valorTotal = valorTotal;
    }

    public double getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(double valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public double getValorTotalDoLucro() {
        return valorTotalDoLucro;
    }

    public void setValorTotalDoLucro(double valorTotalDoLucro) {
        this.valorTotalDoLucro = valorTotalDoLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
