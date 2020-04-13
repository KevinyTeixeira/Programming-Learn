package ucb.lesson6.ex1.methods;

import ucb.lesson6.ex1.entity.Pessoa;
import ucb.lesson6.ex1.list.ListaDePessoas;
import ucb.lesson6.ex1.main.Main;
import ucb.lesson6.reader.Leitor;

public class Visao {

	public static void cadastrarPessoa() {
		String nome, ID, classeSocial;
		double salario;
		
		System.out.println("");
		System.out.println("*CADASTRAR NOVA PESSOA");
		System.out.println("Insira o nome dessa pessoa: ");
		nome = Leitor.lerString();
		System.out.println("Insira a ID: ");
		ID = Leitor.lerString();
		System.out.println("Insira o Salário: ");
		salario = Leitor.lerDouble();
		classeSocial = classificarPessoa(salario);
		
		Pessoa p = new Pessoa(nome, ID, classeSocial, salario);
		ListaDePessoas.pessoas.add(p);
		System.out.println("");
		System.out.println("A pessoa abaixo foi inserida com sucesso!");
		System.out.print(p.toString());
		endingProgram();
	}
	
	public static void endingProgram() {
		int operacao;
		System.out.print("\n\n");
		System.out.println("Função executada com sucesso! O que deseja fazer agora?") ;
		System.out.println("[1] Retornar para seleção;") ;
		System.out.println("[2] Encerrar o programa;") ;
		operacao = Leitor.lerInt();
		if ( operacao == 1)
			Main.main(null);
		else
			System.out.println("Programa encerrado.");
			System.exit(0);	
			
	}
	
	public static String classificarPessoa(double salario) {
		
		String temp = "";
		
		if (salario > 14400) 
			temp = "A1";
		if (salario > 8100 && salario < 14400) 
			temp = "A2";
		if (salario > 4600 && salario < 8100) 
			temp = "B";
		if (salario > 2300 && salario < 4600) 
			temp = "C";
		if (salario > 1400 && salario < 2300) 
			temp = "D";
		if (salario > 950 && salario < 1400) 
			temp = "E";
		if (salario > 400) 
			temp = "F";
		
	return temp;

	}
	
	public static void printPessoas() {
		System.out.println("");
		System.out.println("*IMPRIMINDO PESSOAS");
		if (ListaDePessoas.pessoas.size() == 0)
			System.out.println("Não há pessoas cadastradas no momento.");
		for ( Pessoa p : ListaDePessoas.pessoas) {
			System.out.print(p.toString());
		}
		endingProgram();
	}
}
