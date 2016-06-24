package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.uniritter.monitor.domain.Tipo;

public class TipoDao {
private JdbcTemplate jdbcTemplate;
		
	@Autowired
	public TipoDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Tipo> getTipos() {
		return this.jdbcTemplate
			.query(
				"select * from tipo order by id", 
				new TipoRowMapper());
	}

	public int createTipo(Tipo tipo) {
		return jdbcTemplate.update(
			"insert into metrica (nome) values (?)", 
			tipo.getNome()); 
			
	}

}
