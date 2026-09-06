package tiopaulo.ufape.barsystem.service;

import org.springframework.stereotype.Service;
import tiopaulo.ufape.barsystem.model.Pedido;
import tiopaulo.ufape.barsystem.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository repository;


    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }


    public List<Pedido> listarTodos() {
        return repository.findAll();
    }


    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }
}