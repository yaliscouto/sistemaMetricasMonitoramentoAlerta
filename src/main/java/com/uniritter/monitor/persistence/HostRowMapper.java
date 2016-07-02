package com.uniritter.monitor.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Grupo;
import com.uniritter.monitor.domain.Host;




public class HostRowMapper  implements RowMapper<Host>{
	Grupo grupo;
	@Override
	public Host mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Host(
				rs.getLong("id"), 
				rs.getString("nome"),
				rs.getString("grupo"));
	}

}	
