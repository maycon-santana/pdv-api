package br.com.mayconinforgames.pdv.model.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.mayconinforgames.pdv.model.Cliente;

public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull(message = "O campo NOME é requerido")
    private String nome;

    private String email;

    @NotNull(message = "O campo TELEFONE é requerido")
    private String telefone;

    @Column(nullable = false)
    @NotNull(message = "O campo CPF é requerido")
    private String cpf;

    @Column(nullable = false)
    @NotNull(message = "O campo RG é requerido")
    private String rg;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

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

    public ClienteDTO() {
        super();
    }

    public ClienteDTO(Cliente obj) {
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
