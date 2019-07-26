/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Usa o teorema de pitágoras para encontrar o comprimento da hipotenusa dados os comprimentos dos dois lados opostos, Arquivo Hypot.java.
*/

public class Hypot {
	public static void main (String args[]) {
		double x, y, z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is " + z);
	}
}

/* 
 * The output of this code will be:
 * Hypotenuse is 5.0
*/