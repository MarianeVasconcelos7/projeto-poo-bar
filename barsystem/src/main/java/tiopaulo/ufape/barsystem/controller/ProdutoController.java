package tiopaulo.ufape.barsystem.controller;

import org.springframework.web.bind.annotation.*;
import tiopaulo.ufape.barsystem.model.Produto;
import tiopaulo.ufape.barsystem.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private final ProdutoService service;


    public ProdutoController(ProdutoService service) {
        this.service = service;
    }


    @GetMapping
    public List<Produto> listar() {
        return service.listarTodos();
    }


    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

}