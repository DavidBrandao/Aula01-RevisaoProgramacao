package aula02;

import javax.swing.JOptionPane;

public class Lista02 {

	
	public void Q1(){
		double grades = 0;
		for(int i=0; i<4; i++) {
			grades += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota " + (i+1)));
		}
		
		double med = grades/4;
		
		JOptionPane.showMessageDialog(null, "Media das notas: " + med);
	}
	
	public void Q2() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:"));
		
		if(num >=0 && num <=60) {
			JOptionPane.showMessageDialog(null, "O proximo numero é: " + (num+1));
		} else {
			JOptionPane.showMessageDialog(null, "Numero fora do escopo");
		}
	}
	
	public void Q3() {
		double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor em fahrenheit"));
		double celcius = (((fahrenheit - 32) * 5)/9); 
		
		JOptionPane.showMessageDialog(null,"Valor em celcius: " + celcius);
	}
	
	public void Q4() {
		double prize = 780000;
		double firstPlace = prize * 0.46;
		double secondPlace = prize * 0.32; 
		double thirdPlace = prize * (1 - (0.46 + 0.32));
		
		JOptionPane.showMessageDialog(null, "First Place: "+firstPlace+
											"\nSecond Place: "+secondPlace+
											"\nThird Place: "+thirdPlace);
	}
	
	public void Q5() {
		String word = JOptionPane.showInputDialog(null, "Digite a palavra a ser verificada");
		String inverted="";
		int wordLength = word.length();
		int i=0;
		
		for(i=wordLength-1; i>=0; i--) {
			inverted += word.charAt(i);
		}
		
		JOptionPane.showMessageDialog(null,"Palavra: " + word+ "\nPalavra invertida: " +inverted);
		if(word.equals(inverted)) {
			JOptionPane.showMessageDialog(null,"Palindromo!!");
		} else {
			JOptionPane.showMessageDialog(null,"Não é um Palindromo");
		}
	}
	
	public void Q6() {
		String nome = "test";
		int[] salto = new int[5];
		int totalSalto = 0;
		boolean controle = false;
		
		while(controle == false) {
			nome = JOptionPane.showInputDialog(null, "Digite o nome do atleta");
			
			while(!nome.isEmpty()) {
					
				for(int i=0; i<5; i++) {
					salto[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+ (i+1) +" salto do atleta"));
					totalSalto += salto[i];
				}
				 
				JOptionPane.showMessageDialog(null, "Nome do atleta: "+nome +
													"\nSaltos: " + salto[0]+ " - " + salto[1]+ " - " + salto[2]+ " - " + salto[3]+ " - "+ salto[4] + 
												    "\nMedia Saltos: " + (totalSalto/5));
				
			}
			
			if(nome.isEmpty()) {
				controle = true;
			}
		}
		
	}
	
}
