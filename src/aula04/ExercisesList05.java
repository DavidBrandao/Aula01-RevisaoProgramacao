package aula04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class ExercisesList05 {

	String value01 = "A 1 E 5 T 7 W 8 G A E T W G 8 7 5 1";
	String value02 = "3 C 9 H 4 Q 6  C H Q 6 4 9 3";
	
	public Deque<String> ArmazenarLetrasFilaRegex(String valor) {
		
		Deque<String> filaLetras = new LinkedList<String>();
		String letras = (valor).replaceAll("[^a-zA-Z]+", "");
		
		for(int i=0; i < letras.length(); i++) {
			char mychar = letras.charAt(i); 
			filaLetras.add(Character.toString(mychar));
		}
		
		return filaLetras;
	}
	
	public Deque<String> ArmazenarNumerosFilaRegex(String valor) {
		
		Deque<String> filaLetras = new LinkedList<String>();
		String letras = (valor).replaceAll("[^0-9]+", "");
		
		for(int i=0; i < letras.length(); i++) {
			char mychar = letras.charAt(i); 
			filaLetras.add(Character.toString(mychar));
		}
		
		return filaLetras;
	}
	
	
	String numeros = (value01+value02).replaceAll("[^0-9]+", "");
	
	
	public List <Character> RetornarLetras(String letra) {
		List <Character> listaLetras = letra.chars().boxed().map(ch -> (char)ch.intValue()).filter(Character::isLetter).collect(Collectors.toList());
		return listaLetras;
	}
	
	public List <Character> RetornarNumeros(String letra) {
		List <Character> listaLetras = letra.chars().boxed().map(ch -> (char)ch.intValue()).filter(Character::isDigit).collect(Collectors.toList());
		return listaLetras;
	}
		
}
