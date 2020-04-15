package ucb.lesson4.ex3.main;

import ucb.lesson4.ex3.methods.Visao;
import ucb.lesson4.reader.Leitor;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: use the ArrayList to create a class in a "Students" collection. A student must have a name, two grades and an average. Finally, present the class average and the number of students informed;
In      : name, notes;
Out     : display informed students and the resulting average on screen;

[PT] Síntese
Objetivo: use a ArrayList para criar uma uma turma em uma coleção "Alunos". Um aluno deve ter nome, duas notas e uma média. Por fim, apresente a média da turma e a quantidade de alunos informados;
Entrada : nome, notas;
Saída   : apresentar na tela os alunos informados e a média resultante;

Autor: Keviny Teixeira
QUESTION FROM LESSON 4, EXERCISE 3;

PACKAGES:

ucb.lesson4.ex3.main
- Main.java | The main class;

ucb.lesson4.ex3.methods
- Visao.java | All methods used in this source are here;

ucb.lesson4.ex3.entity
- Aluno.java | The entity class;

ucb.lesson4.ex3.list
- ListaDeAlunos.java | The ArrayList class;

ucb.lesson4.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/

public class Main {

	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String[] args) {
		
		int operacao = 0;
		
//		//Adding first student!
//		Aluno al = new Aluno("Keviny Teixeira", 10, 10, 10);
//		ListaDeAlunos.alunos.add(al);
		
		System.out.println("Escolha o que deseja fazer: ");
		System.out.println("[1] Cadastrar um aluno;");
		System.out.println("[2] Mostrar alunos cadastrados e todas as médias;");
		operacao = Leitor.lerInt();
		
		switch (operacao) {
		
		case 1:
			Visao.cadastrarAluno();
			break;
			
		case 2:
			Visao.printAlunos();
			break;
			
		default:
			System.out.println("Você não selecionou nenhuma opção válida.");
			
		}
		
	}
	
}
