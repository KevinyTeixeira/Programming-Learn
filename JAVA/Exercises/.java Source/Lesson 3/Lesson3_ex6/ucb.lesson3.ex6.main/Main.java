package ucb.lesson3.ex6.main;

import ucb.lesson3.ex6.gands.GandS;
import ucb.lesson3.ex6.methods.Visao;
import ucb.lesson3.reader.Leitor;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: create a program that reads an integer and positive number and returns an "somar" method, making the sum as follows: S: = 1 + 1/2 + 1/3 + 1/4 + ... + 1 / n; where n is the number read;
In      : number;
Out     : display the sum and its result on screen;

[PT] Síntese
Objetivo: criar um programa que leia um número inteiro e positivo e retorne um método "somar", fazendo a soma da seguinte forma: S:= 1 + 1/2 + 1/3 + 1/4 + ... + 1/n; em que n é o número lido;
Entrada : número;
Saída   : apresentar na tela o resultado a soma e seu resultado;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 6;

PACKAGES:

ucb.lesson3.ex6.main
- Main.java | The main class;

ucb.lesson3.ex6.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex6.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		//Collecting data/Coletando dados
		System.out.println("Insira o número em que deseja executar a operação: ");
		GandS.setNumero(Leitor.lerInt());
		
		//Performing sum and printing results/Efetuando soma e imprimindo resultados
		Visao.Somar(GandS.getNumero());	
		
	}
}
