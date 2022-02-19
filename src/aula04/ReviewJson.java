package aula04;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
	
	public void LerJson() {
		JSONParser parser = new JSONParser();
		
		try {
			FileReader file = new FileReader("outputFiles/exemplo.json");
			JSONObject fileJson= (JSONObject) parser.parse(file);
			
			String ultimoNome = (String) fileJson.get("Ultimo Nome");
			System.out.println(ultimoNome);
			
			String primeiroNome = (String) fileJson.get("Primeiro Nome");
			System.out.println(primeiroNome);
			
			JSONArray mensagens = (JSONArray) fileJson.get("Mensagens");
			for(Object m : mensagens) {
				System.out.println(m);
			}
			
			
			file.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
