package finalProjectSoftware;

import finalProjectSoftware.Main.Funcionario;

public class Visao {
	public static Main.Funcionario lerFuncionario() {
		Main.Funcionario a = new Main.Funcionario(); 
		a.nome = Leitor.lerString("Informe o nome do Funcion�rio: ");
		a.matricula = Leitor.lerString("Informe a matr�cula do(a) " + a.nome + ": ");
		a.CPF = Leitor.lerString("Informe o CPF do(a) " + a.nome + ": ");
		a.Salario = Leitor.lerDouble("Informe o Salario do(a) " + a.nome + ": ");
		a.Cargo= Leitor.lerCaracter("Informe o Cargo do(a) " + a.nome + ": ");
//			if (a.Cargo == 'D') {
//				a.AnoDeAdmissao = Leitor.lerInt("Informe o Ano de Admiss�o do(a) " + a.nome + ": ");
//			}
//			if (a.Cargo == 'P') {
//				a.TpDeCasa = Leitor.lerInt("Informe o Tempo de Casa do(a) " + a.nome + ": ");
//			}
		return a;
		}

	public Main.Funcionario[] criarFuncionarios(int quantidade) {
		Main.Funcionario[] funcionarios = new Main.Funcionario [quantidade];
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i] = Visao.lerFuncionario();
		}
		return funcionarios;
	}

	public void print(Funcionario funcionario) {
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Nome: " + funcionario.matricula);
		System.out.println("Nome: " + funcionario.CPF);
		System.out.println("Nome: " + funcionario.Cargo);
		System.out.println("");
	}

	public void print(Funcionario[] funcionarios) {
		for (int i = 0; i < funcionarios.length; i++) {
			print(funcionarios[i]);
		}
		
	}
}