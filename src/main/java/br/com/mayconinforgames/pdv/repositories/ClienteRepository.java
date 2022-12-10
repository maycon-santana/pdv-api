package br.com.mayconinforgames.pdv.repositories;

import br.com.mayconinforgames.pdv.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
