package aula02;

import javax.swing.JOptionPane;

public class ArrayStructure {
	
	public void unidimensionalArrays() {
		
		int[] grades = new int[3];
		
		for(int i=0; i <3; i++) {
			
			grades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Type your "+ (i+1) + " grade"));
		}
		
		for(int i=0; i <3; i++) {
			JOptionPane.showMessageDialog(null, grades[i]);
		}
		
		//Get vector size
		JOptionPane.showMessageDialog(null, grades.length);
	}
	
	public void matrixExample() {
		int[][] mat = new int[3][3];
		//int[][] mat2 = { {1,2,3}, {4,5,6}, {7,8,9} };
		int i =0; 
		
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				mat[l][c] = i;
			}
			i++;
		}
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
	}
	
	
}
