/*1. Faça um programa, utilizando uma classe, que solicite a data de nascimento (dd/mm/aaaa) do usuário e imprima a data com o nome do mês por extenso.

Data de Nascimento: 29/10/1973
Você nasceu em 29 de Outubro de 1973.

2. Crie uma classe que modele uma pessoa:
a. Atributos: nome, idade, peso e altura
b. Métodos: Envelhecer, engordar, emagrecer, crescer.
*/ 
package aula02;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void Envelhecer() {
		int qtdAnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você deseja envelhecer?"));
		int idadeFinal = getIdade() + qtdAnos;
		setIdade(idadeFinal);
		JOptionPane.showMessageDialog(null, "Agora você tem " + getIdade() + " anos.");
	}
	
	public void Engordar() {
		double qtdPeso = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos quilos você deseja engordar?"));
		double pesoFinal = getPeso() + qtdPeso;
		setPeso(pesoFinal);
		JOptionPane.showMessageDialog(null, "Agora você tem " + getPeso() + " quilos.");
	}
	
	public void Emagrecer() {
		double qtdPeso = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos quilos você deseja emagrecer?"));
		double pesoFinal = getPeso() - qtdPeso;
		setPeso(pesoFinal);
		JOptionPane.showMessageDialog(null, "Agora você tem " + getPeso() + " quilos.");
	}
	
	public void Crescer() {
		double qtdAltura = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos metros você deseja crescer?\nExemplo: 10 cm = 0.1 | 120cm = 1.2"));
		double alturaFinal = getAltura() + qtdAltura;
		setAltura(alturaFinal);
		JOptionPane.showMessageDialog(null, "Agora você tem " + getAltura() + " metros.");
	}
	
	public void ImprimirInfo(Pessoa p) {
		JOptionPane.showMessageDialog(null, "Nome: " + p.getNome()+
				                            "\nIdade: " + p.getIdade()+
				                            "\nAltura: "+ p.getAltura()+
				                            "\nPeso: " + p.getPeso());
	}
}
