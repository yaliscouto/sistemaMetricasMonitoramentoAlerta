package com.uniritter.monitor.domain;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicaoService {

	@Autowired
	MedicaoRepository repository;

	public List<Medicao> getMedicao() {
		return repository.getMedicoes();
	}

	public Medicao createMedicao( String tipo, Host host) {

		return repository.createMedicao(tipo, host);

	}

}
