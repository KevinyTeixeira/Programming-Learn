package ucb.lesson4.ex3.methods;

import ucb.lesson4.reader.Leitor;
import ucb.lesson4.ex3.entity.Aluno;
import ucb.lesson4.ex3.list.ListaDeAlunos;
import ucb.lesson4.ex3.main.Main;

public class Visao {

	public static void cadastrarAluno() {
	String nome;
	double nota1, nota2, media;
		
		
	System.out.printf("\n*CADASTRO INICIADO\n");
	System.out.println("Insira o nome do(a) aluno(a): ");
	nome = Leitor.lerString();

	do {
		System.out.println("Insira a 1ª nota do(a) aluno(a): ");		
		nota1 = Leitor.lerDouble();
		if (nota1 < 0 || nota1 > 10)
			System.out.println("Você só pode inserir uma nota que esteja entre 0 e 10!");
	} while (nota1 < 0 || nota1 > 10);

	do {
		System.out.println("Insira a 2ª nota do(a) aluno(a): ");		
		nota2 = Leitor.lerDouble();
		if (nota2 < 0 || nota2 > 10)
			System.out.println("Você só pode inserir uma nota que esteja entre 0 e 10!");
	} while (nota2 < 0 || nota2 > 10);
	
	media = (nota1 + nota2) / 2;
	
	Aluno al = new Aluno(nome, nota1, nota2, media);
	ListaDeAlunos.alunos.add(al);
	System.out.println("");
	System.out.println("O aluno abaixo foi inserido com sucesso!" + al.toString());
	System.out.printf("\n");
	Main.main(null);
	}
	
	public static void printAlunos() {
		System.out.printf("\n*IMPRIMINDO ALUNOS\n");
		if (ListaDeAlunos.alunos.size() == 0)
			System.out.println("A lista de alunos está vazia.");
		else
			for ( Aluno al : ListaDeAlunos.alunos) {
				System.out.println(al.toString());
			}
		System.out.println("");
		Main.main(null);
	}
	
}
