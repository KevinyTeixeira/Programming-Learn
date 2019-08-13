/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra os operadores relacionais e lógicos, Arquivo RelLogOps.java.
 * Vide SCops.java para os operadores lógicos de curto-circuito.
*/
public class RelLogOps {
	public static void main (String args[]) {
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if(i < j) System.out.println("i < j");
		if(i <= j) System.out.println("i <= j");
		if(i != j) System.out.println("i != j");
		if(i == j) System.out.println("i == j");
		if(i >= j) System.out.println("i >= j)");
		if( i > j) System.out.println("i > j");
		
		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("this won't execute"); //AND, && para AND Curto-Circuito
		if(!(b1 & b2)) System.out.println("!(b1 & b2) is true"); //NOT
		if(b1 | b2) System.out.println("b1 | b2 is true"); //OR, || para OR Curto-Circuito
		if(b1 ^ b2) System.out.println("b1 ^ b2 is true"); //XOR
	}
}

/*
 * The output of this code will be:
 * i < j
 * i <= j
 * i != j
 * !(b1 & b2) is true
 * b1 | b2 is true
 * b1 ^ b2 is true
*/
