package com.uniritter.monitor.domain;

public class Regra {
	private int id;
	private String nome;
	private int valor;
	
	public Regra() {
		
	}
	
	public Regra(int id, String nome, int valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

}
