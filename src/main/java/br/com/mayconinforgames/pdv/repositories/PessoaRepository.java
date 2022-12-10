package br.com.mayconinforgames.pdv.repositories;

import br.com.mayconinforgames.pdv.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
