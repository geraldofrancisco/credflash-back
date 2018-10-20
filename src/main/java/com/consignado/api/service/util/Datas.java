package com.consignado.api.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {
	public static final boolean podeConsultarPan() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			return true;
		case 7:
			return cal.get(Calendar.HOUR_OF_DAY) <= 17 && cal.get(Calendar.MINUTE) <= 45;			
		default:
			return false;
		}			
	}
	
	public static final Date converteStringEmDate(String dataBR) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(dataBR);
		} catch (ParseException e) {
			return null;
		}
	}
}
