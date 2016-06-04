package com.uniritter.monitor.persistence;

import java.sql.ResultSet;



import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Alerta;

public class AlertaRowMapper implements RowMapper<Alerta>  {
	@Override
	 
	public Alerta mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Alerta(
				rs.getLong("id"), 
				rs.getString("nome"),
				rs.getObject("tipo", Tipo),
				rs.getObject("regras",List<Regra> regras));
	}
}
