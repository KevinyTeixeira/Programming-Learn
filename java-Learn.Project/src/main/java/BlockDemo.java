/**
 * @author 05725843181, @Reference Book: Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
 /* Demonstra um bloco de c�digo, Arquivo BlockDemo.java.
 */

class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		// o alvo desta instru��o if � um bloco
		if (i != 0) {
			System.out.println("i does not equal zero");
			d = j / i;
			System.out.println("j / i is " + d);
		}
	}
}

/*
 * The output of this code will be:
 * i does not equal zero
 * j / i is 2.0
 */