/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Ediçao; Herbert Schildt;
*/
/* 
 * Demonstra o funcionamento do tipo de caractere char, Arquivo CharArithDemo.java.
*/

public class CharArithDemo {
	public static void main (String args[]) {
	char ch;
	
	ch = 'X';
	System.out.println("ch countains: " + ch);
	
	ch++; // incrementa ch. Um char pode ser incrementado
	System.out.println("ch countains: " + ch);
	
	ch = 90; // atribui o caractere 90 da sequência ASCII
	System.out.println("ch countains: " + ch);
	}
}

/*
 * The output of this code will be:
 * ch countains: X
 * ch countains: Y
 * ch countains: Z
*/
