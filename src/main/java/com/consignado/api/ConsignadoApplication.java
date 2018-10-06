package com.consignado.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.consignado.api.service.util.PanApi;

@SpringBootApplication
public class ConsignadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsignadoApplication.class, args);
		teste();
	}

	private static void teste() {		
		PanApi p = new PanApi();
		try {
			p.consultaPan("06970565629", null);
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
}
