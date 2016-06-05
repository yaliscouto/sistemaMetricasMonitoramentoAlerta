package com.uniritter.monitor.domain;

public class Regra {
	private Long id;
	private String nome;
	private Double valor;
	private Tipo tipo;

	public Regra(Long id, String nome, Double valor, Tipo tipo) {

		this.id = id;
		this.nome = nome;
		this.valor = valor;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
