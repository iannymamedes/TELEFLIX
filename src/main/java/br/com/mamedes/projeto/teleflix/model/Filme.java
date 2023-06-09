package br.com.mamedes.projeto.teleflix.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")

public class Filme  implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private Integer ano;
    private String duracao;
    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;
    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
