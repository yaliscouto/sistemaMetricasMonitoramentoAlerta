package com.uniritter.monitor.domain;

import java.util.List;

public class Grupo {

	private int id;
	private int descricao;
	private List<Host> host;

	public Grupo(int id, int descricao, List<Host> host) {
		this.id = id;
		this.descricao = descricao;
		this.host = host;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

	public List<Host> getHost() {
		return host;
	}

	public void setHost(List<Host> host) {
		this.host = host;
	}

}
