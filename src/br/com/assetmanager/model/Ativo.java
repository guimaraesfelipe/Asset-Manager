package br.com.assetmanager.model;

import java.util.Date;

public class Ativo {
	private int id;
	private String modelo;
	private String serial;
	private String fabricante;
	private String categoria;
	private Date datacompra;
	private Date datacadastro;
	private Date dataatualizacao;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Date getDatacompra() {
		return datacompra;
	}
	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
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