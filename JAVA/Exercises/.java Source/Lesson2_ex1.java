package lesson2;

import java.util.Scanner; // Required to read a user data insertion\Necess�rio para ler um dado inserido pelo usu�rio;

/******************************************************************************
[EN] Synthesis
Objective: receive two notes from the user and perform the arithmetic mean of these values;
In      : grade;
Out     : display the informed grades, the average and whether the student achieved approval or not;

[PT] S�ntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : sal�rio do professor, idade de uma crian�a, se um servidor p�blico tem plano de sa�de ou n�o, se uma pessoa � casa (c) ou solteira (s) e, por fim, o nome do aluno;
Sa�da   : apresentar na tela os dados informados pelo usu�rio;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 1;
*******************************************************************************/

/*Crie um projeto Java no ambiente eclipse (sugest�o de nome de projeto - Aula2Exercicio1).
 *  Na sequ�ncia, crie uma classe com o nome Programa. Nesta classe, voc� deve fazer a entrada de dados das seguintes informa��es: 
 *  o sal�rio de um professor (double), a idade de uma crian�a (int), se um servidor p�blico tem plano de sa�de ou n�o (boolean), se uma pessoa � casada (c) ou solteira (s) (boolean) e, por fim, o nome de um aluno (String).
Ao terminar as entradas de dados, voc� deve fazer a apresenta��o dos valores utilizando System.out.println(). 
Al�m disso, coloque textos com valor significativo para o usu�rio, por exemplo: "O nome informado foi: Jo�o Silveira Neto".
*/
public class Lesson2_ex1 {
	
	public void main (String args[]) {
	
	// Statementes/Declara��es
		boolean plano_de_saude = false;
		String nome_aluno, casado_ou_solteiro;
		char resposta;
		int idade_crianca;
		double sl_professor;
		
		System.out.println("Informe o nome do aluno: ");
			nome_aluno = new Scanner(System.in).next().nextLine( );
		System.out.println("Informe a idade da crian�a: ");
			idade_crianca = new Scanner(System.in).next().nextInt( );
		System.out.println("Informe o sal�rio do professor: ");
			sl_professor = new Scanner(System.in).next().nextDouble( );
		System.out.println("O aluno tem plano tem plano de sa�de? (S/N)");
			resposta = new Scanner(System.in).next().charAt(0);
			if(resposta == 'S') plano_de_saude = true;
		System.out.println("O aluno � casado ou solteiro? (S/N)");
		casado_ou_solteiro = new Scanner(System.in).next().nextLine();
		
		System.out.println("O nome do aluno informado foi: "+ nome_aluno);
		System.out.println("A idade da crian�a informada foi: "+ idade_crianca);
		System.out.println("O sal�rio do professor informado foi: "+ sl_professor);
			if(plano_de_saude == true) {
				System.out.println("Foi informado que o aluno possui plano de sa�de."); }
			else if(plano_de_saude == false) {
					System.out.println("Foi informado que o aluno n�o tem plano de sa�de.");
				}
			else {
				System.out.println("O usu�rio n�o usou caracteres v�lidos para a responder.");
			}
			if(casado_ou_solteiro == "S") {
				System.out.println("Foi informado que o aluno possui plano de sa�de.");}
			else if(casado_ou_solteiro == "N") {
					System.out.println("Foi informado que o aluno n�o tem plano de sa�de.");
				}
			else {
				System.out.println("O usu�rio n�o usou caracteres v�lidos para a responder.");
		}
	}
}
