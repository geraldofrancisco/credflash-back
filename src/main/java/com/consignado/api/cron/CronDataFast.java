package com.consignado.api.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.consignado.api.service.util.Datas;

@Component
public class CronDataFast {
	
	
	
	@Scheduled(fixedRate= 5000)
	public void consultaPan() {
		if(Datas.podeConsultarPan()) {
			System.out.println("pode");
		}
	}
}
