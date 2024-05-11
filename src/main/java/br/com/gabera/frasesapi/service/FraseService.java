package br.com.gabera.frasesapi.service;

import br.com.gabera.frasesapi.dto.FrasesDTO;
import br.com.gabera.frasesapi.model.Frase;
import br.com.gabera.frasesapi.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FrasesDTO obterFrase(){
        Frase frase = repositorio.retornaFrase();
        return new FrasesDTO(frase.getId(), frase.getFrase(), frase.getPersonagem(), frase.getTitulo(),frase.getPoster());
    }
}
