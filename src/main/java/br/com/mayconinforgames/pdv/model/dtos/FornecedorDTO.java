package br.com.mayconinforgames.pdv.model.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.mayconinforgames.pdv.model.Fornecedor;

public class FornecedorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull(message = "O campo NOME é requerido")
	private String nome;

	private String email;

	@NotNull(message = "O campo TELEFONE é requerido")
	private String telefone;

	@NotNull(message = "O campo CNPJ é requerido")
	private String cnpj;
	
	private String inscEstadual;
	
	private String inscMunicipal;
	
	@NotNull(message = "O campo NOME FANTASIA é requerido")
	private String nomeFantasia;
	
	@NotNull(message = "O campo RAZÂO SOCIAL é requerido")
	private String razaoSocial;
	
	@NotNull(message = "O campo CATEGORIA é requerido")
	private Integer categoria;

	@NotNull(message = "O campo LOGRADOURO é requerido")
	private String logradouro;

	@NotNull(message = "O campo CEP é requerido")
	private String cep;

	@NotNull(message = "O campo NÚMERO é requerido")
	private String numero;

	@NotNull(message = "O campo COMPLEMENTO é requerido")
	private String complemento;

	@NotNull(message = "O campo BAIRRO é requerido")
	private String bairro;

	@NotNull(message = "O campo UF é requerido")
	private String uf;

	@NotNull(message = "O campo CIDADE é requerido")
	private String cidade;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCriacao = LocalDate.now();

	public FornecedorDTO() {
		super();
	}

	public FornecedorDTO(Fornecedor obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
		this.telefone = obj.getTelefone();
		this.cnpj = obj.getCnpj();
		this.inscEstadual = obj.getInscEstadual();
		this.inscMunicipal = obj.getInscMunicipal();
		this.nomeFantasia = obj.getNomeFantasia();
		this.razaoSocial = obj.getRazaoSocial();
		this.categoria = obj.getCategoria().getCodigo();
		this.logradouro = obj.getLogradouro();
		this.cep = obj.getCep();
		this.numero = obj.getNumero();
		this.complemento = obj.getComplemento();
		this.bairro = obj.getBairro();
		this.uf = obj.getUf();
		this.cidade = obj.getCidade();
		this.dataCriacao = obj.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
