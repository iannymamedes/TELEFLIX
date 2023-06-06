package br.com.mamedes.projeto.teleflix.model.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioDTO {

    private int id;
    private String login;
    private Integer anoNascimento;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
}
