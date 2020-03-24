package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: read 500 integer and positive values and return the highest value, the lowest value and the average of the numbers read;
In      : numbers;
Out     : display on the screen based on the numbers read, the average, the lowest number and the highest number;

[PT] S�ntese
Objetivo: ler 500 valores inteiros e positivos e retornar o maior valor, o menor valor e a m�dia dos n�meros lidos;
Entrada : numeros;
Sa�da   : apresentar na tela com base nos n�meros lidos, a m�dia, o menor n�mero e o maior n�mero;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 5;
*******************************************************************************/

public class Lesson2_ex5 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		int Numero[] = new int [500], Maior = 0, Menor = 0, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Informe o n�mero que ir� compor o vetor" + "[" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) { //Identifying if this is the high number/Identificando se � o menor n�mero
				System.out.println("Voc� n�o pode inserir n�meros que sejam menores do que 0.");
			}
			}while (Numero[i] < 0);

			//Numero[i] = random.nextInt(10);
			if (Menor > Numero[i]) { //Identifying if this is the lower number/Identificando se � o menor n�mero
				Menor = Numero[i];
				System.out.println("O menor n�mero agora passa a ser: " + Menor + ";");
			}
			if (Maior < Numero[i]) { //Identifying if this is the high number/Identificando se � o menor n�mero
				Maior = Numero[i];				
				System.out.println("O maior n�mero agora passa a ser: " + Maior + ";");
			}
		}

		// Calculating Mean/Calculando M�dia
		System.out.println("M�DIA = [SOMA DOS N�MEROS] / QT DE N�MEROS;");
		System.out.println("M�DIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A m�dia dos n�meros lidos �: " +  Media);
		System.out.println("O menor n�mero lido foi: " +  Menor);
		System.out.println("O maior n�mero lido foi: " +  Maior);
	}
}