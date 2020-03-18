package lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: receive the input data and present it on the screen;
In      : teacher's salary, age of a child, whether a civil servant has health insurance or not, whether a person is married (c) or single (s) and, finally, the student's name;
Out     : display the data entered by the user on the screen;

[PT] Síntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : salário do professor, idade de uma criança, se um servidor público tem plano de saúde ou não, se uma pessoa é casada (c) ou solteira (s) e, por fim, o nome do aluno;
Saída   : apresentar na tela os dados informados pelo usuário no sistema;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 1;
*******************************************************************************/

public class Lesson2_ex1 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {

	
		// Statementes/Declarações
		String nomeAluno;
		char planoDeSaude, CasadoOuSolteiro;
		int idadeCrianca;
		double slProfessor;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do aluno: ");
		nomeAluno = new Scanner(System.in).nextLine();
		System.out.println("Informe a idade da criança: ");
		idadeCrianca = new Scanner(System.in).nextInt();
		System.out.println("Informe o salário do professor: ");
		slProfessor = new Scanner(System.in).nextDouble();
		do{
			System.out.println("O aluno tem plano tem plano de saúde? (S/N)");
			planoDeSaude = new Scanner(System.in).next().charAt(0);
			if (planoDeSaude !='S' && planoDeSaude !='N') {
				System.out.println("O usuário não usou caracteres válidos para responder se tem plano de saúde ou não. Por favor, insira S (para Sim) ou N (para Não)."); 
				System.out.println("RESPOSTA: " + planoDeSaude); 
			}
		}while(planoDeSaude !='S' && planoDeSaude !='N');
		do{
			System.out.println("O aluno é casado ou solteiro? (C/S)");
			CasadoOuSolteiro = new Scanner(System.in).next().charAt(0);
			if (CasadoOuSolteiro !='C' && CasadoOuSolteiro !='S') {
				System.out.println("O usuário não usou caracteres válidos para responder se é casado ou não. Por favor, insira C (para Casado) ou S (para Solteiro)."); 
			}
		}while(CasadoOuSolteiro !='C' && CasadoOuSolteiro !='S');
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O nome do aluno informado foi: "+ nomeAluno);
		System.out.println("A idade da criança informada foi: "+ idadeCrianca);
		System.out.println("O salário do professor informado foi: "+ slProfessor);
		if(planoDeSaude =='S'){
			System.out.println("Foi informado que o aluno tem plano de saúde.");
		}else{
			System.out.println("Foi informado que o aluno não tem plano de saúde.");
		}
		if(CasadoOuSolteiro =='C'){
			System.out.println("Foi informado que o aluno é casado.");
		}else{
			System.out.println("Foi informado que o aluno é solteiro.");
		}
	}
}
