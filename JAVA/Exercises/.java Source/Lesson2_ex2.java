package Lesson2;

import java.util.Scanner;

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

public class Lesson2_ex2 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		double TxDeJuros, Capital, Juros, Total;
		int Tempo;
		
		// Collecting Data/Coletando Dados
		System.out.println("Prezado usuário, informe o valor da sua dívida (R$): ");
		Capital = new Scanner(System.in).nextDouble();
		System.out.println("Informe a quantos meses você não paga esta dívida: ");
		Tempo = new Scanner(System.in).nextInt();
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		TxDeJuros = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		Juros = Capital * TxDeJuros * Tempo;
		Total = Capital * Juros;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVocê informou que sua dívida é: %.2f reais;\n", Capital);
		System.out.println("Você informou que não paga sua conta a: " + Tempo + " meses;");
		System.out.printf("Você informou que a taxa de juros mensal do banco é: %.2f%%;\n", TxDeJuros);
		System.out.printf("O juros acumulado é R$ %.2f reais.\nPortanto, sua dívida atualmente é R$ %.2f reais!", Juros, Total);
	}
}