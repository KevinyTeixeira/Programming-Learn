package ucb.lesson3.ex1.gettersAndSetters;

public class GettersAndSetters {

	// Statementes/Declarações
	public static double txDeJuros;
	public static double capital;
	public static double juros = 0;
	public static double total = 0;
	public static int tempo;
	
	// Getters and Setters
	public double getTxDeJuros() {
		return txDeJuros;
	}
	public void setTxDeJuros(double txDeJuros) {
		GettersAndSetters.txDeJuros = txDeJuros;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		GettersAndSetters.capital = capital;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		GettersAndSetters.juros = juros;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		GettersAndSetters.total = total;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		GettersAndSetters.tempo = tempo;
	}
	
}
