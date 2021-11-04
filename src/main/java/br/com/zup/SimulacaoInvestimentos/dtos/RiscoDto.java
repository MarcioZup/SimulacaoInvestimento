package br.com.zup.SimulacaoInvestimentos.dtos;

public enum RiscoDto {
    ALTO(1.025) , MEDIO(1.015), BAIXO(1.005);

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
