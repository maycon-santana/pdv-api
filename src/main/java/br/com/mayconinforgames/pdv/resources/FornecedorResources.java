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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.model.dtos.FornecedorDTO;
import br.com.mayconinforgames.pdv.services.FornecedorService;

@RestController
@RequestMapping(value = "/pdv/api/fornecedores")
public class FornecedorResources {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FornecedorDTO> findById(@PathVariable Long id) {
        Fornecedor obj = fornecedorService.findById(id);
        return ResponseEntity.ok().body(new FornecedorDTO(obj));
    }

    @GetMapping
	public ResponseEntity<List<FornecedorDTO>> findAll() {
		List<Fornecedor> list = fornecedorService.findAll();
		List<FornecedorDTO> listDTO = list.stream().map(obj -> new FornecedorDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
    

    @PostMapping
	public ResponseEntity<FornecedorDTO> create(@Valid @RequestBody FornecedorDTO objDTO) {
		Fornecedor newObj = fornecedorService.create(objDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<FornecedorDTO> update(@PathVariable Long id, @Valid @RequestBody FornecedorDTO objDTO) {
    	Fornecedor newObj = fornecedorService.update(id, objDTO);
    	return ResponseEntity.ok().body(new FornecedorDTO(newObj));
    }
    
}
