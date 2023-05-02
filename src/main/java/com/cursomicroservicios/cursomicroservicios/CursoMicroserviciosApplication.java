package com.cursomicroservicios.cursomicroservicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoMicroserviciosApplication {
	public static Logger logger = LoggerFactory.getLogger(CursoMicroserviciosApplication.class);	
	public static void main(String[] args) {
		SpringApplication.run(CursoMicroserviciosApplication.class, args);
		logger.info("Hola soy el info");
		logger.debug("Hola soy el debugger");
	}

}
