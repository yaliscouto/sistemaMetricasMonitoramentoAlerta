package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegraService {
	@Autowired
	RegraRepository repository;

	public List<Regra> getRegras() {

		return repository.getRegras();

	}

	public Regra createRegra(String nomeRegra, double valor, Tipo tipo) {

		return repository.createRegra(nomeRegra, valor, tipo);

	}

}
