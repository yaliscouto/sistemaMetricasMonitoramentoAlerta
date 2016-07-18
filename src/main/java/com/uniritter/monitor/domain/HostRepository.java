package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.persistence.HostDao;
import com.uniritter.monitor.persistence.RegraDao;

@Component
public class HostRepository {

	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	@Autowired
	HostDao hostDao = new HostDao(jdbcTemplate);

	public List<Host> getHosts() {
		return this.hostDao.getHosts();
	}

	public Host createHost(String nomeHost, String grupo) {
   
		Host nova = new Host(null,nomeHost, grupo);
		
		hostDao.createHost(nova);
		return nova;
	}
}

