package br.com.mayconinforgames.pdv.repositories;

import br.com.mayconinforgames.pdv.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
