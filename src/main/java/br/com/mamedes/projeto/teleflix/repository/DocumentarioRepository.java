package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.Documentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentarioRepository extends JpaRepository<Documentario, Integer> {

    public List<Documentario> findDocumentarioByTitulo(String titulo);
    public List<Documentario> findDocumentarioByTituloOrderByTituloAsc(String titulo);
    public List<Documentario> findDocumentarioByTituloAndSinopse(String titulo, String sinopse);
    public List<Documentario> findDocumentarioByTituloLike(String titulo);

}
