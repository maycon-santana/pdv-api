package br.com.mayconinforgames.pdv.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.dtos.ProdutoDTO;
import br.com.mayconinforgames.pdv.services.ProdutoService;

@RestController
@RequestMapping(value = "/pdv/api/produtos")
public class ProdutoResources {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id) {
        Produto obj = produtoService.findById(id);
        return ResponseEntity.ok().body(new ProdutoDTO(obj));
    }
    
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll() {
    	List<Produto> list = produtoService.findAll();
    	List<ProdutoDTO> listDTO = list.stream().map(obj -> new ProdutoDTO(obj)).collect(Collectors.toList());
    	return ResponseEntity.ok().body(listDTO);
    }
    
    @PostMapping
    public ResponseEntity<ProdutoDTO> create(@Valid @RequestBody ProdutoDTO objDTO) {
    	Produto obj = produtoService.create(objDTO);
    	URI uri = ServletUriComponentsBuilder
    			.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
    	return ResponseEntity.created(uri).build();
    }

    
    
}
