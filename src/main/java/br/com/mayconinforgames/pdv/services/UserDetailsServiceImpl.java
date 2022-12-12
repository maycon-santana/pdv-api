package br.com.mayconinforgames.pdv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.mayconinforgames.pdv.model.Usuario;
import br.com.mayconinforgames.pdv.repositories.UsuarioRepository;
import br.com.mayconinforgames.pdv.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> user = usuarioRepository.findByEmail(email);
		if (user.isPresent()) {
			return new UserSS(user.get().getId(), user.get().getSenha(), user.get().getEmail(), user.get().getPerfis());
		}

		throw new UsernameNotFoundException(email);
	}

}
