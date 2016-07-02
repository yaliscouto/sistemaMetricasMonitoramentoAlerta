package com.uniritter.monitor.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uniritter.monitor.persistence.HostDao;


@Component
public class HostRepository {
	@Autowired
	HostDao hostDao;
	
	
	
	public List<Host> getHosts() {
		return this.hostDao.getHosts();
	}

	public Host createHost(String nomeHost, Grupo grupo) {
		
		Host nova = new Host(
				null,
				nomeHost, grupo.toString());
		hostDao.createHost(nova);
		return nova;
	}
}
