package aula03;

import javax.swing.JOptionPane;

public class ReviewAnimal {

	private String cor;
	private double peso;
	private String raca;
	private double altura;
	
	public ReviewAnimal(String cor, double peso, String raca, double altura) {
		this.cor = cor;
		this.peso = peso;
		this.raca = raca;
		this.altura = altura;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public void Caminhar() {
		JOptionPane.showMessageDialog(null, "Caminhando...");
	}
	
	public void Correr() {
		JOptionPane.showMessageDialog(null, "Correndo");
	}
	

	
	
	
}
