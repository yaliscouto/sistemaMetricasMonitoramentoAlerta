package com.uniritter.monitor.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Tipo;

public class TipoRowMapper implements RowMapper<Tipo> {
	@Override
	public Tipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Tipo(
				rs.getLong("id"), 
				rs.getString("nome"));
				
	}

}
