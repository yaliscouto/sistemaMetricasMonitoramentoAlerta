package com.uniritter.monitor.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uniritter.monitor.domain.Host;
import com.uniritter.monitor.domain.Medicao;

public class MedicaoRowMapper implements RowMapper<Medicao> {

	@Override
	public Medicao mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Medicao(
				rs.getLong("id"), 
				(Host) rs.getObject("host"),
				rs.getDate("dataMedicao"),
				rs.getString("tipo")
				);
	}
	
}
