package aula04;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ReviewJson {
	
	public void CriarJson() {
		
		JSONObject nomes = new JSONObject();
		
		nomes.put("Primeiro Nome", "David");
		nomes.put("Ultimo Nome", "Brandão");
		
		JSONArray mensagens = new JSONArray();
		mensagens.add("Olá");
		mensagens.add("Bem vindo a esta aula");
		mensagens.add("19/02/2022");
		
		nomes.put("Mensagens", mensagens);
		
		
		try {
			FileWriter arquivoJson = new FileWriter("outputFiles/exemplo.json", false);
			arquivoJson.write(nomes.toJSONString());
			arquivoJson.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
