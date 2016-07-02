package com.uniritter.monitor.domain;

import java.util.List;

public class Alerta {
	
	private Long id;
	private String nome;
	private List<Regra> regras;
	private String tipo;

	public Alerta(Long id, String nome, List<Regra> regras, String tipo) {
		this.id = id;
		this.nome = nome;
		this.regras = regras;
		this.tipo = tipo;
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

	public List<Regra> getRegras() {
		return regras;
	}

	public void setRegras(List<Regra> regras) {
		this.regras = regras;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
