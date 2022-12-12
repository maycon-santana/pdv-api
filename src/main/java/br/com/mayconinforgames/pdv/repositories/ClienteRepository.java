package br.com.mayconinforgames.pdv.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mayconinforgames.pdv.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Optional<Cliente> findByCpf(String cpf);
	
	Optional<Cliente> findByRg(String rg);
	
}
