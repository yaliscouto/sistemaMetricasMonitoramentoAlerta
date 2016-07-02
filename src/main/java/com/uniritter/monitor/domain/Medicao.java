package com.uniritter.monitor.domain;

import java.util.Date;

public class Medicao {

	private Long id;
	private Host host;
	private Date dataMedicao;
	private String tipo;
	
	public Medicao(Long id, Host host, Date dataMedicao, String tipo) {
		this.id = id;
		this.host = host;
		this.dataMedicao = dataMedicao;
		this.tipo = tipo;
	}
	
	public 	Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	} 
}


	