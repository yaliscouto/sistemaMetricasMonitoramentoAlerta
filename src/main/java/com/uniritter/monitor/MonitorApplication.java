package com.uniritter.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uniritter.monitor.domain.Grupo;
import com.uniritter.monitor.domain.HostService;
import com.uniritter.monitor.domain.RegraService;
import com.uniritter.monitor.domain.Tipo;

@SpringBootApplication
public class MonitorApplication {
	public static void main(String[] args) {
//		HostService hostService =  new HostService();
//		hostService.createHost("Host1", Grupo.FIREWALL.name());
//		RegraService regraService = new RegraService();
//		regraService.createRegra("Memoria", 50, Tipo.MEMORIA);
		SpringApplication.run(MonitorApplication.class, args);
	}
}