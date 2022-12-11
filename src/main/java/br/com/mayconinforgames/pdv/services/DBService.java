package br.com.mayconinforgames.pdv.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.enums.Categoria;
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
    	Cliente c1 = new Cliente(null, "João", "joao@gmail.com", 
    			"99999999", "Rua A", "56000-000", "21", "Casa", "Centro", "PE", 
    			"Garanhuns", LocalDate.now(), "880.871.360-12", "19.097.147-2", null);
    	
    	Fornecedor f1 = new Fornecedor(null, "Ze", "ze@gmail.com", "88888888", "Rua A", "5555555", "30", "Casa", "Centro", "PE", "Garanhuns", LocalDate.now(), "AA", "bbb", "888", "we", "88", Categoria.BEBIDAS);
    	
    	Produto p1 = new Produto(null, "Açucar 1KG", "4444", new BigDecimal("4.7"), new BigDecimal("3.3"), 50, Categoria.CEREAIS_GRAOS, f1);
    	
    	clienteRepository.saveAll(Arrays.asList(c1));
    	fornecedorRepository.saveAll(Arrays.asList(f1));
    	produtoRepository.saveAll(Arrays.asList(p1));
        
    	
    }

}
