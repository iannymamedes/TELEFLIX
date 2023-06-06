package br.com.mamedes.projeto.teleflix.model;


import br.com.mamedes.projeto.teleflix.enumeration.ChavePix;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_formadepagamento")
public class FormaDePagamento implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "dsd_cartao", length = 500)
    @Embedded
    private Cartao cartao;

    @Enumerated @NotEmpty
    private ChavePix pix;
    private Integer cartaoCredito;
    private String parceiros;
}
