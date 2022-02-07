package aula01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReviewSentReceive {


	Scanner sc = new Scanner(System.in);
	
	public void HelloWorldJOption() {
		JOptionPane.showMessageDialog(null, "Hello World!");
	}
	
	public void GetDataJOption() {
		String value = JOptionPane.showInputDialog(null, "Type your string value");
		JOptionPane.showMessageDialog(null, "You string was: " + value);
	}
	
	public void GetDataScanner() {
		System.out.println("Input your message: ");
		String abc = sc.next();
		System.out.println(abc);
		sc.close();
	}
	
	public void HelloWorldScanner() {
		System.out.println("Hello World!");
	}
}
