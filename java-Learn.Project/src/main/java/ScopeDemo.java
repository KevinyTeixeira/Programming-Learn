/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra o escopo de bloco, Arquivo ScopeDemo.java.
*/
public class ScopeDemo {
	public static void main (String args[]) {
		int x = 10; // conhecida pelo código dentro de main
		
		if( x == 10 ) { // inicia novo escopo
			
			int y = 20; // conhecida apenas nesse bloco
			
			// tanto x quanto y são conhecidas aqui.
			
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; //Erro! y não é conhecida aqui por estar fora do escopo
		
		// x ainda é conhecida aqui.
		System.out.println("x is " + x);
	}
}

/* 
 * The output of this code will be:
 * x and y: 10 20
 * x is 40
*/