package br.com.mayconinforgames.pdv.model.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.ConstraintMode;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.mayconinforgames.pdv.model.Pessoa;
import br.com.mayconinforgames.pdv.model.Produto;
import br.com.mayconinforgames.pdv.model.enums.Categoria;

public class ProdutoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private String codBarras;

    private BigDecimal precoVenda;

    private BigDecimal precoCompra;

    private Integer quantidade;

    private Categoria categoria;

    private Pessoa pessoa;

	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Produto obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.codBarras = obj.getCodBarras();
		this.precoVenda = obj.getPrecoVenda();
		this.precoCompra = obj.getPrecoCompra();
		this.quantidade = obj.getQuantidade();
		this.categoria = obj.getCategoria();
		this.pessoa = obj.getPessoa();
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

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
    
    
}
