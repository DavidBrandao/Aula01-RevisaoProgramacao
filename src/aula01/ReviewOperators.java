package aula01;

public class ReviewOperators {
	
	
	public void BasicOperators(int a, int b) {
		System.out.println("a + b " + (a + b));
		System.out.println("a - b " + (a - b));
		System.out.println("a * b " + (a*b));
		System.out.println("a^b " + (Math.pow(a, b)));
		double newA = a, newB = b;
		System.out.println("a / b " + (newA/newB));
	}
	
	
	public void logicOperators(int a, int b, int c) {
		System.out.println("a > b && a >c  " + ((a>b) && (a>c)));
		System.out.println("a > b || a < c  " + ((a>b) || (a<c)));
		System.out.println("!(a > c)  " + !(a>c));
	}
}
