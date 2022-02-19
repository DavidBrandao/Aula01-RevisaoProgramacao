package aula04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

import javax.swing.JOptionPane;

public class Aula04 {

	public static void main(String[] args) {
		
		//Revisão de Estrutura de dados
		ReviewEstruturasDados estruturas = new ReviewEstruturasDados();
		
		estruturas.TrabalhandoFilas();
		estruturas.TrabalhandoListas();
		estruturas.TrabalhandoPilhas();
		
		
		ExercisesList05 lista05 = new ExercisesList05();
		//Solução utilizando Regex para mapear dados
		JOptionPane.showMessageDialog(null, lista05.ArmazenarLetrasFilaRegex(lista05.value01+lista05.value02));
		JOptionPane.showMessageDialog(null, lista05.ArmazenarNumerosFilaRegex(lista05.value01+lista05.value02));
		//Solução utilizando Collections para mapear dados 
		JOptionPane.showMessageDialog(null, lista05.RetornarLetras(lista05.value01+lista05.value02));
		JOptionPane.showMessageDialog(null, lista05.RetornarNumeros(lista05.value01+lista05.value02));

		
		//Trabalhando com arquivos - TXT			
		ReviewWorkingFiles arquivos = new ReviewWorkingFiles();
		arquivos.ExcrevendoArquivos();
		arquivos.LendoArquivos();
		
		//Trabalhando com arquivos - JSON	
		ReviewJson myJson = new ReviewJson();
		myJson.CriarJson();
		myJson.LerJson();
		
		
	}

}
