/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Este c�digo calcula quantas polegadas c�bicas h� em uma milha c�bica, Arquivo Inches.java.
*/

public class Inches {
	public static void main (String args[]) {
		long ci;
		long im;
		
		im = 5280 * 12;
		
		ci = im * im * im;
		
		System.out.println("There are " + ci + " cubic inches in cubic mile.");
	}
}

/*
 * The output of this code will be:
 * There are 254358061056000 cubic inches in cubic mile.
*/