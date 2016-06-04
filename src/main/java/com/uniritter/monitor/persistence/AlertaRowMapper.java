package com.uniritter.monitor.persistence;

import java.sql.ResultSet;



import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Alerta;
import com.uniritter.monitor.domain.Regra;
import com.uniritter.monitor.domain.Tipo;

public class AlertaRowMapper implements RowMapper<Alerta>  {
	@Override
	
	public Alerta mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tipo tipo;
		Regra regra ;
		return new Alerta(
				rs.getLong("id"), 
				rs.getString("nome"),
				(List<Regra>) (regra = (Regra)rs.getObject("regras")),
				tipo = (Tipo) rs.getObject("tipo"));
	}
}
