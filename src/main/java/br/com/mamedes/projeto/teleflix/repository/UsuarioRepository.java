package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    public List<Usuario> findUsuarioByCpf(String cpf);
    public List<Usuario> deleteUsuarioByCpf(String cpf);
}
