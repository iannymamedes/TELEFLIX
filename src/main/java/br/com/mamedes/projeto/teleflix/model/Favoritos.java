package br.com.mamedes.projeto.teleflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Favoritos {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Usuario usuario;
    private Filme filme;

}
