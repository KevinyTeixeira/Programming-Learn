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
		int numero[] = new int [500], maior = 0, menor = 999999999, soma = 0;
		double media;

		// Collecting Data/Coletando Dados
		for (int i = 0; i < numero.length; i++) {
			do {
			System.out.println("Informe o número que irá compor o vetor" + "[" + i + "]: ");
			numero[i] = new Scanner(System.in).nextInt();
			if (numero[i] < 0) { //Loop if number is lower then 0/Gera um Loope se o número for menor que 0
				System.out.println("Você não pode inserir números que sejam menores do que 0.");
			}
			}while (numero[i] < 0);
			if (menor > numero[i]) { //Identifying if this is the lower number/Identificando se é o menor número
				menor = numero[i];
				System.out.println("O menor número agora passa a ser: " + menor + ";");
			}
			if (maior < numero[i]) { //Identifying if this is the high number/Identificando se é o maior número
				maior = numero[i];				
				System.out.println("O maior número agora passa a ser: " + maior + ";");
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("MÉDIA = [SOMA DOS NÚMEROS] / QT DE NÚMEROS;");
		System.out.println("MÉDIA = " + soma + " / " + numero.length + ";");
		media = soma / numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A média dos números lidos é: " +  media);
		System.out.println("O menor número lido foi: " +  menor);
		System.out.println("O maior número lido foi: " +  maior);
	}
}