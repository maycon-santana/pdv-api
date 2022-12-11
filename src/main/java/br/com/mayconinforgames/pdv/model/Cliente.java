package br.com.mayconinforgames.pdv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.br.CPF;

import br.com.mayconinforgames.pdv.model.dtos.ClienteDTO;

@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "id")
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;

	@CPF
	@Column(unique = true)
	private String cpf;

	@Column(unique = true)
	private String rg;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, String email, String telefone, String logradouro, String cep, String numero,
			String complemento, String bairro, String uf, String cidade, String cpf, String rg, Date dataNascimento) {
		super(id, nome, email, telefone, logradouro, cep, numero, complemento, bairro, uf, cidade);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public Cliente(ClienteDTO obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
		this.telefone = obj.getTelefone();
		this.logradouro = obj.getLogradouro();
		this.cep = obj.getCep();
		this.numero = obj.getNumero();
		this.complemento = obj.getComplemento();
		this.bairro = obj.getBairro();
		this.uf = obj.getUf();
		this.cidade = obj.getCidade();
		this.dataCriacao = obj.getDataCriacao();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
