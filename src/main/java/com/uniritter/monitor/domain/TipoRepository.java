package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uniritter.monitor.persistence.TipoDao;

public class TipoRepository {
	@Autowired
	TipoDao tipoDao;
	
	public List<Tipo> getTipos() {
		return this.tipoDao.getTipos();
	}

	public Tipo createTipo(String nomeTipo) {
		
		Tipo nova = new Tipo(
				null,
				nomeTipo);
		tipoDao.createTipo(nova);
		return nova;
	}

}
