/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra o tempo de vida de uma variável, Arquivo VarInitDemo.java.
*/
public class VarInitDemo {
	public static void main (String args[]) {
		int x;
		
		for (x = 0; x < 3; x++) {
			int y = -1; //y será inicializada sempre que entrarmos no bloco
			System.out.println("y is: " + y); // essa linha sempre exibe - 1
			y = 100;
			System.out.println("y is now: " + y);
		}
	}
}

/*
 * The output of this code will be:
 * y is: -1
 * y is now: 100
 * y is: -1
 * y is now: 100
 * y is: -1
 * y is now: 100
*/