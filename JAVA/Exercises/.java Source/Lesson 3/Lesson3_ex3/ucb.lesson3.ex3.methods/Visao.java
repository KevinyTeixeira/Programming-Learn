package ucb.lesson3.ex3.methods;

import ucb.lesson3.ex3.main.Main;
import ucb.lesson3.ex3.entity.Aluno;
import ucb.lesson3.ex3.list.ListaDeAlunos;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static void cadastrarAluno() {

	System.out.printf("\n*CADASTRO INICIADO\n");
	System.out.println("Insira o nome do(a) aluno(a): ");
	Aluno.setNome(Leitor.lerString());

	do {
		System.out.println("Insira a 1ª nota do(a) aluno(a): ");		
		Aluno.setNota1(Leitor.lerDouble());
		if (Aluno.getNota1() < 0 || Aluno.getNota1() > 10)
			System.out.println("Você só pode inserir uma nota que esteja entre 0 e 10!");
	} while (Aluno.getNota1() < 0 || Aluno.getNota1() > 10);

	do {
		System.out.println("Insira a 2ª nota do(a) aluno(a): ");		
		Aluno.setNota2(Leitor.lerDouble());
		if (Aluno.getNota2() < 0 || Aluno.getNota2() > 10)
			System.out.println("Você só pode inserir uma nota que esteja entre 0 e 10!");
	} while (Aluno.getNota2() < 0 || Aluno.getNota2() > 10);
	
	Aluno.setMedia(Aluno.getNota1() + Aluno.getNota2());
	
	Aluno al = new Aluno(Aluno.getNome(), Aluno.getNota1(), Aluno.getNota2(), Aluno.getMedia());
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
