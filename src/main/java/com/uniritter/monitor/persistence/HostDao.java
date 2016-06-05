package com.uniritter.monitor.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.domain.Host;

@Component
public class HostDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public HostDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Host> getHosts() {
		return this.jdbcTemplate.query("select * from host order by id", new HostRowMapper());
	}

	public int createHost(Host host) {
		return jdbcTemplate.update("insert into host (nome,id_grupo) values (?,?)", host.getNome(),
				host.getGrupo().getId());
	}
}
