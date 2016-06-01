package com.uniritter.monitor.domain;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniritter.monitor.persistence.AlertaDao;


public class AlertaRepository {
	
	@Autowired
	AlertaDao alertaDao;
	
	public List<Alerta> getAlertas() {
		return this.alertaDao.getAlertas();
	}

	public Alerta createAlerta(String nomeAlerta,List<Regra> regras, Tipo tipo) {
		
		Alerta novaAlerta = new Alerta(
				null,
				nomeAlerta,regras,tipo);
		alertaDao.createAlerta(novaAlerta);
		return novaAlerta;
	}

}


