package br.com.mayconinforgames.pdv.services;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.repositories.ClienteRepository;
import br.com.mayconinforgames.pdv.repositories.ProdutoRepository;
import br.com.mayconinforgames.pdv.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto findById(Long id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

}
