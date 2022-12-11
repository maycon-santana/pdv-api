package br.com.mayconinforgames.pdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.mayconinforgames.pdv.model.enums.Categoria;

@Entity
@Table(name = "fornecedor")
@PrimaryKeyJoinColumn(name = "id")
public class Fornecedor extends Pessoa {

	private static final long serialVersionUID = 1L;

	private String cnpj;
	private String inscEstadual;
	private String inscMunicipal;
	private String nomeFantasia;
	private String razaoSocial;
	private Categoria categoria;

	@JsonIgnore
	@OneToMany(mappedBy = "fornecedor", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Produto> produtos = new ArrayList<Produto>();

	public Fornecedor() {
	}

	public Fornecedor(Long id, String nome, String email, String telefone, 
			String logradouro, String cep, String numero, String complemento, String bairro, String uf, String cidade) {
		super(id, nome, email, telefone, logradouro, cep, numero, complemento, bairro, uf, cidade);
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
