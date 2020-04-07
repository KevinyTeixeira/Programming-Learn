package ucb.lesson3.ex2.methods;

import java.util.Scanner;

public class Visao {

	//Case 1
	public static void upperCase(String texto) {
		System.out.println("");
		String upper = texto.toUpperCase();
		System.out.println(upper);
	}
	
	//Case 2
	public static void lowerCase(String texto) {
		System.out.println("");
		String lower = texto.toLowerCase();
		System.out.println(lower);
	}
	
	//Case 3
	public static void contChar(String texto) {
		System.out.println("");
		int lenght = texto.length();
		System.out.println(lenght);
	}
	
	//Case 4
	public static void checkIf(String texto) {
		System.out.println("");
		boolean b = texto.equals("Eu estou aprendendo java");
		if (b == true)
			System.out.println("Você está! :)");
		else
			System.out.println("Você não está! :(");
	}
	
	//Case 5
	public static void contWords(String texto) {
		int contWords = 0;
		System.out.println("");
		try (Scanner sc = new Scanner(texto)) {
			sc.useDelimiter("[,;:.!? ]");
			while (sc.hasNext()) {
				String proximaPalavra = sc.next();
				if (proximaPalavra.length() > 0) contWords++;
			}
		}
		if (contWords == 1)
		System.out.println("foi encontrada " + contWords + " palavra.");
		else if (contWords > 1)
		System.out.println("Foram econtradas " + contWords + " palavras.");
		else
		System.out.println("Nenhuma palavra foi encontrada.");
	}
	
}