package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: read the age and height of later people and return the average height of people over 50. Use FOR;
In      : age, height;
Out     : display the average height of people over 50 years of age on screen;

[PT] Síntese
Objetivo: ler a idade e a altura de depois pessoas e retornar a média de alturas das pessoas com mais de 50 anos. Use FOR;
Entrada : idade, altura;
Saída   : apresentar na tela a média da altura das pessoas com mais de 50 anos de idade;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 4;
*******************************************************************************/

public class Lesson2_ex4 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int idade[] = new int [3];
		double altura[] = new double [3], media, soma =0;
		
		// Collecting Data/Coletando Dados
		for (int i = 0; i < idade.length; i++) {
			System.out.println("[" + i + "] Informe a idade desta pessoa: ");
			idade[i] = new Scanner(System.in).nextInt();
			System.out.println("[" + i + "] Informe a altura desta pessoa:");
			altura[i] = new Scanner(System.in).nextDouble();
			if (idade[i] > 50) {
				soma = soma + altura[i];				
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("MÉDIA = [Soma das Idades] / Qt de Idades;");
		System.out.println("MÉDIA = " + soma + "/ " + idade.length + ";");
		media = soma / idade.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A média das alturas das pessoas que contém mais de 50 anos é: " +  media);
	}
}