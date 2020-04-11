package ucb.lesson6.ex1.main;

import ucb.lesson6.ex1.methods.Visao;
import ucb.lesson6.reader.Leitor;

public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
		
	public static void main (String args[]) {

		// Collecting Data/Coletando Dados
		int operacao = 0;
		
		System.out.println("Selecione o que deseja fazer: ");
		System.out.println("[1] Cadastrar pessoa;");
		System.out.println("[2] Verificar pessoas cadastradas;");
		operacao = Leitor.lerInt();
		
		switch (operacao) {
		
		case 1:
			Visao.cadastrarPessoa();
			break;
			
		case 2:
			Visao.printPessoas();
			break;
			
		default:
			System.out.println("Você não inseriu uma opção válida!");
		}
	}
}
