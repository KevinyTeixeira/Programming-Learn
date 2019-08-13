/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra a inicialização dinâmica, Arquivo DynInit.java.
*/
public class DynInit {
	public static void main (String args[]) {
		double radius = 4, height = 5;
		
		// incializa volume dinamicamente
		double volume = 3.1416 * radius * radius * height; //Volume é inicializada dinâmicamente no tempo de execução
		
		System.out.println("Volume is " + volume);
	}
}

/*
 * The output of this code will be:
 * Volume is 251.328;
*/
