package com.consignado.api.service.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

import com.consignado.api.model.ConsultaPan;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class PanApi {
	private final String URL = "http://margem.datafast.com.br/cartaopan/?";
	private final String USUARIO_API = "CREDFLASH";
	private final String SENHA_API = "Ac87edSF3c765wsiT";
	private final String USUARIO_PAN = "09165197674";
	private final String SENHA_PAN = "Pan2028%23";

	public Resultado consultaPan(ConsultaPan consultaPan) {
		Resultado resultado = null;
		URL url;
		try {
			url = new URL(urlCompleta(consultaPan));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.addRequestProperty("Request-Method", "GET");
			connection.connect();
			if (connection.getResponseCode() == 200) {
				String xml = inputStreamToString(connection.getInputStream()).replace("_", "").toLowerCase();
				XmlMapper mapper = new XmlMapper();
				resultado = mapper.readValue(xml,Resultado.class);									
			}
			connection.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
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

	private String urlCompleta(ConsultaPan consultaPan) {
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
		sb.append(consultaPan.getCliente().getCpf());
		sb.append("&convenioConsulta=");
		sb.append(consultaPan.getTipo());

		if (consultaPan.getCliente().getMatricula() != null) {
			sb.append("&matricula=");
			sb.append(consultaPan.getCliente().getMatricula());
		}
		String url = sb.toString();
		System.out.println(url);
		return url;
	}
}
