package com.consignado.api.service.util;

import lombok.Getter;
import lombok.Setter;

public class Cartao {
	
	@Getter
	@Setter
	private Integer id;
	
	@Getter
	@Setter
	private String margemlivre;
	
	@Getter
	@Setter
	private String limitesaquetotal;
	
	@Getter
	@Setter
	private String limitesaquedisponivel;
	
	@Getter
	@Setter
	private String convenio;
	
	@Getter
	@Setter
	private String orgao;
	
}
