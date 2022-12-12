package br.com.mayconinforgames.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mayconinforgames.pdv.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
