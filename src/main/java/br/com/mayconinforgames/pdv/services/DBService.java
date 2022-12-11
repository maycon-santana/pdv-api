package br.com.mayconinforgames.pdv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.repositories.ClienteRepository;
import br.com.mayconinforgames.pdv.repositories.FornecedorRepository;
import br.com.mayconinforgames.pdv.repositories.ProdutoRepository;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Autowired
    private FornecedorRepository fornecedorRepository;
    
    public void instanciaDB() {
    	
    }

}
