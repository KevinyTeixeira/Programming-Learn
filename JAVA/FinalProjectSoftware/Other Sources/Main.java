package finalProjectSoftware;

/******************************************************************************
[EN] Synthesis
Objective: receive the input data and present it on the screen;
In      : teacher's salary, age of a child, whether a civil servant has health insurance or not, whether a person is married (c) or single (s) and, finally, the student's name;
Out     : display the data entered by the user on the screen;
DETAILS: Em uma universidade tem dois tipos de Funcionários: Diretores ou Professores. Um professor tem nome, matrícula, cpf, salário, ano de admissão. 
Em professor deve ter um método getImpostoDeRenda, que deverá retornar o imposto de renda do professor (20% do seu salário). Um diretor tem nome, matrícula, cpf, salário e tempo de casa. 
Em Diretor também tem o método para obter o imposto de renda. (23% do seu salário). 
Pegue tudo que for comum às entidades e coloque em uma classe Funcionário, inclusive o método getImpostoDeRenda, para que ele possa ser sobrescrito pelas entidades filhas. 
Não é aceito funcionário repetido nesta universidade. Use sobrescrita do equals para auxiliar nesta empreitada e para apresentação use o toString. 
Para criar um funcionário, deve ser passada a matrícula no construtor obrigatoriamente. 
Receba os dados de vários funcionários e apresente a média do imposto de renda e o total do imposto de renda.

[PT] Síntese
Objetivo: receber os dados de entrada e apresenta-los na tela;
Entrada : salário do professor, idade de uma criança, se um servidor público tem plano de saúde ou não, se uma pessoa é casada (c) ou solteira (s) e, por fim, o nome do aluno;
Saída   : apresentar na tela os dados informados pelo usuário no sistema;

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
