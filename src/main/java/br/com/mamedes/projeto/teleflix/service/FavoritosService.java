package br.com.mamedes.projeto.teleflix.service;


import br.com.mamedes.projeto.teleflix.model.Favoritos;
import br.com.mamedes.projeto.teleflix.repository.FavoritosRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;
    public Favoritos salvar(Favoritos favoritos) {
        return repository.save(favoritos);
    }

    public Favoritos alterar(Favoritos favoritos) {
        if (Objects.nonNull(favoritos.getId())){
            favoritos = repository.save(favoritos);
        } else {
            throw new NotFoundException();
        }
        return favoritos;
    }

    public List<Favoritos> listar() {
        return repository.findAll();
    }

    public Favoritos consultarPorId(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public boolean excluir(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e){
            log.info("Erro ao realizar Exclusão: " , e);
            return false;
        }
        return true;
    }
}
