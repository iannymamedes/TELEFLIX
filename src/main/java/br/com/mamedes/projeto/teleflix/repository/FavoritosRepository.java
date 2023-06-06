package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritos, Integer> {
}
