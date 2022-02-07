/* 1. Faça um programa, utilizando uma classe, que solicite a data de nascimento (dd/mm/aaaa) do usuário e imprima a data com o nome do mês por extenso.

Data de Nascimento: 29/10/1973
Você nasceu em 29 de Outubro de 1973.

2. Crie uma classe que modele uma pessoa:
a. Atributos: nome, idade, peso e altura
b. Métodos: Envelhecer, engordar, emagrecer, crescer. 
*/

package aula02;

import javax.swing.JOptionPane;

public class Lista03 {
	
	public String ConvertBirthDate() {
		
		String birthdate = JOptionPane.showInputDialog(null, "Digite sua data de nascimento!!!\nFormat: DD/MM/YYYY");
		String day = birthdate.substring(0,2);
		String month = birthdate.substring(3,5);
		String year = birthdate.substring(6,10);
		
		if(month.equals("01")) {
			month = "Janeiro";
		}else if(month.equals("02")) {
			month = "Fevereiro";
			
		}else if(month.equals("03")) {
			month = "Março";
			
		}else if(month.equals("04")) {
			month = "Abril";
			
		}else if(month.equals("05")) {
			
			month = "Maio";
		}else if(month.equals("06")) {
			month = "Junho";
			
		}else if(month.equals("07")) {
			month = "Julho";
			
		}else if(month.equals("08")) {
			
			month = "Agosto";
		}else if(month.equals("09")) {
			
			month = "Setembro";
		}else if(month.equals("10")) {
			
			month = "Outubro";
		}else if(month.equals("11")) {
			month = "Novembro";
			
		}else if(month.equals("12")) {
			
			month = "Dezembro";
		} else {
			
			month = "Entrada inválida para o mês";
		}
		
		return "Você nasceu em " + day + " de " + month + " de " + year + " !!!";
	}

}
