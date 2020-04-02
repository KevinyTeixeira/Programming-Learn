package ucb.project.poo.entity;

public class Professor extends Funcionario {

	private double anoAdmissao;

	public Professor(String nome, String matricula, String cpf, double salario, char cargo, int anoAdmissao) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(cpf);
		setSalario(salario);
		setCargo(cargo);
		setanoAdmissao(anoAdmissao);
	}
	
	@Override
	public double getImpostoRenda() {
		return getSalario() * 0.20; //taxa fixa de 20% do salário
	}
	@Override //Use toString for print director data/Usa o toString para imprimir os dados do diretor
	public String toString() {
		return "\nNome: " + getNome() + "\tMatrícula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSalário: R$ " + getSalario() + "\tCargo: " + getCargo() + "\tAno de Admissão (AAAA):" + getanoAdmissao();
	}
	public double getanoAdmissao() {
		return anoAdmissao;
	}
	public void setanoAdmissao(double AnoAdmissao) {
		anoAdmissao = AnoAdmissao;
	}
	
}
