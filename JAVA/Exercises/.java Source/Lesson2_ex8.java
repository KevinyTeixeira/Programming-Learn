package Lesson2;

import java.util.Scanner;

/************************************************************************************************************************************************************************
[EN] Synthesis
Objective: receive 5,000 integers from the user without accepting negative numbers, and finally, demonstrate the average, the numbers read and the number of odd numbers;
In      : numbers;
Out     : display the numbers read, the average and number of odd numbers on screen;

[PT] Síntese
Objetivo: receber 5 mil números inteiros do usuário sem aceitar números negativos, e por fim, demonstrar a média, os números lidos e a quantidade de números ímpares;
Entrada : números;
Saída   : apresentar na tela os números lidos, a média e quantidade de números ímpares;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 8;
************************************************************************************************************************************************************************/

public class Lesson2_ex8 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int Numero[] = new int [5000], QtImpar = 0, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		System.out.println("Você precisará popular 5 mil vetores. (Somente Números Inteiros e Positivos)");
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Insira um número para o vetor [" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) {
				System.out.println("Não é permitido números negativos, insira somente números positivos");
			} 		
			}while (Numero[i] < 0);
			if (Numero[i] % 2 != 0) {
				QtImpar++;
			}
			Soma = Soma + Numero[i];
		}

		// Calculating Mean/Calculando Média
		System.out.println("");
		System.out.println("# CALCULANDO MÉDIA");
		System.out.println("MÉDIA = [SOMA DOS NÚMEROS] / QT DE NÚMEROS;");
		System.out.println("MÉDIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		for (int i = 0; i < Numero.length; i++) {
			System.out.print(" [" + i + "] = " + Numero[i] + ";");
		}
		System.out.println("");
		System.out.println("A média dos números lidos foi: " + Media + ";");
		System.out.println("O total de números ímpares lidos foi: " + QtImpar + ";");
	}
}