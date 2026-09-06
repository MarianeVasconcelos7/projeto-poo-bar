package tiopaulo.ufape.barsystem.repository;

import tiopaulo.ufape.barsystem.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}