package br.com.mayconinforgames.pdv.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "id")
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String rg;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, String email, String telefone, String logradouro, String cep, String numero,
			String complemento, String bairro, String uf, String cidade, LocalDate dataCriacao, String cpf, String rg,
			Date dataNascimento) {
		super(id, nome, email, telefone, logradouro, cep, numero, complemento, bairro, uf, cidade, dataCriacao);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
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
