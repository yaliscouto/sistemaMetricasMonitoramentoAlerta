package com.uniritter.monitor.domain;

import java.sql.Time;
import java.util.Date;

public class Medicao {

	private int id;
	private Host host;
	private Date dataMedicao;
	private Tipo tipo;
	
	public Medicao(int id, Host host, Date dataMedicao, Tipo tipo) {
		this.id = id;
		this.host = host;
		this.dataMedicao = dataMedicao;
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	public Date getDataMedicao() {
		return dataMedicao;
	}
	public void setDataMedicao(Date dataMedicao) {
		this.dataMedicao = dataMedicao;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	} 
}


	