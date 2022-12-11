package br.com.mayconinforgames.pdv.resources;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.dtos.ClienteDTO;
import br.com.mayconinforgames.pdv.model.dtos.ProdutoDTO;
import br.com.mayconinforgames.pdv.services.ClienteService;
import br.com.mayconinforgames.pdv.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
