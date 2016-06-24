package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TipoService {
	@Autowired
	TipoRepository repository;

	public List<Tipo> getTipos() {

		return repository.getTipos();

	}

	public Tipo createTipo(String nomeTipo) {

		return repository.createTipo(nomeTipo);

	}

}
