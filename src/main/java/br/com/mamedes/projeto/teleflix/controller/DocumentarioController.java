package br.com.mamedes.projeto.teleflix.controller;

import br.com.mamedes.projeto.teleflix.model.Documentario;
import br.com.mamedes.projeto.teleflix.service.DocumentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentario")

public class DocumentarioController {

    @Autowired
    private DocumentarioService service;

    @PostMapping
    public ResponseEntity<Documentario> salvar(@RequestBody Documentario documentario){
        documentario = service.salvar(documentario);
        return ResponseEntity.ok(documentario);
    }

    @PutMapping
    public ResponseEntity<Documentario> alterar(@RequestBody Documentario documentario){
        documentario = service.alterar(documentario);
        return ResponseEntity.ok(documentario);
    }

    @GetMapping
    public ResponseEntity<List<Documentario>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Documentario> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Documentario>> listarDocumentarioPorTitulo(@PathVariable String titulo){
        return ResponseEntity.ok(service.listarDocumentarioPorTitulo(titulo));
    }
}
