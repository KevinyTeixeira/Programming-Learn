package ucb.lesson3.ex1.gands;

public class GandS {

	// Statementes/Declarações
	public static double txDeJuros;
	public static double capital;
	public static double juros = 0;
	public static double total = 0;
	public static int tempo;
	
	// Getters and Setters
	public static double getTxDeJuros() {
		return txDeJuros;
	}
	public static void setTxDeJuros(double txDeJuros) {
		GandS.txDeJuros = txDeJuros;
	}
	public static double getCapital() {
		return capital;
	}
	public static void setCapital(double capital) {
		GandS.capital = capital;
	}
	public static double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		GandS.juros = juros;
	}
	public static double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		GandS.total = total;
	}
	public static int getTempo() {
		return tempo;
	}
	public static void setTempo(int tempo) {
		GandS.tempo = tempo;
	}
	
}
