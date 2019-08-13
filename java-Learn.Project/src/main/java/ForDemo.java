/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra a instrução for, Arquivo ForDemo.java.
*/ 

// for(inicialização; condição; iteração) instrução;
// Can be used, count = count + 1; count++ or (if you want decrease, count--);

class ForDemo {
	public static void main (String args[]) {
		int count;
		
		for (count = 0; count < 5; count++) //Este laço itera 5 vezes;
			System.out.println("This is count: " + count);
			
		System.out.println("Done!");
	}
}

/*
 * The output of this code will be:
 * This is count: 0
 * This is count: 1
 * This is count: 2
 * This is count: 3
 * This is count: 4
 * Done!
 */