package com.uniritter.monitor.domain;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.persistence.AlertaDAO;

@Component
public class AlertaRepository {
	
	@Autowired
	AlertaDAO alertaDao;
	
	public List<Alerta> getAlertas() {
		return this.alertaDao.getAlertas();
	}

	public Alerta createAlerta(String nomeAlerta,List<Regra> regras, Tipo tipo) {
		Alerta novaAlerta = new Alerta(
				null,
				nomeAlerta,regras,tipo.toString());
		alertaDao.createAlerta(novaAlerta);
		return novaAlerta;
	}

}


