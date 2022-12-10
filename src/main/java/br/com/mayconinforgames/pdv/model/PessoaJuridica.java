package br.com.mayconinforgames.pdv.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String inscEstadual;
    private String inscMunicipal;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long id, String nome, String email, String telefone,
                          String logradouro, String cep, String numero, String complemento,
                          String bairro, String uf, String cidade, LocalDate dataCriacao, String cnpj,
                          String inscEstadual, String inscMunicipal, String nomeFantasia, String razaoSocial,
                          String categoria) {
        super(id, nome, email, telefone, logradouro, cep, numero, complemento, bairro, uf, cidade, dataCriacao);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.inscMunicipal = inscMunicipal;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
