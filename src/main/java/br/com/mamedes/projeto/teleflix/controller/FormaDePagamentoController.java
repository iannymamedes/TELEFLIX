package br.com.mamedes.projeto.teleflix.controller;


import br.com.mamedes.projeto.teleflix.model.FormaDePagamento;
import br.com.mamedes.projeto.teleflix.service.FormaDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formadepagamento")
public class FormaDePagamentoController {

    @Autowired
    private FormaDePagamentoService service;

    @PostMapping
    public ResponseEntity<FormaDePagamento> salvar(@RequestBody FormaDePagamento formaDePagamento){
        formaDePagamento = service.salvar(formaDePagamento);
        return ResponseEntity.ok(formaDePagamento);
    }
    @PutMapping
    public ResponseEntity<FormaDePagamento> alterar(@RequestBody FormaDePagamento formaDePagamento){
        formaDePagamento = service.alterar(formaDePagamento);
        return ResponseEntity.ok(formaDePagamento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaDePagamento> consultar(@PathVariable("id") Integer id){
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
