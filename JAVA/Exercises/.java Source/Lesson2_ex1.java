package lesson2;

import java.util.Scanner; // Required to read a user data insertion\Necessário para ler um dado inserido pelo usuário;

/******************************************************************************
[EN] Synthesis
Objective: receive two notes from the user and perform the arithmetic mean of these values;
In      : grade;
Out     : display the informed grades, the average and whether the student achieved approval or not;

[PT] Síntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : salário do professor, idade de uma criança, se um servidor público tem plano de saúde ou não, se uma pessoa é casa (c) ou solteira (s) e, por fim, o nome do aluno;
Saída   : apresentar na tela os dados informados pelo usuário;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 1;
*******************************************************************************/

/*Crie um projeto Java no ambiente eclipse (sugestão de nome de projeto - Aula2Exercicio1).
 *  Na sequência, crie uma classe com o nome Programa. Nesta classe, você deve fazer a entrada de dados das seguintes informações: 
 *  o salário de um professor (double), a idade de uma criança (int), se um servidor público tem plano de saúde ou não (boolean), se uma pessoa é casada (c) ou solteira (s) (boolean) e, por fim, o nome de um aluno (String).
Ao terminar as entradas de dados, você deve fazer a apresentação dos valores utilizando System.out.println(). 
Além disso, coloque textos com valor significativo para o usuário, por exemplo: "O nome informado foi: João Silveira Neto".
*/
public class Lesson2_ex1 {
	
	public void main (String args[]) {
	
	// Statementes/Declarações
		boolean plano_de_saude = false;
		String nome_aluno, casado_ou_solteiro;
		char resposta;
		int idade_crianca;
		double sl_professor;
		
		System.out.println("Informe o nome do aluno: ");
			nome_aluno = new Scanner(System.in).next().nextLine( );
		System.out.println("Informe a idade da criança: ");
			idade_crianca = new Scanner(System.in).next().nextInt( );
		System.out.println("Informe o salário do professor: ");
			sl_professor = new Scanner(System.in).next().nextDouble( );
		System.out.println("O aluno tem plano tem plano de saúde? (S/N)");
			resposta = new Scanner(System.in).next().charAt(0);
			if(resposta == 'S') plano_de_saude = true;
		System.out.println("O aluno é casado ou solteiro? (S/N)");
		casado_ou_solteiro = new Scanner(System.in).next().nextLine();
		
		System.out.println("O nome do aluno informado foi: "+ nome_aluno);
		System.out.println("A idade da criança informada foi: "+ idade_crianca);
		System.out.println("O salário do professor informado foi: "+ sl_professor);
			if(plano_de_saude == true) {
				System.out.println("Foi informado que o aluno possui plano de saúde."); }
			else if(plano_de_saude == false) {
					System.out.println("Foi informado que o aluno não tem plano de saúde.");
				}
			else {
				System.out.println("O usuário não usou caracteres válidos para a responder.");
			}
			if(casado_ou_solteiro == "S") {
				System.out.println("Foi informado que o aluno possui plano de saúde.");}
			else if(casado_ou_solteiro == "N") {
					System.out.println("Foi informado que o aluno não tem plano de saúde.");
				}
			else {
				System.out.println("O usuário não usou caracteres válidos para a responder.");
		}
	}
}
