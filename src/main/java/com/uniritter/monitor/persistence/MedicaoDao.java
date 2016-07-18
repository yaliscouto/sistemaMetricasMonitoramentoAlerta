package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.domain.Medicao;
import com.uniritter.monitor.domain.Metrica;

@Component
public class MedicaoDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MedicaoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Medicao> getMedicoes() {
		return this.jdbcTemplate
			.query(
				"select * from medicao order by id", 
				new MedicaoRowMapper());
	}

	public int createMedicao(Medicao medicao) {
		return jdbcTemplate.update(
			"insert into medicao (data,tipo,id_host) values (?,?,?)", 
			medicao.getDataMedicao(),
			medicao.getTipo(),
			medicao.getHost().getId());
	}
	
}
