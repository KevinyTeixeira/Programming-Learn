package ucb.project.poo.methods;

import ucb.project.poo.entity.Diretor;
import ucb.project.poo.entity.Funcionario;
import ucb.project.poo.entity.Professor;
import ucb.project.poo.list.ListaDeFuncionarios;
import ucb.project.poo.main.SelectionMenu;
import ucb.project.poo.reader.Leitor;

public class Visao {
	
	//Case 1 return
	public static void cadastrarFuncionario() {
	char cargo;
	
	do {
	System.out.print("\nEscolha o Cargo:\n[D] - Diretor;\n[P] - Professor;\n");
	cargo = Leitor.lerCaracter();
	if(cargo != 'D' && cargo != 'P')
		System.out.println("Você não inseriu um cargo válido, insira [D] ou [P]!");
	}while(cargo != 'D' && cargo != 'P');
	String nome = Leitor.lerString("Informe o Nome: ");
	String matricula = Leitor.lerString("Informe a Matrícula do(a) Sr(a) " + nome + " : ");
	String cpf = Leitor.lerString("");
	Funcionario f = new Funcionario();
	do {	
	cpf = Leitor.lerString("Informe o CPF do(a) Sr(a) " + nome + " (somente números): ");
	f.setCPF(cpf);
	if (ListaDeFuncionarios.funcionarios.contains(f)) {
		System.out.println("O CPF informado já foi cadastrado!");
	}}while(ListaDeFuncionarios.funcionarios.contains(f) == true);
	double salario = Leitor.lerDouble("Informe o Salário do(a) Sr(a) " + nome + " : ");

	switch (cargo) {
	case 'D':
		
		Diretor d = new Diretor(nome, matricula, cpf, salario, cargo,
				Leitor.lerDouble("Informe o Tempo de Casa do(a) Sr() " + nome + " (anos): "));
		ListaDeFuncionarios.funcionarios.add(d);
		System.out.println("Funcionário: " + d.toString() + " foi inserido com sucesso.");
		break;
		
	case 'P':
		
		Professor p = new Professor(nome, matricula, cpf, salario, cargo,
				Leitor.lerInt("Informe o Ano de Admissão do(a) Sr(a) " + nome + " (AAAA): "));
		ListaDeFuncionarios.funcionarios.add(p);
		System.out.println("Funcionário: " + p.toString() + " foi inserido com sucesso.");
	break;
	}
	endingMethod();
}
	
	//Case 2 return
	public static void getAllEmployees() {
		System.out.print("- LISTA DE FUNCIONÁRIOS CADASTRADOS");
		for (Funcionario f : ListaDeFuncionarios.funcionarios)  {
			System.out.printf(f.toString());
		}
		System.out.println("");
		endingMethod();
	}
	
	//Case 3 return
	public static void getImpostoRenda() {
		System.out.println("Informe o CPF do funcionário que deseja extrair o imposto de renda (somente números): ");
		String cpf = Leitor.lerString();
		for (Funcionario f : ListaDeFuncionarios.funcionarios) {
			if(f.getCPF().contentEquals(cpf)) 
				System.out.println("O imposto de renda do funcionário " + f.getNome() + "é igual a R$ " + f.getImpostoRenda());
			else
				System.out.println("Não existe funcionário com este CPF!");
		}
		endingMethod();
	}
	
	public static void getVariosImpostosRenda() {
		double impostoRenda = 0, media = 0;
		int cont = 0;
		System.out.println("Este tipo de extrato irá gerar a média e o total do imposto de renda dos funcionários informados;");
		System.out.println("Insira a quantidade de funcionários que deseja calcular: ");
		cont = Leitor.lerInt();
		String cpf[] = new String [cont];
		for (int i = 0; i < cpf.length; i++ ) {
			System.out.println("Insira o " + (i+1) + "º CPF que deseja considerar (somente números): ");
			cpf[i] = Leitor.lerString();
			for (Funcionario f : ListaDeFuncionarios.funcionarios) {
				
				if(f.getCPF().contentEquals(cpf[i])) {
				impostoRenda = impostoRenda + f.getImpostoRenda();
				}
			}
		}
		media = impostoRenda / cont;
	System.out.printf("\nTotal de Imposto de Renda: R$ %.2f!", impostoRenda);
	System.out.printf("\nMédia de Imposto de Renda: R$ %.2f!", media);
	endingMethod();
	}
	
	//Start and Ending return
	public static void initEntryData() {
		Funcionario f = new Diretor("Keviny Teixeira de Jesus", "UC19122764", "05725843181", 8000, 'D', 1996);
		Funcionario f1 = new Professor("Jorge Rabelo Soares", "UC19135479", "05725843121", 2200, 'P', 1994);
		Funcionario f2 = new Professor("Andre de Souza Neto", "UC19121343", "02225714851", 2200, 'P', 1994);
		ListaDeFuncionarios.funcionarios.add(f);
		ListaDeFuncionarios.funcionarios.add(f1);
		ListaDeFuncionarios.funcionarios.add(f2);
	}
	
	public static void endingMethod() {
		int operacao;
		System.out.println("");
		System.out.println("Função executada com sucesso! O que deseja fazer agora?") ;
		System.out.println("[1] Retornar para seleção;") ;
		System.out.println("[2] Encerrar o programa;") ;
		operacao = Leitor.lerInt();
		if ( operacao == 1)
			SelectionMenu.Menu();
		else
			System.out.println("Programa encerrado.");
			System.exit(0);	
			
	}
}