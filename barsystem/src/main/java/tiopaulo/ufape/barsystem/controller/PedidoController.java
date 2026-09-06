package tiopaulo.ufape.barsystem.controller;


import org.springframework.web.bind.annotation.*;
import tiopaulo.ufape.barsystem.model.Pedido;
import tiopaulo.ufape.barsystem.service.PedidoService;

import java.util.List;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {


    private final PedidoService service;


    public PedidoController(PedidoService service) {
        this.service = service;
    }


    @GetMapping
    public List<Pedido> listar() {
        return service.listarTodos();
    }


    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }

}