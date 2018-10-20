package com.consignado.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consignado.api.model.ConsultaPan;
import com.consignado.api.repository.ConsultaPanRepository;
import com.consignado.api.service.util.PanApi;
import com.consignado.api.service.util.Resultado;

@Service
public class ConsultaPanService {
	
	@Autowired
	ConsultaPanRepository consultaPanRepository;
	
	@Autowired
	PanApi panApi;

	public void consultarFila() {
		List<ConsultaPan> topDez = consultaPanRepository.findTop10ByDataConsultaIsNull();
		for (ConsultaPan consultaPan : topDez) {
			Resultado resultado = panApi.consultaPan(consultaPan);
			System.out.println(resultado.getMensagem());
		}
	}
	
	
}
