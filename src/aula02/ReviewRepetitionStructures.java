package aula02;

public class ReviewRepetitionStructures {
	
	
	
	public void ForExample() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		for(int i=10; i >=0; i--) {
			System.out.println(i);
		}
	}
	
		
	public void WhileExample() {
		int i = 0;
		while( i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	
	public void DoWhileExample() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i<10);
	}

}
