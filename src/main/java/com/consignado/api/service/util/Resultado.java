package com.consignado.api.service.util;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Resultado {
	
	@Getter
	@Setter
	private String cpf;
	
	@Getter
	@Setter
	private List<Cartao>cartoes;
	
	@Getter
	@Setter
	private String mensagem;
	
	@Getter
	@Setter
	private String dataconsulta;
	
	@Getter
	@Setter
	private String ok;
	
	@Getter
	@Setter
	private String erro;
	
	@Getter
	@Setter
	private String tipomensagem;
	
	@Getter
	@Setter
	private String sessao;
	
	@Getter
	@Setter
	private Long duracao;
	
	@Getter
	@Setter
	private String data;
}
