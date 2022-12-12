package br.com.mayconinforgames.pdv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.repositories.FornecedorRepository;
import br.com.mayconinforgames.pdv.services.exceptions.ObjectNotFoundException;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor findById(Long id) {
        Optional<Fornecedor> obj = fornecedorRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

	public List<Fornecedor> findAll() {
		return fornecedorRepository.findAll();
	}

}
