package aula03;

import javax.swing.JOptionPane;

public class Aula03 {

	public static void main(String[] args) {
	
			ReviewCachorro toto = new ReviewCachorro("azul", 10, "cheetos", 0.6, "relogio", "marrom");

			//mostrar dados do totó
			JOptionPane.showMessageDialog(null, "Cachorro: "+"\nAcessorios: " + toto.getAcessorios() + "\nAltura: " + toto.getAltura() + 
												"\nCor: " + toto.getCor() + "\nPeso: " + toto.getPeso() + "\nRaca: " + toto.getRaca());
			
			//Chamando os métodos
//			toto.Caminhar();
//			toto.Correr();
//			toto.Escrever();
//			toto.Latir();
//			toto.VerificarHoras();		
//			
			ReviewGato gato = new ReviewGato("rosa", 5, "miau", 0.4, "agressivo", "marrom");
			
			JOptionPane.showMessageDialog(null, "Gato: "+ "\nAltura: " + gato.getAltura() + "\nCor: " + gato.getCor() + "\nPeso: " + gato.getPeso() +
											   "\nRaca: " + gato.getRaca()+ "\nTemperamento: " + gato.getTemperamento() + "\nCor do Rabo" + gato.getCorRabo());
			
//			gato.Caminhar();
//			gato.Correr();
//		

	}

}
