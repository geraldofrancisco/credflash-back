package com.consignado.api.service.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class PanApi {
	private final String URL = "http://margem.datafast.com.br/cartaopan/?";
	private final String USUARIO_API = "CREDFLASH";
	private final String SENHA_API = "Ac87edSF3c765wsiT";
	private final String USUARIO_PAN = "01893454894";
	private final String SENHA_PAN = "accred2016*";

	public void consultaPan(String cpf, String matricula)  {
		URL url;
		try {
			url = new URL(urlCompleta(cpf, matricula));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.addRequestProperty("Request-Method", "GET");
	        connection.connect();
	        if (connection.getResponseCode() == 200) {//HttpURLConnection.HTTP_ACCEPTED
	            String xml = inputStreamToString(connection.getInputStream());
	            XmlMapper mapper = new XmlMapper();
	            //mapper.readValue(xml, valueType) sd 
	        }        
	        connection.disconnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	private static String inputStreamToString(InputStream is) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    String line;
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    while ((line = br.readLine()) != null) {
	        sb.append(line);
	    }
	    br.close();
	    return sb.toString();
	}

	private String urlCompleta(String cpf, String matricula) {
		StringBuilder sb = new StringBuilder();
		sb.append(URL);
		sb.append("usuario=");
		sb.append(USUARIO_API);
		sb.append("&senha=");
		sb.append(SENHA_API);
		sb.append("&usuarioModulo=");
		sb.append(USUARIO_PAN);
		sb.append("&senhaModulo=");
		sb.append(SENHA_PAN);
		sb.append("&cpf=");
		sb.append(cpf);
		if (matricula != null) {
			sb.append("&matricula=");
			sb.append(matricula);
		}

		return sb.toString();
	}
}
