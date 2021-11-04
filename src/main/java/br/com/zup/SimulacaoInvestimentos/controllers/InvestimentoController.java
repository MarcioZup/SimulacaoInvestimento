package br.com.zup.SimulacaoInvestimentos.controllers;

import br.com.zup.SimulacaoInvestimentos.dtos.InvestimentoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestimentoController {

    @PostMapping
    public InvestimentoDto cadastrarInvestimento(@RequestBody InvestimentoDto investimentoDto){
        InvestimentoDto dadosInvestimento = new InvestimentoDto();
        return dadosInvestimento;
    }

    @GetMapping
    public InvestimentoDto simularinvestimento(InvestimentoDto investimentoDto){

        return null;

    }

}
