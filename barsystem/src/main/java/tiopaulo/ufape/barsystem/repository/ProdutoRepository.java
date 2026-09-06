package tiopaulo.ufape.barsystem.repository;

import tiopaulo.ufape.barsystem.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}