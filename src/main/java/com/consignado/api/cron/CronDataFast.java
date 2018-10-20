package com.consignado.api.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.consignado.api.service.ConsultaPanService;
import com.consignado.api.service.util.Datas;

@Component
public class CronDataFast {
	
	@Autowired
	ConsultaPanService consultaPanService;
	
	@Scheduled(fixedRate= 5000)
	public void consultaPan() {
		if(Datas.podeConsultarPan()) {
			consultaPanService.consultarFila();
		}
	}
}
