package lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: receive the input data and present it on the screen;
In      : teacher's salary, age of a child, whether a civil servant has health insurance or not, whether a person is married (c) or single (s) and, finally, the student's name;
Out     : display the data entered by the user on the screen;

[PT] S�ntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : sal�rio do professor, idade de uma crian�a, se um servidor p�blico tem plano de sa�de ou n�o, se uma pessoa � casada (c) ou solteira (s) e, por fim, o nome do aluno;
Sa�da   : apresentar na tela os dados informados pelo usu�rio;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 1;
*******************************************************************************/

public class Lesson2_ex1 {
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		String nome_aluno;
		char plano_de_saude, casado_ou_solteiro;
		int idade_crianca;
		double sl_professor;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do aluno: ");
		nome_aluno = new Scanner(System.in).nextLine();
		System.out.println("Informe a idade da crian�a: ");
		idade_crianca = new Scanner(System.in).nextInt();
		System.out.println("Informe o sal�rio do professor: ");
		sl_professor = new Scanner(System.in).nextDouble();
		System.out.println("O aluno tem plano tem plano de sa�de? (S/N)");
		plano_de_saude = new Scanner(System.in).next().charAt(0);
		System.out.println("O aluno � casado ou solteiro? (C/S)");
		casado_ou_solteiro = new Scanner(System.in).next().charAt(0);
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O nome do aluno informado foi: "+ nome_aluno);
		System.out.println("A idade da crian�a informada foi: "+ idade_crianca);
		System.out.println("O sal�rio do professor informado foi: "+ sl_professor);
			if (plano_de_saude == 'S') {
				System.out.println("Foi informado que o aluno possui plano de sa�de."); 
				}
			else if (plano_de_saude == 'N') {
					System.out.println("Foi informado que o aluno n�o tem plano de sa�de.");
				}
			else {
				System.out.println("O usu�rio n�o usou caracteres v�lidos para a responder se tem plano de sa�de ou n�o.");
				}
			if(casado_ou_solteiro == 'C') {
				System.out.println("Foi informado que o aluno � casado.");
				}
			else if (casado_ou_solteiro == 'S') {
					System.out.println("Foi informado que o aluno � solteiro.");
				}
			else {
				System.out.println("O usu�rio n�o usou caracteres v�lidos para a responder se � casado ou n�o.");
		}
	}
}