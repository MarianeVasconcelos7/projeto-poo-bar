package tiopaulo.ufape.barsystem.service;

import org.springframework.stereotype.Service;
import tiopaulo.ufape.barsystem.model.Produto;
import tiopaulo.ufape.barsystem.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;


    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    public List<Produto> listarTodos() {
        return repository.findAll();
    }


    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }
}