package ucb.lesson3.ex1.methods;

public class Visao {

	public static double calculatingInterest(double juros, double capital, double txDeJuros, int tempo, double total) {
		System.out.println("");
		System.out.println("*CALCULANDO JUROS:");
		System.out.println("Juros = Taxa de Juros * Tempo;");
		System.out.printf("Juros = %.2f * %.2f * %d;\n", capital, txDeJuros, tempo);
		juros = capital * txDeJuros * tempo;
		System.out.println("Total = Capital + Juros;");
		System.out.printf("Total = %.2f + %.2f;\n", capital, juros);
		total = capital + juros;
		return total;
		
	}
}
