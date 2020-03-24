package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: read 500 integer and positive values and return the highest value, the lowest value and the average of the numbers read;
In      : numbers;
Out     : display on the screen based on the numbers read, the average, the lowest number and the highest number;

[PT] Síntese
Objetivo: ler 500 valores inteiros e positivos e retornar o maior valor, o menor valor e a média dos números lidos;
Entrada : numeros;
Saída   : apresentar na tela com base nos números lidos, a média, o menor número e o maior número;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 5;
*******************************************************************************/

public class Lesson2_ex5 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int Numero[] = new int [500], Maior = 0, Menor = 0, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Informe o número que irá compor o vetor" + "[" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) { //Identifying if this is the high number/Identificando se é o menor número
				System.out.println("Você não pode inserir números que sejam menores do que 0.");
			}
			}while (Numero[i] < 0);

			//Numero[i] = random.nextInt(10);
			if (Menor > Numero[i]) { //Identifying if this is the lower number/Identificando se é o menor número
				Menor = Numero[i];
				System.out.println("O menor número agora passa a ser: " + Menor + ";");
			}
			if (Maior < Numero[i]) { //Identifying if this is the high number/Identificando se é o menor número
				Maior = Numero[i];				
				System.out.println("O maior número agora passa a ser: " + Maior + ";");
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("MÉDIA = [SOMA DOS NÚMEROS] / QT DE NÚMEROS;");
		System.out.println("MÉDIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A média dos números lidos é: " +  Media);
		System.out.println("O menor número lido foi: " +  Menor);
		System.out.println("O maior número lido foi: " +  Maior);
	}
}