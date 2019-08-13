/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra a sequência de escapes em strings, Arquivo StrDemo.java.
*/
public class StrDemo {
	public static void main (String args[]) {
		System.out.println("First line \nSecond line"); // Utilizamos \n para saltar uma nova linha;
		System.out.println("A\tB\tC"); // utilizamos \t para gerar uma tabulação horizontal;
		System.out.println("D\tE\tF"); // utilizamos \t para gerar uma tabulação horizontal;
	}
}

/*
 * All escape sequences below:
 * \' - Aspas simples;
 * \" - Aspas duplas;
 * \\ - Barra Invertida;
 * \r - Retorno de carro;
 * \n - Nova linha;
 * \f - Avanço de página;
 * \t - Tabulação horizontal;
 * \b - Retrocesso;
 * \ddd - Constante octal (onde ddd é uma constante octal, números de 0 a 7 contendo apenas 8 números);
*/

/*
 * The output of this code will be:
 * First line 
 * Second line
 * A	B	C
 * D	E	F
*/