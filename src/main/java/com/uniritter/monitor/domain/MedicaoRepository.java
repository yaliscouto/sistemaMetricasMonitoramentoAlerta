package com.uniritter.monitor.domain;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.persistence.MedicaoDao;
import com.uniritter.monitor.persistence.MetricaDao;

@Component
public class MedicaoRepository {
	
	@Autowired
	MedicaoDao medicaoDao;
	
	public List<Medicao> getMedicoes() {
		return this.medicaoDao.getMedicoes();
	}

	public Medicao createMedicao(String tipo, Host host) {
		
		Medicao novaMedicao = new Medicao(null,host,new Date(),tipo);
		medicaoDao.createMedicao(novaMedicao);
		return novaMedicao;
	}

}
