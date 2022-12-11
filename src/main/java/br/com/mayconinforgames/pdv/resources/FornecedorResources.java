package br.com.mayconinforgames.pdv.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
