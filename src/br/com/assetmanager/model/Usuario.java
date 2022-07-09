package br.com.assetmanager.model;

import java.util.Date;

public class Usuario {
	private int id;
	private int credencial;
	private String nome;
	private String email;
	private String departamento;
	private String cargo;
	private Date datacadastro;
	private Date dataatualizacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCredencial() {
		return credencial;
	}
	public void setCredencial(int credencial) {
		this.credencial = credencial;
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(Date datacadastro) {
		this.datacadastro = datacadastro;
	}
	public Date getDataatualizacao() {
		return dataatualizacao;
	}
	public void setDataatualizacao(Date dataatualizacao) {
		this.dataatualizacao = dataatualizacao;
	}
	
	
}
