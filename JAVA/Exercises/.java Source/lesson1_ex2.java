/******************************************************************************
[EN] Synthesis
Objective: read a temperature in degrees Celsius and display it converted to degrees Fahrenheit;
In      : C temperature;
Out     : display the Fahrenheit temperature corresponding to the user entered Celsius temperature on the screen;

[PT] Síntese
Objetivo: ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit;
Entrada : Temperatura em °C;
Saída   : mostrar na tela os graus em Fahrenheit correspondentes aos graus em Celsius inseridos pelo usuário;

Autor: Keviny Teixeira
QUESTION FROM LESSON 1, EXERCISE 2;
*******************************************************************************/

import java.util.Scanner; // Required to read a user data insertion\Necessário para ler um dado inserido pelo usuário;

public class lesson1_ex2{
	
	public static void main (String args[]){

	// Statements/Declarações
	double CEL, FAR;
	
	System.out.printf("*INICIANDO PROGRAMA EM JAVA;");
	
	// Collecting entrys/Coletando entradas
    System.out.println("\n Informe um grau em escala Celsius: ");
    CEL = new Scanner(System.in).nextDouble( );
	
	// Converting Celsius to Fahrenheit/Convertendo Celsius para Fahrenheit
    System.out.printf("FAR = (9 * %.2f + 160)/5;", CEL);
	FAR = (9 * CEL + 160) / 5;
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
    System.out.printf("\nFAR = %.2f;", FAR);
	}
}