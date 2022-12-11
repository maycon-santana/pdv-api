package br.com.mayconinforgames.pdv.model.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import br.com.mayconinforgames.pdv.model.Produto;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotNull(message = "O campo NOME é requerido")
	private String nome;

	private String codBarras;

	@NotNull(message = "O campo PREÇO DA VENDA é requerido")
	private BigDecimal precoVenda;

	@NotNull(message = "O campo PREÇO DE COMPRA é requerido")
	private BigDecimal precoCompra;

	@NotNull(message = "O campo QUANTIDADE é requerido")
	private Integer quantidade;

	@NotNull(message = "O campo CATEGORIA é requerido")
	private Integer categoria;

	@NotNull(message = "O campo FORNECEDOR é requerido")
	private Long fornecedor;

	private String nomeFornecedor;

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
		this.categoria = obj.getCategoria().getCodigo();
		this.fornecedor = obj.getFornecedor().getId();
		this.nomeFornecedor = obj.getFornecedor().getNome();
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

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public Long getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Long fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

}
