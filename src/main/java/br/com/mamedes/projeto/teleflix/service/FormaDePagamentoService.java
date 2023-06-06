package br.com.mamedes.projeto.teleflix.service;


import br.com.mamedes.projeto.teleflix.model.FormaDePagamento;
import br.com.mamedes.projeto.teleflix.repository.FormaDePagamentoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class FormaDePagamentoService {

    @Autowired
    private FormaDePagamentoRepository repository;

    public FormaDePagamento salvar(FormaDePagamento formaDePagamento){
        return repository.save(formaDePagamento);
    }
    public FormaDePagamento alterar( FormaDePagamento formaDePagamento){
        if(Objects.nonNull(formaDePagamento.getId())){
            formaDePagamento = repository.save(formaDePagamento);
        }else {
            throw new NotFoundException();
        }
        return formaDePagamento;
    }
    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        } catch (Exception e){
            log.info("Erro ao realizar Exclusão: " , e);
            return false;
        }
        return true;
    }
    public FormaDePagamento consultarPorId(Integer id){
        return (FormaDePagamento) repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
