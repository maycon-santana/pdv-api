package br.com.mayconinforgames.pdv.repositories;

import br.com.mayconinforgames.pdv.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
