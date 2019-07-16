/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Demonstra a instru��o for, Arquivo ForDemo.java.
*/ 

// for(inicializa��o; condi��o; itera��o) instru��o;
// Can be used, count = count + 1; count++ or (if you want decrease, count--);

class ForDemo {
	public static void main (String args[]) {
		int count;
		
		for (count = 0; count < 5; count++) //Este la�o itera 5 vezes;
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