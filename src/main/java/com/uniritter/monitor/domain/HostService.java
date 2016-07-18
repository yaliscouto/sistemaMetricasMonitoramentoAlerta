package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HostService {
	@Autowired
	HostRepository repository;// = new HostRepository();

	public HostService() {
		this.repository = new HostRepository();
	}
	public List<Host> getHosts() {
		return repository.getHosts();
	}

	public Host createHost(String nome, String grupo) {
		return repository.createHost(nome, grupo);
	}

}
