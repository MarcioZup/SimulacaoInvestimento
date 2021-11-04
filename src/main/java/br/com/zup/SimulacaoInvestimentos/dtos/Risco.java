package br.com.zup.SimulacaoInvestimentos.dtos;

public enum Risco {
    ALTO(0.25) , MEDIO(0.15), BAIXO(0.05);

    private double taxaDeRetorno;

    Risco(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

    public void setTaxaDeRetorno(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }
}
