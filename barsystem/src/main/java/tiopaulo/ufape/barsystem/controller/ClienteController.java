package tiopaulo.ufape.barsystem.controller;

import org.springframework.web.bind.annotation.*;
import tiopaulo.ufape.barsystem.model.Cliente;
import tiopaulo.ufape.barsystem.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;


    public ClienteController(ClienteService service) {
        this.service = service;
    }


    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }


    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}