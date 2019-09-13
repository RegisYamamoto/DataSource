package com.regis.datasource.model.atrativa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ADM_CLIENTE")
public class ClienteAtrativa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADM_CLIENTE")
	@SequenceGenerator(name = "SQ_ADM_CLIENTE", sequenceName = "SQ_ADM_CLIENTE", allocationSize = 1)
	private Long id;

	@Column(name = "CPF_CNPJ")
	private String cpf;

	private String nome;

	private String sexo;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "Brazil/East")
	@Column(name = "NASCIMENTO")
	private Date dataNascimento;

	private int status;

	@Column(name = "TERMO_ACEITO")
	private int termoAceito;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
	@Column(name = "DATA_ACEITE_TERMO")
	private Date dataAceiteTermo;

	@Column(name = "LOCAL_CADASTRO")
	private String localCadastro;

	@Column(name = "LOCAL_ULTIMA_ALTERACAO")
	private String localUltimaAlteracao;

	@Column(name = "TIPO_PESSOA")
	private String tipoPessoa = "F";

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
	@Column(name = "DATA_ATUALIZACAO")
	private Date dataAtualizacao;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao;

	private Integer atualizar = 1;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTermoAceito() {
		return termoAceito;
	}

	public void setTermoAceito(int termoAceito) {
		this.termoAceito = termoAceito;
	}

	public Date getDataAceiteTermo() {
		return dataAceiteTermo;
	}

	public void setDataAceiteTermo(Date dataAceiteTermo) {
		this.dataAceiteTermo = dataAceiteTermo;
	}

	public String getLocalCadastro() {
		return localCadastro;
	}

	public void setLocalCadastro(String localCadastro) {
		this.localCadastro = localCadastro;
	}

	public String getLocalUltimaAlteracao() {
		return localUltimaAlteracao;
	}

	public void setLocalUltimaAlteracao(String localUltimaAlteracao) {
		this.localUltimaAlteracao = localUltimaAlteracao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getAtualizar() {
		return atualizar;
	}

	public void setAtualizar(Integer atualizar) {
		this.atualizar = atualizar;
	}

	@Override
	public String toString() {
		return "ClienteAtrativa [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", status=" + status + ", termoAceito=" + termoAceito + ", dataAceiteTermo="
				+ dataAceiteTermo + ", localCadastro=" + localCadastro + ", localUltimaAlteracao="
				+ localUltimaAlteracao + ", tipoPessoa=" + tipoPessoa + ", dataAtualizacao=" + dataAtualizacao
				+ ", dataCriacao=" + dataCriacao + ", atualizar=" + atualizar + "]";
	}

}