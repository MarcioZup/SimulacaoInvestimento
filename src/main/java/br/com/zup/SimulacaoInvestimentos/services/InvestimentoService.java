package br.com.zup.SimulacaoInvestimentos.services;

import br.com.zup.SimulacaoInvestimentos.dtos.InvestimentoDto;
import br.com.zup.SimulacaoInvestimentos.dtos.RetornoInvestimentoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    private List<InvestimentoDto> investimentos = new ArrayList<>();



    public RetornoInvestimentoDto calcularInvestimento(InvestimentoDto investimentoDto) {
        investimentos.add(investimentoDto);
        double montante = investimentoDto.getValorPrevisto() * Math.pow(investimentoDto.getRisco().getTaxaDeRetorno(),investimentoDto.getPeriodoDeAplicacaoMeses() );
        RetornoInvestimentoDto retorno = new RetornoInvestimentoDto(investimentoDto.getValorPrevisto(),(montante - investimentoDto.getValorPrevisto()), montante);
        return retorno;
    }
}
