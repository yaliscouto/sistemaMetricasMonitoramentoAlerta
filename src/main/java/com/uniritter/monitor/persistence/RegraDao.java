package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.domain.Regra;

@Component
public class RegraDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public RegraDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Regra> getRegras() {
		return this.jdbcTemplate.query("select * from regra order by id", new RegraRowMapper());
	}

	public int createRegra(Regra regra) {
		return jdbcTemplate.update("insert into alerta (nome,valor,id_tipo) values (?,?,?)",
				regra.getNome(),
				regra.getValor(), 
				regra.getTipo().getId());
	}

}
