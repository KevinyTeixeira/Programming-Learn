
public class Matematica {
	
	public static double calcular (double valorUm, char operador, double valorDois) {
		double resultado;
		switch (operador) {
		case '+': resultado = somar (valorUm, valorDois);
			break;
		case '-': resultado = subtracao (valorUm, valorDois);
			break;
		case '*': resultado = multiplicacao (valorUm, valorDois);
			break;
		case '/': resultado = divisao (valorUm, valorDois);
			break;
		case 'e': resultado = expoente (valorUm, valorDois);
			break;
		default: resultado = -1;
			break;
		}
		return resultado;
	}
	
	public static double expoente(double base, double expoenteFlutuante) {
		int expoente = (int)expoenteFlutuante;
		double resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	public static double divisao(double valorUm, double valorDois) {
		if (valorDois == 0)
			return -1;
		return valorUm / valorDois;
	}	
	public static double multiplicacao(double valorUm, double valorDois) {
		return valorUm * valorDois;
	}	
	public static double subtracao(double valorUm, double valorDois) {
		return valorUm - valorDois;
	}
	public static double somar(double valorUm, double valorDois) {
		return valorUm + valorDois;
	}
	
}
