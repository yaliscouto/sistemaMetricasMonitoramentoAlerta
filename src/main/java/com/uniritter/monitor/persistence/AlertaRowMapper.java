package com.uniritter.monitor.persistence;

import java.sql.ResultSet;


import org.springframework.jdbc.core.RowMapper;




public class AlertaRowMapper {
	
      

		@Override
	public Alerta mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Alerta(
				rs.getLong("id"), 
				rs.getString("nome"),
				rs.getObject("tipo", Tipo),
				rs.getObject("regras",List<Regra> regras));
	}
}
