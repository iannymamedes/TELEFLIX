package br.com.mamedes.projeto.teleflix.controller;


import br.com.mamedes.projeto.teleflix.model.Favoritos;
import br.com.mamedes.projeto.teleflix.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/favoritos")

public class FavoritosController {

    @Autowired
    private FavoritosService service;

    @PostMapping
    public ResponseEntity<Favoritos> salvar(@RequestBody Favoritos favoritos){
        favoritos = service.salvar(favoritos);
        return ResponseEntity.ok(favoritos);
    }
    @PutMapping
    public ResponseEntity<Favoritos> alterar(@RequestBody Favoritos favoritos){
        favoritos = service.alterar(favoritos);
        return ResponseEntity.ok(favoritos);
    }

    @GetMapping
    public ResponseEntity<List<Favoritos>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favoritos> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if (service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
