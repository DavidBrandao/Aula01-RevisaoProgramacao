package aula03;

import javax.swing.JOptionPane;

public class ReviewCachorro extends ReviewAnimal {
	
	private String acessorios;
	private String corFucinho;
	
	public ReviewCachorro(String cor, double peso, String raca, double altura, String acessorios, String corFucinho) {

		super(cor,peso,raca,altura);
		
		this.acessorios = acessorios;
		this.corFucinho = corFucinho;
	}
	
	
	public String getCorFucinho() {
		return corFucinho;
	}

	public void setCorFucinho(String corFucinho) {
		this.corFucinho = corFucinho;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	
	
	public void Latir() {
		JOptionPane.showMessageDialog(null, "Au au!");
	}
	
	public void Escrever() {
		JOptionPane.showMessageDialog(null, "Turma arretada");
	}

	public void VerificarHoras() {
		JOptionPane.showMessageDialog(null, "Exatamente dez e pôca");
	}
	
	
}
