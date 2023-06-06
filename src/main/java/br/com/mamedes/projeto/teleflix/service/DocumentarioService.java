package br.com.mamedes.projeto.teleflix.service;

import br.com.mamedes.projeto.teleflix.model.Documentario;
import br.com.mamedes.projeto.teleflix.repository.DocumentarioRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service

public class DocumentarioService {

    @Autowired
    private DocumentarioRepository repository;

    public Documentario salvar(Documentario documentario){
        documentario = repository.save(documentario);
        return documentario;
    }

    public Documentario alterar(Documentario documentario){
        if(Objects.nonNull(documentario.getId())){
            documentario = repository.save(documentario);
        }else{
            throw new NotFoundException();
        }
        return documentario;
    }

    public List<Documentario> listar(){
        return repository.findAll();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }

    public Documentario consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }


    public List<Documentario> listarDocumentarioPorTitulo(String titulo){
        return repository.findDocumentarioByTitulo(titulo);
    }
}
