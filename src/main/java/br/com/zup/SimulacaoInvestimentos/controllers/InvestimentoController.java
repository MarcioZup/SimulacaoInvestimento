package br.com.zup.SimulacaoInvestimentos.controllers;

import br.com.zup.SimulacaoInvestimentos.dtos.InvestimentoDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvestimentoController {

    @PutMapping
    public InvestimentoDto cadastrarInvestimento(@RequestBody InvestimentoDto investimentoDto){
        return null;
    }

    @GetMapping
    public InvestimentoDto simularinvestimento(InvestimentoDto investimentoDto){

        return null;

    }

}
