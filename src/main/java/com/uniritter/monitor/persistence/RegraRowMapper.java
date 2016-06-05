package com.uniritter.monitor.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Regra;
import com.uniritter.monitor.domain.Tipo;

public class RegraRowMapper implements RowMapper<Regra>{

	@Override
	public Regra mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tipo tipo;
		return new Regra(
				rs.getLong("id"),
				rs.getString("nome"), 
				rs.getDouble("valor"),
				tipo = (Tipo) rs.getObject("tipo"));
	}

}
