package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.persistence.RegraDao;

@Component
public class RegraRepository {
	@Autowired
	RegraDao regraDao;

	public List<Regra> getRegras() {
		return this.regraDao.getRegras();
	}

	public Regra createRegra(String nomeRegra, double valor, Tipo tipo) {

		Regra nova = new Regra(null, nomeRegra, valor, tipo);
		regraDao.createRegra(nova);
		return nova;
	}

}
