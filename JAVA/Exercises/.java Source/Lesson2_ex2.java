package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: receive from the user the monthly interest rate and the amount of the debt, then return the resulting interest for the late payment;
In      : interest rate, debt value;
Out     : display the interest resulting from the late payment of the debt on screen;

[PT] S�ntese
Objetivo: receber do usu�rio a taxa de juros mensal e o valor da d�vida e, em seguida, devolver os juros resultantes do atraso no pagamento;
Entrada : taxa de juros, valor da d�vida;
Sa�da   : apresentar na tela os juros resultantes pelo atraso do pagamento da d�vida;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 2;
*******************************************************************************/

public class Lesson2_ex2 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		double TxDeJuros, Capital, Juros, Total;
		int Tempo;
		
		// Collecting Data/Coletando Dados
		System.out.println("Prezado usu�rio, informe o valor da sua d�vida (R$): ");
		Capital = new Scanner(System.in).nextDouble();
		System.out.println("Informe a quantos meses voc� n�o paga esta d�vida: ");
		Tempo = new Scanner(System.in).nextInt();
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		TxDeJuros = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		Juros = Capital * TxDeJuros * Tempo;
		Total = Capital * Juros;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVoc� informou que sua d�vida �: %.2f reais;\n", Capital);
		System.out.println("Voc� informou que n�o paga sua conta a: " + Tempo + " meses;");
		System.out.printf("Voc� informou que a taxa de juros mensal do banco �: %.2f%%;\n", TxDeJuros);
		System.out.printf("O juros acumulado � R$ %.2f reais.\nPortanto, sua d�vida atualmente � R$ %.2f reais!", Juros, Total);
	}
}