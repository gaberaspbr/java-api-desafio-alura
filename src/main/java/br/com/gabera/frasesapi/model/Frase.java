package br.com.gabera.frasesapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="frases")
public class Frase {
    @Id
    private Long id;
    private String frase;
    private String personagem;
    private String titulo;
    private String poster;

    public Long getId() {
        return id;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPoster() {
        return poster;
    }
}
