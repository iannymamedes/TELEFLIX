package br.com.mamedes.projeto.teleflix.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_serie")

public class Serie implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String titulo;
    private Integer ano;
    private String temporada;
    private String episodio;

    @Column(name= "ds_sinopse", length = 500)
    private String sinopse;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
