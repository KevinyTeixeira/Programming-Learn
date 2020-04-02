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
		System.out.println("Voc� n�o inseriu um cargo v�lido, insira [D] ou [P]!");
	}while(cargo != 'D' && cargo != 'P');
	String nome = Leitor.lerString("Informe o Nome: ");
	String matricula = Leitor.lerString("Informe a Matr�cula do(a) Sr(a) " + nome + " : ");
	String cpf = Leitor.lerString("");
	Funcionario f = new Funcionario();
	do {	
	cpf = Leitor.lerString("Informe o CPF do(a) Sr(a) " + nome + " (somente n�meros): ");
	f.setCPF(cpf);
	if (ListaDeFuncionarios.funcionarios.contains(f)) {
		System.out.println("O CPF informado j� foi cadastrado!");
	}}while(ListaDeFuncionarios.funcionarios.contains(f) == true);
	double salario = Leitor.lerDouble("Informe o Sal�rio do(a) Sr(a) " + nome + " : ");

	switch (cargo) {
	case 'D':
		
		Diretor d = new Diretor(nome, matricula, cpf, salario, cargo,
				Leitor.lerDouble("Informe o Tempo de Casa do(a) Sr() " + nome + " (anos): "));
		ListaDeFuncionarios.funcionarios.add(d);
		System.out.println("Funcion�rio: " + d.toString() + " foi inserido com sucesso.");
		break;
		
	case 'P':
		
		Professor p = new Professor(nome, matricula, cpf, salario, cargo,
				Leitor.lerInt("Informe o Ano de Admiss�o do(a) Sr(a) " + nome + " (AAAA): "));
		ListaDeFuncionarios.funcionarios.add(p);
		System.out.println("Funcion�rio: " + p.toString() + " foi inserido com sucesso.");
	break;
	}
	endingMethod();
}
	
	//Case 2 return
	public static void getAllEmployees() {
		System.out.print("- LISTA DE FUNCION�RIOS CADASTRADOS");
		for (Funcionario f : ListaDeFuncionarios.funcionarios)  {
			System.out.printf(f.toString());
		}
		System.out.println("");
		endingMethod();
	}
	
	//Case 3 return
	public static void getImpostoRenda() {
		System.out.println("Informe o CPF do funcion�rio que deseja extrair o imposto de renda (somente n�meros): ");
		String cpf = Leitor.lerString();
		for (Funcionario f : ListaDeFuncionarios.funcionarios) {
			if(f.getCPF().contentEquals(cpf)) 
				System.out.println("O imposto de renda do funcion�rio " + f.getNome() + "� igual a R$ " + f.getImpostoRenda());
			else
				System.out.println("N�o existe funcion�rio com este CPF!");
		}
		endingMethod();
	}
	
	public static void getVariosImpostosRenda() {
		double impostoRenda = 0, media = 0;
		int cont = 0;
		System.out.println("Este tipo de extrato ir� gerar a m�dia e o total do imposto de renda dos funcion�rios informados;");
		System.out.println("Insira a quantidade de funcion�rios que deseja calcular: ");
		cont = Leitor.lerInt();
		String cpf[] = new String [cont];
		for (int i = 0; i < cpf.length; i++ ) {
			System.out.println("Insira o " + (i+1) + "� CPF que deseja considerar (somente n�meros): ");
			cpf[i] = Leitor.lerString();
			for (Funcionario f : ListaDeFuncionarios.funcionarios) {
				
				if(f.getCPF().contentEquals(cpf[i])) {
				impostoRenda = impostoRenda + f.getImpostoRenda();
				}
			}
		}
		media = impostoRenda / cont;
	System.out.printf("\nTotal de Imposto de Renda: R$ %.2f!", impostoRenda);
	System.out.printf("\nM�dia de Imposto de Renda: R$ %.2f!", media);
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
		System.out.println("Fun��o executada com sucesso! O que deseja fazer agora?") ;
		System.out.println("[1] Retornar para sele��o;") ;
		System.out.println("[2] Encerrar o programa;") ;
		operacao = Leitor.lerInt();
		if ( operacao == 1)
			SelectionMenu.Menu();
		else
			System.out.println("Programa encerrado.");
			System.exit(0);	
			
	}
}