package br.com.gabera.frasesapi.dto;

public record FrasesDTO(Long id,
                        String frase,
                        String personagem,
                        String titulo,
                        String poster) {
}
