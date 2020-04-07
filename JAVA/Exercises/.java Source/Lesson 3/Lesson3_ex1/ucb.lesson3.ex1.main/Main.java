package ucb.lesson3.ex1.main;

import ucb.lesson3.ex1.gands.GandS;
import ucb.lesson3.ex1.methods.Visao;
import ucb.lesson3.reader.Leitor;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: receive from the user the monthly interest rate and the amount of the debt, then return the resulting interest for the late payment. However, interest must be calculated using a method;
In      : interest rate, debt value;
Out     : display the interest resulting from the late payment of the debt on screen;

[PT] Síntese
Objetivo: receber do usuário a taxa de juros mensal e o valor da dívida e, em seguida, devolver os juros resultantes do atraso no pagamento. No entanto, o juros deve ser calculado utilizando um método;
Entrada : taxa de juros, valor da dívida;
Saída   : apresentar na tela os juros resultantes pelo atraso do pagamento da dívida;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 1;

PACKAGES:

ucb.lesson3.ex1.main
- Main.java | The main class;

ucb.lesson3.ex1.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex1.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
		
	public static void main (String args[]) {

		// Collecting Data/Coletando Dados
		System.out.println("Prezado usuário, informe o valor da sua dívida (R$): ");
		GandS.setCapital(Leitor.lerDouble());
		System.out.println("Informe a quantos meses você não paga esta dívida: ");
		GandS.setTempo(Leitor.lerInt());
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		GandS.setTxDeJuros(Leitor.lerDouble());

		// Calculating Interest/Calculando Juros
		GandS.juros = Visao.calculatingInterest(GandS.getJuros(), GandS.getCapital(), GandS.getTxDeJuros(), GandS.getTempo(), GandS.getTotal());
		GandS.total = Visao.valorPG(GandS.getJuros(), GandS.getCapital(), GandS.getTotal());
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVocê informou que sua dívida é: %.2f reais;\n", GandS.getCapital());
		System.out.println("Você informou que não paga sua conta a: " + GandS.getTempo() + " meses;");
		System.out.printf("Você informou que a taxa de juros mensal do banco é: %.2f%%;\n", GandS.getTxDeJuros());
		System.out.printf("O juros acumulado é R$ %.2f reais.\nPortanto, sua dívida atualmente é R$ %.2f reais!", GandS.getJuros(), GandS.getTotal());
		
	}
}
