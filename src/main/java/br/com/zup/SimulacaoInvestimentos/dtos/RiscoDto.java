package br.com.zup.SimulacaoInvestimentos.dtos;

public enum RiscoDto {
    ALTO(0.025) , MEDIO(0.015), BAIXO(0.005);

    private double taxaDeRetorno;

    RiscoDto(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }

    public double getTaxaDeRetorno() {
        return taxaDeRetorno;
    }

    public void setTaxaDeRetorno(double taxaDeRetorno) {
        this.taxaDeRetorno = taxaDeRetorno;
    }
}
