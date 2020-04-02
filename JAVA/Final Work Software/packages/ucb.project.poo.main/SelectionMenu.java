package ucb.project.poo.main;

import ucb.project.poo.entity.Funcionario;
import ucb.project.poo.methods.Visao;
import ucb.project.poo.reader.Leitor;

public class SelectionMenu {
	public static void  Menu () {
	int operacao = 0;
	int tipoExtrato = 0;
	
	do {
	System.out.println("Escolha o que deseja fazer no programa:");
	System.out.println("[1]: Cadastrar novo funcion�rio;");
	System.out.println("[2]: Verificar funcion�rios cadastrados;");
	System.out.println("[3]: Extrato de Imposto de Renda;");
	operacao = Leitor.lerInt();
	
	switch( operacao ) {
		case 1:
			Funcionario.cadastrarFuncionarios();
			break;
		case 2:
			Visao.getAllEmployees();
			break;
		case 3:
			System.out.println("Qual tipo de extrato deseja executar?");
			System.out.println("[1] Extrato de Imposto de Renda para um funcion�rio espec�fico;");
			System.out.println("[2] Extrato de Imposto de Renda de v�rios funcion�rios;");
			tipoExtrato = Leitor.lerInt();
			if (tipoExtrato == 1) {
				Visao.getImpostoRenda();
			}
			else if (tipoExtrato == 2) {
				Visao.getVariosImpostosRenda();
			}

			break;
		default:
			System.out.println("Voc� n�o selecionou uma op��o v�lida.");
		}
	System.out.println("");
	}while (operacao == 0);
	}
}