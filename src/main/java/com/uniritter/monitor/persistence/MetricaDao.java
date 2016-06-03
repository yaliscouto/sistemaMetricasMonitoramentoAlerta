package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.domain.Metrica;

@Component
public class MetricaDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MetricaDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Metrica> getMetricas() {
		return this.jdbcTemplate
			.query(
				"select * from metrica order by codigo", 
				new MetricaRowMapper());
	}

	public int createMetrica(Metrica metrica) {
		return jdbcTemplate.update(
			"insert into metrica (nome,created) values (?,?)", 
			metrica.getNome(), 
			metrica.getCreated());
	}
	
}
