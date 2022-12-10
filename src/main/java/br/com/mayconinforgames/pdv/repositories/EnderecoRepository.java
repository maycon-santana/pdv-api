package br.com.mayconinforgames.pdv.repositories;

import br.com.mayconinforgames.pdv.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
