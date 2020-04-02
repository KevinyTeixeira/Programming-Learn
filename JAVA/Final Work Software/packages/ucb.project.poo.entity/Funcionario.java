package ucb.project.poo.entity;

import ucb.project.poo.methods.Visao;
import ucb.project.poo.reader.Leitor;

public class Funcionario {
	private String nome;
	private String matricula, cpf;
	private double salario;
	private char cargo;

	public static void cadastrarFuncionarios() {
		System.out.println("Insira a quantidade de funcion�rios que deseja cadastrar: ");
		int quantidade = Leitor.lerInt();
		for (;quantidade > 0; quantidade--) {
			Visao.cadastrarFuncionario();
		}
	}
	
	@Override //Checks if the functionary already exists/Verifica se o funcion�rio j� existe
	public boolean equals(Object obj) {
		if(obj instanceof Funcionario) {
			Funcionario temp = (Funcionario) obj;
			if(this.getCPF().equalsIgnoreCase(temp.getCPF()));
		}
		return super.equals(obj);
	}
	
	@Override //Use toString for print functionary data/Usa o toString para imprimir os dados do funcion�rio
	public String toString() {
		return "\nNome: " + getNome() + "\tMatr�cula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSal�rio: R$ " + getSalario() + "\tCargo: " + getCargo();
	}
	
	public Funcionario(String nome, String matricula, String CPF, double salario, char cargo) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(CPF);
		setSalario(salario);
		setCargo(cargo);
	}
	public Funcionario() {
	}

	public double getImpostoRenda() {
		return 0.0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String CPF) {
		this.cpf = CPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public char getCargo() {
		return cargo;
	}
	public void setCargo(char Cargo) {
		this.cargo = Cargo;
	}
}
