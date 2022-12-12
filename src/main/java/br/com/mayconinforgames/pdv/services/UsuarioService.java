package br.com.mayconinforgames.pdv.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Usuario;
import br.com.mayconinforgames.pdv.model.dtos.UsuarioDTO;
import br.com.mayconinforgames.pdv.repositories.UsuarioRepository;
import br.com.mayconinforgames.pdv.services.exceptions.DataIntegrityViolationException;
import br.com.mayconinforgames.pdv.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
	}

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario create(UsuarioDTO objDTO) {
		objDTO.setId(null);
		objDTO.setSenha(encoder.encode(objDTO.getSenha()));
		validarPorEmail(objDTO);
		Usuario newObj = new Usuario(objDTO);
		return usuarioRepository.save(newObj);
	}
	
	public Usuario update(Long id, @Valid UsuarioDTO objDTO) {
		objDTO.setId(id);
		Usuario oldObj = findById(id);
		validarPorEmail(objDTO);
		oldObj = new Usuario(objDTO);
		return usuarioRepository.save(oldObj);
	}
	
	public void delete(Long id) {
		Usuario obj = findById(id);
		usuarioRepository.deleteById(id);
	}	
	
	private void validarPorEmail(UsuarioDTO objDTO) {
		Optional<Usuario> obj = usuarioRepository.findByEmail(objDTO.getEmail());
		if (obj.isPresent() && obj.get().getId() != objDTO.getId()) {
			throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
		}
		
	}

}
