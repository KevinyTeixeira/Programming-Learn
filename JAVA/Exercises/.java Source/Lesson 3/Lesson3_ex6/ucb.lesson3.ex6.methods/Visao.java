package ucb.lesson3.ex6.methods;

import ucb.lesson3.ex6.gands.GandS;

public class Visao {

	public static void Somar (int numero) {
		System.out.println("");
		System.out.println("*EFETUANDO SOMA");
		System.out.printf("S =");
		for (int i = 1; i <= numero; i++) {
			System.out.printf(" [1 + %d]", i);
			GandS.setResultado(GandS.getResultado() + 1 + i);
			if (i == numero)
				System.out.printf(";");
		}
		System.out.printf("\n\nO resultado da soma é: %d;", GandS.getResultado());

	}
}
