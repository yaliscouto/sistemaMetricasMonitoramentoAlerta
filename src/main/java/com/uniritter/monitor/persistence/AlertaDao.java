package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.domain.Alerta;
import com.uniritter.monitor.domain.Metrica;

@Component
public class AlertaDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public AlertaDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Alerta> getAlertas() {
		return this.jdbcTemplate
			.query(
				"select * from alerta order by id", 
				new AlertaRowMapper());
	}
	


	public int createAlerta(Alerta alerta) {
		return jdbcTemplate.update(
			"insert into alerta (nome) values (?,?)", 
			alerta.getNome());
	}
}
