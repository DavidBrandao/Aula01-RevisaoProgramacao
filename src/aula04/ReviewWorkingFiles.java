package aula04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReviewWorkingFiles {

	
	public void ExcrevendoArquivos() {
		// Parametro true - Adiciona ao fim | False - Sobrescreve
		try {
			FileWriter arquivo = new FileWriter("outputFiles/nomes.txt", false);		
			
			arquivo.write("David\nSoftware Automation\nSoftware Testing");
			
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void LendoArquivos() {
		try {
			FileReader arquivo2 = new FileReader("outputFiles/nomes.txt");		
			BufferedReader buffer = new BufferedReader(arquivo2);
			
			String linhaLida;
			while((linhaLida = buffer.readLine())!= null) {
				System.out.println(linhaLida);
			}
			
			arquivo2.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
