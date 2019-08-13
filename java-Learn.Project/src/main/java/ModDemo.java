/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra o operador % (mod), Arquivo ModDemo.java.
*/
public class ModDemo {
	public static void main (String args []) {
		int iresult, irem;
		double dresult, drem;
		
		iresult = 10 / 3;
		irem = 10 % 3;
		
		dresult = 10.0 / 3.0;
		drem = 10.0 % 3.0;
		
		System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
		System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
	}
}


/*
 * The output of this code will be:
 * Result and remainder of 10 / 3: 3 1
 * Result and remainder of 10.0 / 3.0: 3.3333333333333335 1.0
*/