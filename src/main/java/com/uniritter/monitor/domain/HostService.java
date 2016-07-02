package com.uniritter.monitor.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HostService {
	@Autowired
	HostRepository repository;

	public List<Host> getHosts() {
		return repository.getHosts();
	}

	public Host createHost(String nome, Grupo grupo) {
		return repository.createHost(nome, grupo);

	}

}
