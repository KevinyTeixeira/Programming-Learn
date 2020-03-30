/*
 * S�ntese
 * Objetivo: � criar uma calculadora que efetue as seguintes opera��es: adi��o, subtra��o, divis�o, multiplica��o e expoente;
 * Entrada: dois valores (double) e o operador.
 * Sa�da: o resultado desta opera��o
 */
	
@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	

public class Calculadora {
	public static void main (String[] args) {
		double valorUm = Leitor.lerDouble("Informe o primeiro valor: ");
		char operador = Leitor.lerCaracter("Informe o operador: ");
		double valorDois = Leitor.lerDouble("Informe o segundo valor: ");
		double resultado = Matematica.calcular(valorUm, operador, valorDois);
		Impressora.print(valorUm, operador, valorDois, resultado);
	}
}