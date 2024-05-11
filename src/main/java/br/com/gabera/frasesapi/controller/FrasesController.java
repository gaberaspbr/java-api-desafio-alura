package br.com.gabera.frasesapi.controller;

import br.com.gabera.frasesapi.dto.FrasesDTO;
import br.com.gabera.frasesapi.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/series")
public class FrasesController {
    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FrasesDTO obterFrases(Long seed){
        return servico.obterFrase();
    }
}
