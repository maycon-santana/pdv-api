package br.com.mayconinforgames.pdv.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Fornecedor;
import br.com.mayconinforgames.pdv.model.dtos.FornecedorDTO;
import br.com.mayconinforgames.pdv.model.enums.Categoria;
import br.com.mayconinforgames.pdv.repositories.FornecedorRepository;
import br.com.mayconinforgames.pdv.services.exceptions.DataIntegrityViolationException;
import br.com.mayconinforgames.pdv.services.exceptions.ObjectNotFoundException;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor findById(Long id) {
        Optional<Fornecedor> obj = fornecedorRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }

	public List<Fornecedor> findAll() {
		return fornecedorRepository.findAll();
	}

	public Fornecedor create(@Valid FornecedorDTO objDTO) {
		validarPorCNPJ(objDTO);
		return fornecedorRepository.save(newFornecedor(objDTO));
	}

	private void validarPorCNPJ(FornecedorDTO objDTO) {
		Optional<Fornecedor> obj = fornecedorRepository.findByCnpj(objDTO.getCnpj());
		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
			throw new DataIntegrityViolationException("CNPJ já cadastrado no sistema!");
		}
	}
	
	private Fornecedor newFornecedor(FornecedorDTO obj) {
		Fornecedor fornecedor = new Fornecedor();
		
		if (obj.getId() != null) {
			fornecedor.setId(obj.getId());
		}
		
		fornecedor.setNome(obj.getNome());
		fornecedor.setEmail(obj.getEmail());
		fornecedor.setTelefone(obj.getTelefone());
		fornecedor.setCnpj(obj.getCnpj());
		fornecedor.setInscEstadual(obj.getInscEstadual());
		fornecedor.setInscMunicipal(obj.getInscMunicipal());
		fornecedor.setNomeFantasia(obj.getNomeFantasia());
		fornecedor.setRazaoSocial(obj.getRazaoSocial());
		fornecedor.setCategoria(Categoria.toEnum(obj.getCategoria()));
		fornecedor.setLogradouro(obj.getLogradouro());
		fornecedor.setCep(obj.getCep());
		fornecedor.setNumero(obj.getNumero());
		fornecedor.setComplemento(obj.getComplemento());
		fornecedor.setBairro(obj.getBairro());
		fornecedor.setUf(obj.getUf());
		fornecedor.setCidade(obj.getCidade());
		fornecedor.setDataCriacao(obj.getDataCriacao());
		return fornecedor;
	}

}
