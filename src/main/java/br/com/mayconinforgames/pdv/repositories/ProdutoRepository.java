package br.com.mayconinforgames.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mayconinforgames.pdv.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
