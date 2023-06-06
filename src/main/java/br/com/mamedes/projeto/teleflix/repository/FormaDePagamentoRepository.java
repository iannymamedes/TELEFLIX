package br.com.mamedes.projeto.teleflix.repository;

import br.com.mamedes.projeto.teleflix.model.FormaDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaDePagamentoRepository extends JpaRepository<FormaDePagamento, Integer> {
}
