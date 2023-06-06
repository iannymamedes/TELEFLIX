package br.com.mamedes.projeto.teleflix.service;


import br.com.mamedes.projeto.teleflix.model.Genero;
import br.com.mamedes.projeto.teleflix.repository.GeneroRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public Genero alterar(Genero genero) {
        if (Objects.nonNull(genero.getId())){
            genero = repository.save(genero);
        } else {
            throw new NotFoundException();
        }
        return genero;
    }

    public List<Genero> listar() {
        return repository.findAll();
    }

    public Genero consultarPorId(Integer id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
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
