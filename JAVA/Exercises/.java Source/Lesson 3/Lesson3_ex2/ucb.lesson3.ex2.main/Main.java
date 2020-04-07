package ucb.lesson3.ex2.main;

import ucb.lesson3.ex2.gands.GandS;
import ucb.lesson3.ex2.methods.Visao;
import ucb.lesson3.reader.Leitor;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: receive from the user the monthly interest rate and the amount of the debt, then return the resulting interest for the late payment. However, interest must be calculated using a method;
In      : interest rate, debt value;
Out     : display the interest resulting from the late payment of the debt on screen;

[PT] S�ntese
Objetivo: receber do usu�rio uma String e manipular a entrada para gerar: a String em UPPERCASE, em Lower Case, a quantidade de caracteres que cont�m, verificar se a frase � igual a "Eu estou estudando java" e a quantidade de palavras que a String possui;
Entrada : String;
Sa�da   : apresentar na tela as manipula��es feitas com a vari�vel String;

Autor: Keviny Teixeira
QUESTION FROM LESSON 3, EXERCISE 2;

PACKAGES:

ucb.lesson3.ex2.main
- Main.java | The main class;

ucb.lesson3.ex2.methods
- Visao.java | All methods used in this source are here;

ucb.lesson3.ex2.gands
- GandS.java | The variables and Getters and Setters;

ucb.lesson3.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		// Statementes/Declara��es
		
		System.out.println("Insira um texto aqui: ");
		GandS.setTexto(Leitor.lerString());
		
		System.out.println("");
		System.out.println("Escolha o que deseja retornar: ");
		System.out.println("[1] A string em caixa alta;");
		System.out.println("[2] A string em caixa baixa;");
		System.out.println("[3] A quantidade de caracteres;");
		System.out.println("[4] Verificar se a string � igual a 'Eu estou aprendendo java';");
		System.out.println("[5] Verificar a quantidade de palavras que a string possui';");
		GandS.setOperacao(Leitor.lerInt());
		
		switch (GandS.getOperacao()) {
		
		case 1:
			Visao.upperCase(GandS.getTexto());
			break;
		case 2:
			Visao.lowerCase(GandS.getTexto());
			break;
		case 3:
			Visao.contChar(GandS.getTexto());
			break;
		case 4:
			Visao.checkIf(GandS.getTexto());
			break;
		case 5:
			Visao.contWords(GandS.getTexto());
			break;
			
		default:
			System.out.println("Voc� n�o inseriu nenhum n�mero v�lido. O programa foi encerrado.");
		}
	}
}
