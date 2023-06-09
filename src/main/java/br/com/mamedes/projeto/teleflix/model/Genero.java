package br.com.mamedes.projeto.teleflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@Entity
@Table(name = "tb_genero")

public class Genero implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String genero;

}
