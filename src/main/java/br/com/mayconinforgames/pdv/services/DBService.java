package br.com.mayconinforgames.pdv.services;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.repositories.ClienteRepository;
import br.com.mayconinforgames.pdv.repositories.ProdutoRepository;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public void instanciaDB() {
    	Cliente c1 = new Cliente(null, "João", "joao@gmail.com", 
    			"99999999", "Rua A", "56000-000", "21", "Casa", "Centro", "PE", 
    			"Garanhuns", LocalDate.now(), "880.871.360-12", "19.097.147-2", null);
    	
    	clienteRepository.saveAll(Arrays.asList(c1));
    	
        
    }

}
