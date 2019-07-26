/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Demonstra o funcionamento do caractere booleano, Arquivo BoolDemo.java.
*/

public class BoolDemo {
	public static void main (String args[]) {
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);
		
		// um valor booleano pode controlar a instru��o
		if (b) System.out.println("This is executed.");
		
		b = false;
		if(b) System.out.println("This is not executed");
		
		// o resultado de um operador relacional � um valor booleano
		System.out.println("10 > 9 is " + (10 > 9));
	}
}

/*
 * The output of this code will be:
 * b is false
 * b is true
 * This is executed.
 * 10 > 9 is true
*/