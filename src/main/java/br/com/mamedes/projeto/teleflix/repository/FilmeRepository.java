package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {

    public List<Filme> findFilmeByTitulo(String titulo);
    public List<Filme> findFilmeByTituloOrderByTituloAsc(String titulo);
    public List<Filme> findFilmeByTituloAndSinopse(String titulo, String sinopse);
    public List<Filme> findFilmeByTituloLike(String titulo);


}
