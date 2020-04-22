package ucb.lesson3.ex5.main;

import ucb.lesson3.ex5.methods.Visao;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: create a program that receives an integer and makes it possible to return (by user's choice), the factorial, the largest value, whether it is an even number or a prime number;
In      : number;
Out     : present the result chosen by the user on the screen;

[PT] S�ntese
Objetivo: criar um programa que recebe um n�mero inteiro e possibilite retornar (pela escolha do usu�rio), o fatorial, o maior valor, se � um n�mero par ou se � um n�mero primo;
Entrada : n�mero;
Sa�da   : apresentar na tela o resultado escolhido pelo usu�rio;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 5;

PACKAGES:

ucb.lesson3.ex5.main
- Main.java | The main class;

ucb.lesson3.ex5.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex5.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		// Collecting data, performing sum and printing results/Coletando dados, efetuando somat�rio e imprimindo resultados
		Visao.MyMath();	
		
	}
}
