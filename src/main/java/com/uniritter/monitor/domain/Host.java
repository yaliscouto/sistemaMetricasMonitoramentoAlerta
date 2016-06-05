package com.uniritter.monitor.domain;

public class Host {

	private Long id;
	private String nome;
	private Grupo grupo;

	public Host(Long id, String nome, Grupo grupo) {
		this.id = id;
		this.nome = nome;
		this.grupo = grupo;
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

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
