package com.uniritter.monitor.domain;

import java.sql.Time;
import java.util.Date;

public class Medicao {

	private int id;
	private Host host;
	private Time horaMedicao;
	private Date dataMedicao;

	public Medicao(int id, Host host, Time horaMedicao, Date dataMedicao) {
		this.id = id;
		this.host = host;
		this.horaMedicao = horaMedicao;
		this.dataMedicao = dataMedicao;
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

	public Time getHoraMedicao() {
		return horaMedicao;
	}

	public void setHoraMedicao(Time horaMedicao) {
		this.horaMedicao = horaMedicao;
	}

	public Date getDataMedicao() {
		return dataMedicao;
	}

	public void setDataMedicao(Date dataMedicao) {
		this.dataMedicao = dataMedicao;
	}

}
