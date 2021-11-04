package br.com.zup.SimulacaoInvestimentos.controllers;

import br.com.zup.SimulacaoInvestimentos.dtos.InvestimentoDto;
import br.com.zup.SimulacaoInvestimentos.dtos.RetornoInvestimentoDto;
import br.com.zup.SimulacaoInvestimentos.services.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InvestimentoController {

    @Autowired
    InvestimentoService investimentoService;

    @PutMapping
    public RetornoInvestimentoDto cadastrarInvestimento(@RequestBody @Valid InvestimentoDto investimentoDto){
        return
    }

}
