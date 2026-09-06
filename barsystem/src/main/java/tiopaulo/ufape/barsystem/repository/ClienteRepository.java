package tiopaulo.ufape.barsystem.repository;

import tiopaulo.ufape.barsystem.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}