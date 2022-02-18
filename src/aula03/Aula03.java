package aula03;

import javax.swing.JOptionPane;

public class Aula03 {

	public static void main(String[] args) {
	
			ReviewCachorro toto = new ReviewCachorro("azul", 10, "cheetos", 0.6, "relogio", "marrom");
			
//			// Informando valores para os atributos
//			toto.setAcessorios("Relógio");
//			toto.setAltura(1.75);
//			toto.setCor("Amalero");
//			toto.setPeso(3.5);
//			toto.setRaca("SRD");
		
			//mostrar dados do totó
			JOptionPane.showMessageDialog(null, "Acessorios: " + toto.getAcessorios() + "\nAltura: " + toto.getAltura() + 
												"\nCor: " + toto.getCor() + "\nPeso: " + toto.getPeso() + "\nRaca: " + toto.getRaca());
			
			//Chamando os métodos
			toto.Caminhar();
			toto.Correr();
			toto.Escrever();
			toto.Latir();
			toto.VerificarHoras();			

	}

}
