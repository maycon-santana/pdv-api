package br.com.mayconinforgames.pdv.resources;

import br.com.mayconinforgames.pdv.model.Cliente;
import br.com.mayconinforgames.pdv.model.dtos.ClienteDTO;
import br.com.mayconinforgames.pdv.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pdv/api/clientes")
public class ClienteResources {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDTO> findById(@PathVariable Long id) {
        Cliente obj = clienteService.findById(id);
        return ResponseEntity.ok().body(new ClienteDTO(obj));
    }

}
