package aula02;

import javax.swing.JOptionPane;

public class LogicalStructures {
	
	public void IfExample() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:"));
		
		if(num >= 50) {
			JOptionPane.showMessageDialog(null, "Numero maior que 10");
		} else if(num >= 20 && num <= 30) {
			JOptionPane.showMessageDialog(null, "Numero entre 20 e 30");
		} else {
			JOptionPane.showMessageDialog(null, "Numero menor que 20");
		}
	}
	
	public void SwitchExample() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:"));
		
		switch(num) {
		case 50:
			JOptionPane.showMessageDialog(null, "Numero igual a 50");
			break;
		case 60:
			JOptionPane.showMessageDialog(null, "Numero igual a 60");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Numero diferente de 50 e 60");
			break;
		}
	}

}
