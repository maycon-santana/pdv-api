package br.com.mayconinforgames.pdv.model.dtos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.mayconinforgames.pdv.model.Usuario;
import br.com.mayconinforgames.pdv.model.enums.Perfil;

public class UsuarioDTO {

	private Long id;

	@NotNull(message = "O campo E-MAIL é requerido")
	@Column(unique = true)
	private String email;

	@NotNull(message = "O campo SENHA é requerido")
	private String senha;

	private Set<Integer> perfis = new HashSet<>();

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCriacao = LocalDate.now();

	public UsuarioDTO() {
		super();
		addPerfil(Perfil.ATENDENTE);
	}

	public UsuarioDTO(Usuario obj) {
		super();
		this.id = obj.getId();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.perfis = obj.getPerfis().stream().map(x -> x.getCodigo()).collect(Collectors.toSet());
		this.dataCriacao = obj.getDataCriacao();
		addPerfil(Perfil.ATENDENTE);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Set<Perfil> getPerfis() {
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
	}

	public void addPerfil(Perfil perfil) {
		this.perfis.add(perfil.getCodigo());
	}

}
