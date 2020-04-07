package ucb.lesson3.ex1.main;

import ucb.lesson3.ex1.gettersAndSetters.GettersAndSetters;
import ucb.lesson3.ex1.methods.Visao;
import ucb.lesson3.reader.Leitor;

	/******************************************************************************
	[EN] Synthesis
	Objective: receive from the user the monthly interest rate and the amount of the debt, then return the resulting interest for the late payment;
	In      : interest rate, debt value;
	Out     : display the interest resulting from the late payment of the debt on screen;

	[PT] Síntese
	Objetivo: receber do usuário a taxa de juros mensal e o valor da dívida e, em seguida, devolver os juros resultantes do atraso no pagamento;
	Entrada : taxa de juros, valor da dívida;
	Saída   : apresentar na tela os juros resultantes pelo atraso do pagamento da dívida;

	Autor: Keviny Teixeira
	QUESTION FROM LESSON 2, EXERCISE 2;
	*******************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
		
	public static void main (String args[]) {

		// Collecting Data/Coletando Dados
		System.out.println("Prezado usuário, informe o valor da sua dívida (R$): ");
		GettersAndSetters.capital = Leitor.lerDouble();
		System.out.println("Informe a quantos meses você não paga esta dívida: ");
		GettersAndSetters.tempo = Leitor.lerInt();
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		GettersAndSetters.txDeJuros = Leitor.lerDouble();

		// Calculating Interest/Calculando Juros
		GettersAndSetters.total = Visao.calculatingInterest(GettersAndSetters.juros, GettersAndSetters.capital, GettersAndSetters.txDeJuros, GettersAndSetters.tempo, GettersAndSetters.total);
			
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVocê informou que sua dívida é: %.2f reais;\n", GettersAndSetters.capital);
		System.out.println("Você informou que não paga sua conta a: " + GettersAndSetters.tempo + " meses;");
		System.out.printf("Você informou que a taxa de juros mensal do banco é: %.2f%%;\n", GettersAndSetters.txDeJuros);
		System.out.printf("O juros acumulado é R$ %.2f reais.\nPortanto, sua dívida atualmente é R$ %.2f reais!", GettersAndSetters.juros, GettersAndSetters.total);
	}
}
