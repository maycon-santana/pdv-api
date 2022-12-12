package br.com.mayconinforgames.pdv.services;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.Usuario;
import br.com.mayconinforgames.pdv.model.enums.Categoria;
import br.com.mayconinforgames.pdv.repositories.ClienteRepository;
import br.com.mayconinforgames.pdv.repositories.FornecedorRepository;
import br.com.mayconinforgames.pdv.repositories.ProdutoRepository;
import br.com.mayconinforgames.pdv.repositories.UsuarioRepository;

@Service
public class DBService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {
		
		Usuario u1 = new Usuario(null, "teste@gmail.com", encoder.encode("123"));
		
		Cliente c1 = new Cliente(null, "Pedro", "pedro@gmail.com", "9999999", "Rua A", "77777777", "20", "Casa", "Centro", "PE", "Garanhuns", "937.325.740-40", "44.433.685-0", null);

		Fornecedor f1 = new Fornecedor(null, "Zé", "ze@gmail.com", "766666777", "Rua b", "543434", "100", "Casa", "Centro", "Pe", "Garanhuns", "93.369.609/0001-13", "786", "45", "João de Bolinhas", "Bolinhas", Categoria.CEREAIS_GRAOS);

		Produto p1 = new Produto(null, "Açucar 1kg", "987", new BigDecimal("4.79"), new BigDecimal("3.7"), 100, Categoria.CEREAIS_GRAOS, f1);
		
		usuarioRepository.saveAll(Arrays.asList(u1));
		clienteRepository.saveAll(Arrays.asList(c1));
		fornecedorRepository.saveAll(Arrays.asList(f1));
		produtoRepository.saveAll(Arrays.asList(p1));
		
	}

}
