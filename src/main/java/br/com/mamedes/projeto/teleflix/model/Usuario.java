package br.com.mamedes.projeto.teleflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

public class Usuario {

    @Id
    @GeneratedValue
    private int id;
    private String login;
    @NotNull
    private int anoNascimento;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    @OneToMany
    private List<Favoritos> listaFavoritos;
}
