package br.com.zup.SimulacaoInvestimentos.controllers;

import br.com.zup.SimulacaoInvestimentos.dtos.InvestimentoDto;
import br.com.zup.SimulacaoInvestimentos.services.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvestimentoController {

    @Autowired
    InvestimentoService investimentoService;

    @PutMapping
    public InvestimentoDto cadastrarInvestimento(@RequestBody InvestimentoDto investimentoDto){
        investimentoService.calcularInvestimento(investimentoDto);
        return investimentoDto;
    }



}
