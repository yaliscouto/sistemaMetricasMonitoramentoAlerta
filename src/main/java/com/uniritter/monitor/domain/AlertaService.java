package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AlertaService {
	@Autowired
	MedicaoService medicaoService;

	@Autowired
	RegraService regraService;
	
	@Autowired
	AlertaRepository repository;

	public List<Alerta> getAlertas() {
		return repository.getAlertas();
	}

	public Alerta createAlerta(String nomeAlerta, List<Regra> regras, Tipo tipo) {
		return repository.createAlerta(nomeAlerta, regras, tipo);

	}
	
	public boolean DisparaAlerta(MedicaoService medicaoService, RegraService regraService) {
					
		
		return true;

	}


}
