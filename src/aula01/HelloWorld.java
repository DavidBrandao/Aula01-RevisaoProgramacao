/*
 * Revisão de programação
 * David Brandão
 * Aula 01 - 04/02/2022
 * */

package aula01;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Initializing classes
		DataType dataType = new DataType();
		SentReceive message = new SentReceive();
		Operators op = new Operators();
		Lista01 lista = new Lista01();

	/*	//Using SentReveive Class
			message.HelloWorldJOption();
			message.GetDataJOption();
			message.GetDataScanner();
			message.HelloWorldScanner();
		
		//Printing previous variables
			dataType.PrintMyData();
			dataType.PrintStringLength("Olá");
			dataType.PrintCharPosition("David", 2);
			dataType.CompareToExample("first", "second");
		
		//Using Logic Operators
			op.BasicOperators(10, 20);
			op.logicOperators(30, 20, 10);
	*/
			
		//Exercises 01
			lista.Q01A();
			lista.Q01B();
			lista.Q01C();
			lista.Q02();
	}

}
