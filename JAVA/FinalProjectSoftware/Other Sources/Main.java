package finalProjectSoftware;

/******************************************************************************
[EN] Synthesis
Objective: receive the input data and present it on the screen;
In      : teacher's salary, age of a child, whether a civil servant has health insurance or not, whether a person is married (c) or single (s) and, finally, the student's name;
Out     : display the data entered by the user on the screen;
DETAILS: Em uma universidade tem dois tipos de Funcion�rios: Diretores ou Professores. Um professor tem nome, matr�cula, cpf, sal�rio, ano de admiss�o. 
Em professor deve ter um m�todo getImpostoDeRenda, que dever� retornar o imposto de renda do professor (20% do seu sal�rio). Um diretor tem nome, matr�cula, cpf, sal�rio e tempo de casa. 
Em Diretor tamb�m tem o m�todo para obter o imposto de renda. (23% do seu sal�rio). 
Pegue tudo que for comum �s entidades e coloque em uma classe Funcion�rio, inclusive o m�todo getImpostoDeRenda, para que ele possa ser sobrescrito pelas entidades filhas. 
N�o � aceito funcion�rio repetido nesta universidade. Use sobrescrita do equals para auxiliar nesta empreitada e para apresenta��o use o toString. 
Para criar um funcion�rio, deve ser passada a matr�cula no construtor obrigatoriamente. 
Receba os dados de v�rios funcion�rios e apresente a m�dia do imposto de renda e o total do imposto de renda.

[PT] S�ntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : sal�rio do professor, idade de uma crian�a, se um servidor p�blico tem plano de sa�de ou n�o, se uma pessoa � casada (c) ou solteira (s) e, por fim, o nome do aluno;
Sa�da   : apresentar na tela os dados informados pelo usu�rio no sistema;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 1;
*******************************************************************************/

public class Main {

	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		Funcionario[] funcionarios = Visao.criarFuncionarios(3);
		
		Visao.print(funcionarios);
		
//		Funcionario [] funcionarios = new Funcionario[3];
//		
//		funcionarios[0] = new Funcionario();
//		funcionarios[0].nome = "Teste";
//		funcionarios[0].matricula = "Teste";
//		funcionarios[0].CPF = 1;
//		funcionarios[0].Salario = 1700;
//		funcionarios[0].Cargo = 'D';
//		
//		Funcionario a = Visao.lerFuncionario();
//		
//		funcionarios[1] = a;
//		
//		Funcionario b = new Funcionario();
//		funcionarios[0].nome = "Teste2";
//		funcionarios[0].matricula = "Teste2";
//		funcionarios[0].CPF = 2;
//		funcionarios[0].Salario = 1800;
//		funcionarios[0].Cargo = 'P';
//		
//		funcionarios[2] = b;
		
	}
	
public static class Funcionario {
	
		String nome;
		String matricula, CPF;
		int AnoDeAdmissao, TpDeCasa;
		double Salario;
		char Cargo; // 'D' = Diretor; 'P' = Professor;
	}
}
