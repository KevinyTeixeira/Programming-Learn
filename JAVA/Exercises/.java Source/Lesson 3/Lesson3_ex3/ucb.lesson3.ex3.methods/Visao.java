package ucb.lesson3.ex3.methods;

import ucb.lesson3.ex3.GandS.GandS;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static void calculatorInit() {
		
		System.out.println("Insira o primeiro valor: ");
		GandS.setNumero1(Leitor.lerDouble());
		System.out.println("Insira o segundo valor: ");
		GandS.setNumero2(Leitor.lerDouble());
		System.out.println("");
		System.out.println("Insira qual operação deseja fazer: ");
		System.out.println("[+] Soma;");
		System.out.println("[-] Subtração;");
		System.out.println("[*] Multiplicação;");
		System.out.println("[/] Divisão;");
		System.out.println("[e] Expoente;");
		GandS.setOperador(Leitor.lerCaracter());
		
	}
	
	public static void calcular(double numero1, double numero2, char operador, double resultado) {
	
	switch (GandS.getOperador()) {
	
		case '+':
			GandS.setResultado(soma(GandS.getNumero1(),GandS.getNumero2()));
			break;
			
		case '-':
			GandS.setResultado(subtracao(GandS.getNumero1(),GandS.getNumero2()));
			break;
			
		case '*':
			GandS.setResultado(multiplicacao(GandS.getNumero1(),GandS.getNumero2()));
			break;
			
		case '/':
			GandS.setResultado(divisao(GandS.getNumero1(),GandS.getNumero2()));
			break;
			
		case 'e':
			GandS.setResultado(expoente(GandS.getNumero1(),GandS.getNumero2()));
			break;
			
		default:
			System.out.println("Você não inseriu nenhum operador válido. O programa foi encerrado.");

		}
	}
	
	public static void imprimir(double numero1, double numero2, char operador, double resultado) {
		System.out.println("");
		System.out.println("RESULTADO: " + GandS.getNumero1() + " " + GandS.getOperador() + " " + GandS.getNumero2() + " = " + GandS.getResultado());
		calculatorEnding();
	}
	
	//Arithmetic Operations
	public static double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
	public static double subtracao(double numero1, double numero2) {
		return numero1 - numero2;
	}
	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}
	public static double divisao(double numero1, double numero2) {
		if (numero2 == 0) {
			return -1;
		} else
			return numero1 / numero2;
	}
	public static double expoente(double base, double expoenteFlutuante) {
		int expoente = (int)expoenteFlutuante;
		double resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	
	public static void calculatorEnding() {
		String resposta;
		System.out.println("");
		System.out.println("Operação finalizada! Deseja efetuar outro cálculo?");
		System.out.println("[SIM] - O programa retornará para o início;");
		System.out.println("[NÃO] - O programa será encerrado;");
		resposta = Leitor.lerString();
		if (resposta == "SIM") {
			System.out.println("");
			calculatorInit();
		} else if (resposta == "NÃO") {
			System.out.println("Programa encerrado.");
			System.exit(0);	
		} else
			System.out.println("Você não deu uma resposta válida. Programa encerrado!");
	}
}
