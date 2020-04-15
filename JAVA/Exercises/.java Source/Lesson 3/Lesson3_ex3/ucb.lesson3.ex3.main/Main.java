package ucb.lesson3.ex3.main;

import ucb.lesson3.ex3.GandS.GandS;
import ucb.lesson3.ex3.methods.Visao;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: create a calculator that performs addition, subtraction, multiplication, division and exponent operations. The code must contain the maximum number of possible methods;
In      : numbers;
Out     : display on screen the results of the operations made with the numbers read;

[PT] S�ntese
Objetivo: criar uma calculadora que execute as opera��es de adi��o, subtra��o, multiplica��o, divis�o e expoente. O c�digo deve conter o m�ximo n�mero de m�todos poss�veis que conseguir descentralizar;
Entrada : n�meros;
Sa�da   : apresentar na tela os resultados das opera��es feitas com os n�meros lidos;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 3;

PACKAGES:

ucb.lesson3.ex3.main
- Main.java | The main class;

ucb.lesson3.ex3.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex3.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		// Collecting data/Coletando dados
		Visao.calculatorInit();
		// Performing calculations/Efetuando c�lculos
		Visao.calcular(GandS.getNumero1(), GandS.getNumero2(), GandS.getOperador(), GandS.getResultado());
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		Visao.imprimir(GandS.getNumero1(), GandS.getNumero2(), GandS.getOperador(), GandS.getResultado());		
		
	}
}
