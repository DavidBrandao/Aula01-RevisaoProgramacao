package aula04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.JOptionPane;

public class ReviewEstruturasDados {
	
	
	public void TrabalhandoListas() {
		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("David");
		listaNomes.add("Luana");
		listaNomes.add("Diego");
		listaNomes.add("Beatriz");
		
		//Mostrando Lista
		JOptionPane.showMessageDialog(null, listaNomes);
		
		//Removendo Itens da lista
		listaNomes.remove(3);
		JOptionPane.showMessageDialog(null, listaNomes);
	}
	
	public void TrabalhandoFilas() {
		//Queue<Integer> filaNumeros = new LinkedList<Integer>();
		Deque<Integer> filaNumeros = new LinkedList<Integer>();
		
		filaNumeros.add(50);
		filaNumeros.add(5);
		filaNumeros.add(120);
		filaNumeros.add(530);
		
		//Mostrando fila
		JOptionPane.showMessageDialog(null, filaNumeros);
		
		//Primeiro elemento
		JOptionPane.showMessageDialog(null, filaNumeros.peek());
		
		//Removendo primeiro elemento
		filaNumeros.remove();
		JOptionPane.showMessageDialog(null, filaNumeros.peek());
	
		// Verifica se fila está valiza
		JOptionPane.showMessageDialog(null, filaNumeros.isEmpty());
	
		//Ultimo Elemento
		JOptionPane.showMessageDialog(null, filaNumeros.getLast());
	}

	public void TrabalhandoPilhas() {
		Deque<String> pilhaNomes = new ArrayDeque<String>();
		
		pilhaNomes.push("David");
		pilhaNomes.push("Diego");
		pilhaNomes.push("Lua");
		pilhaNomes.push("Bia");

		//Imprimindo Pilha
		JOptionPane.showMessageDialog(null, pilhaNomes);
		
		//Elemento do topo
		JOptionPane.showMessageDialog(null, pilhaNomes.peek());
		
		//Remover elemento do topo
		pilhaNomes.pop();
		JOptionPane.showMessageDialog(null, pilhaNomes);
	}

}
