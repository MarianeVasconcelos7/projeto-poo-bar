package tiopaulo.ufape.barsystem.service;

import org.springframework.stereotype.Service;
import tiopaulo.ufape.barsystem.model.Cliente;
import tiopaulo.ufape.barsystem.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }


    public List<Cliente> listarTodos() {
        return repository.findAll();
    }


    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }


    public void excluir(Long id) {
        repository.deleteById(id);
    }
}