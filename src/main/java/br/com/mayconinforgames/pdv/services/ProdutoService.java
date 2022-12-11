package br.com.mayconinforgames.pdv.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.dtos.ProdutoDTO;
import br.com.mayconinforgames.pdv.model.enums.Categoria;
import br.com.mayconinforgames.pdv.repositories.ProdutoRepository;
import br.com.mayconinforgames.pdv.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    
    @Autowired
    private FornecedorService fornecedorService;

    public Produto findById(Long id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto create(@Valid ProdutoDTO objDTO) {
		return produtoRepository.save(newProduto(objDTO));
	}
	
	public Produto update(Long id, @Valid ProdutoDTO objDTO) {
		objDTO.setId(id);
		Produto oldObj = findById(id);
		oldObj = newProduto(objDTO);
		return produtoRepository.save(oldObj);
	}
	
	private Produto newProduto(ProdutoDTO obj) {
		Fornecedor fornecedor = fornecedorService.findById(obj.getFornecedor());
		
		Produto produto = new Produto();
		if (obj.getId() != null) {
			produto.setId(obj.getId());
		}
		
		produto.setFornecedor(fornecedor);
		produto.setNome(obj.getNome());
		produto.setCodBarras(obj.getCodBarras());
		produto.setPrecoVenda(obj.getPrecoVenda());
		produto.setPrecoCompra(obj.getPrecoCompra());
		produto.setQuantidade(obj.getQuantidade());
		produto.setCategoria(Categoria.toEnum(obj.getCategoria()));
		return produto;
	}
	

}
