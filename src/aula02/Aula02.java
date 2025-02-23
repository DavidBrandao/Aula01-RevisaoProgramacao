/*
 * Revis�o de programa��o
 * David Brand�o
 * Aula 02 - 05/02/2022
 * */

package aula02;

import javax.swing.JOptionPane;

public class Aula02 {

	public static void main(String[] args) {
		
		// Lista 02
		ExercisesLista02 lista = new ExercisesLista02();
		lista.Q1();
		lista.Q2();
		lista.Q3();
		lista.Q4();
		lista.Q5();
		lista.Q6();

		//Lista 03 - Quest�o 01 
		ExercisesLista03 lista03 = new ExercisesLista03();
		JOptionPane.showMessageDialog(null, lista03.ConvertBirthDate());
				
		//Lista 03 - Quest�o 02 
		ExercisesPessoa p = new ExercisesPessoa();
		
		//Inserindo valores para o objeto p
		p.setNome("David");
		p.setIdade(22);
		p.setAltura(1.73);
		p.setPeso(93.5);
		
		//Mostrando dados na tela da pessoa
		p.ImprimirInfo(p);
		
		//Atualizando infomra��es(metodos interativos com o usu�rio)
		p.Engordar();
		p.Envelhecer();
		p.Crescer();
		p.Emagrecer();
		
		//Imprimindo informa��es atualizadas
		p.ImprimirInfo(p);


		/*
		ReviewLogicalStructures logic = new LogicalStructures();
			logic.IfExample();
			logic.SwitchExample();
			
		ReviewRepetitionStructures repeat = new RepetitionStructures();
			repeat.ForExample();
			repeat.WhileExample();
			repeat.DoWhileExample();
		
		ReviewArrayStructure arrays = new ArrayStructure();
			arrays.unidimensionalArrays();
			arrays.matrixExample();
		
		//Instanciando a classe
		ReviewCachorro toto = new Cachorro();
		
		// Informando valores para os atributos
		toto.setAcessorios("Rel�gio");
		toto.setAltura(1.75);
		toto.setCor("Amalero");
		toto.setPeso(3.5);
		toto.setRaca("SRD");
	
		//mostrar dados do tot�
		JOptionPane.showMessageDialog(null, "Acessorios: " + toto.getAcessorios() + "\nAltura: " + toto.getAltura() + 
											"\nCor: " + toto.getCor() + "\nPeso: " + toto.getPeso() + "\nRaca: " + toto.getRaca());
		
		//Chamando os m�todos
		toto.Caminhar();
		toto.Correr();
		toto.Escrever();
		toto.Falar();
		toto.Latir();
		toto.VerificarHoras();
		*/
	}

}
