package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero,Integer> {
}
