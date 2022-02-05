package aula01;

import javax.swing.JOptionPane;

public class Lista01 {

	/*
	 * 1 - Calcule o que se pede
	 * 		a) Quantos segundo há em 42 minutos e 42 segundos?
	 * 		b) Quantas milhas há em 10 km? (1 milha = 1.61km)
	 * 		c) Se você correr 10km em 42min e 42 segundos, qual o seu passo medio(tempo por milha em minutos e segundos)?
	 * 		   Qual é a velocidade média em milhas por hora?
	 * 
	 * 2 - Suponha que o preço de cada de um livro seja R$ 24,95, mas as livrarias recebem um desconto de 40%. 
	 *     O transporte custa R$ 3,00 para o primeiro exemplar e 75 centavos para cada exemplar adicional. 
	 *     Crie um programa para saber o custo total de atacado para 60 cópias?
	 * */
	
	private double minutes = 42;
	private double seconds = 42;
	private double km = 10;
	private double bookPrice = 24.95;
	private double discount = 0.4;
	private double shippingBase = 3.0;
	
	
	public void Q01A() {
		//Minutes to seconds
		int totalSeconds = (int) (MinutesToSeconds(minutes) + seconds);
		JOptionPane.showMessageDialog(null, "Quantos segundo há em 42 minutos e 42 segundos?\n" 
								 + "A quantidade convertida em segundos foi: " + totalSeconds );
	}
	
	public void Q01B() {
		JOptionPane.showMessageDialog(null, "Quantas milhas há em 10 km?\n" 
						              + "Em 10km existem " + KmToMiles(km) + " milhas!" );		
	}
	
	public void Q01C() {
		double totalSeconds = MinutesToSeconds(minutes) + seconds;
		double totalMinutes = SecondToMinutes(seconds) + minutes;
		double miles = KmToMiles(km);
		double hours = MinutesToHour(totalMinutes);
				
		JOptionPane.showMessageDialog(null, "Passo médio (miles/minutes):   " + (miles/totalMinutes) + 
											"\nPasso médio (miles/seconds):   " + (miles/totalSeconds) +
											"\nPasso médio (miles/hours):   " + (miles/hours));		
	}
	
	public void Q02() {
		
		double bookWithDiscount = bookPrice - (bookPrice * discount);
		double shipping59Copies = 59 * 0.75;
		double bookPrice59 = bookWithDiscount * (59);
		double singleBook = bookWithDiscount + shippingBase;
		
		double value = singleBook + bookPrice59 + shipping59Copies;
		
		for(int i=0; i<60; i++) {
			shippingBase += 0.75; 
		}
		
		JOptionPane.showMessageDialog(null, "Book Price: " + bookPrice + 
											"\nShipping price to 60 copies: " + shippingBase +
											"\nBook With Discount:" + bookWithDiscount +
											"\nBook With Total Value:" + value);		
	}
	
	private double MinutesToSeconds(double minutes) {
		return minutes * 60;
	}
	
	private double SecondToMinutes(double seconds) {
		return seconds/60;
	}
	
	private double KmToMiles(double km) {
		return km * 0.62;
	}
	
	private double MinutesToHour(double minutes) {
		return minutes/60;
	}

}
