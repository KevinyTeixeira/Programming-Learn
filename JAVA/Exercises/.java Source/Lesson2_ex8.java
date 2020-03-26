package Lesson2;

import java.util.Scanner;

/************************************************************************************************************************************************************************
[EN] Synthesis
Objective: receive 5,000 integers from the user without accepting negative numbers, and finally, demonstrate the average, the numbers read and the number of odd numbers;
In      : numbers;
Out     : display the numbers read, the average and number of odd numbers on screen;

[PT] S�ntese
Objetivo: receber 5 mil n�meros inteiros do usu�rio sem aceitar n�meros negativos, e por fim, demonstrar a m�dia, os n�meros lidos e a quantidade de n�meros �mpares;
Entrada : n�meros;
Sa�da   : apresentar na tela os n�meros lidos, a m�dia e quantidade de n�meros �mpares;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 8;
************************************************************************************************************************************************************************/

public class Lesson2_ex8 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		int Numero[] = new int [5000], QtImpar = 0, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		System.out.println("Voc� precisar� popular 5 mil vetores. (Somente N�meros Inteiros e Positivos)");
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Insira um n�mero para o vetor [" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) {
				System.out.println("N�o � permitido n�meros negativos, insira somente n�meros positivos");
			} 		
			}while (Numero[i] < 0);
			if (Numero[i] % 2 != 0) {
				QtImpar++;
			}
			Soma = Soma + Numero[i];
		}

		// Calculating Mean/Calculando M�dia
		System.out.println("");
		System.out.println("# CALCULANDO M�DIA");
		System.out.println("M�DIA = [SOMA DOS N�MEROS] / QT DE N�MEROS;");
		System.out.println("M�DIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		for (int i = 0; i < Numero.length; i++) {
			System.out.print(" [" + i + "] = " + Numero[i] + ";");
		}
		System.out.println("");
		System.out.println("A m�dia dos n�meros lidos foi: " + Media + ";");
		System.out.println("O total de n�meros �mpares lidos foi: " + QtImpar + ";");
	}
}