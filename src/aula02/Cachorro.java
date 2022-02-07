package aula02;

import javax.swing.JOptionPane;

public class Cachorro {
	
	
	private String cor;
	private double peso;
	private String acessorios;
	private String raca;
	private double altura;
	
		
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

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
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

	public void Latir() {
		JOptionPane.showMessageDialog(null, "Au au!");
	}
	
	public void Falar() {
		JOptionPane.showMessageDialog(null, "Auuu, tate coração...");
	}
	
	public void Escrever() {
		JOptionPane.showMessageDialog(null, "Turma arretada");
	}
	
	public void Caminhar() {
		JOptionPane.showMessageDialog(null, "Caminhando...");
	}
	
	public void Correr() {
		JOptionPane.showMessageDialog(null, "Correndo");
	}
	
	public void VerificarHoras() {
		JOptionPane.showMessageDialog(null, "Exatamente dez e pôca");
	}
	
	
	
	

}
