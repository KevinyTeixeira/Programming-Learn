/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Este código calcula quantas polegadas cúbicas há em uma milha cúbica, Arquivo Inches.java.
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