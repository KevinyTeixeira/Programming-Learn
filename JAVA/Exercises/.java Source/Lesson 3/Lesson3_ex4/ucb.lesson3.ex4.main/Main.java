package ucb.lesson3.ex4.main;

import ucb.lesson3.ex4.methods.Visao;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: create a program that returns the sum of a number entered by the user. A "Somatório" method must be created;
In      : number;
Out     : display the sum of the number read on the screen;

[PT] Síntese
Objetivo: criar um programa que retorne o somatório de um número inserido pelo usuário. Deve ser criado um método "Somatório";
Entrada : número;
Saída   : apresentar na tela o somatório do número lido;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 4;

PACKAGES:

ucb.lesson3.ex4.main
- Main.java | The main class;

ucb.lesson3.ex4.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex4.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		// Collecting data, performing sum and printing results/Coletando dados, efetuando somatório e imprimindo resultados
		Visao.somatorio(Visao.somatorioInit());	
		
	}
}
