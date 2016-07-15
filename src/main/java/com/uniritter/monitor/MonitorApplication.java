package com.uniritter.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uniritter.monitor.domain.Grupo;
import com.uniritter.monitor.domain.HostService;

@SpringBootApplication
public class MonitorApplication {

	public static void main(String[] args) {
//		HostService hostService = new HostService();
//		hostService.createHost("servidores", Grupo.FIREWALL);
    	SpringApplication.run(MonitorApplication.class, args);
	}
}
