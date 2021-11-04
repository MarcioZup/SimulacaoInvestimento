package br.com.zup.SimulacaoInvestimentos.dtos;

public class InvestimentoDto {

    private String nome;
    private String email;
    private String cpf;
    private double valorPrevisto;
    private int periodoDeAplicacaoMeses;
    private RiscoDto risco;

    public InvestimentoDto() {
    }

    public InvestimentoDto(String nome, String email, String cpf, double valorPrevisto, int periodoDeAplicacaoMeses, RiscoDto risco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.valorPrevisto = valorPrevisto;
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
        this.risco = risco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(double valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public int getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(int periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public RiscoDto getRisco() {
        return risco;
    }

    public void setRisco(RiscoDto risco) {
        this.risco = risco;
    }
}
