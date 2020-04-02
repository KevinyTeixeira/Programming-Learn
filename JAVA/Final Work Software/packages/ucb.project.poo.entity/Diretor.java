package ucb.project.poo.entity;

public class Diretor extends Funcionario {

	public double tpDeCasa;
	
	public Diretor(String nome, String matricula, String cpf, double salario, char cargo, double tpDeCasa) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(cpf);
		setSalario(salario);
		setCargo(cargo);
		settpDeCasa(tpDeCasa);
	}
	
	@Override
	public double getImpostoRenda() {
		return getSalario() * 0.23; //taxa fixa de 23% do salário
	}
	
	@Override //Use toString for print director data/Usa o toString para imprimir os dados do diretor
	public String toString() {
		return "\nNome: " + getNome() + "\tMatrícula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSalário: R$ " + getSalario() + "\tCargo: " + getCargo() + "\tTempo de Casa (AAAA):" + gettpDeCasa();
	}
	public void settpDeCasa(double TpDeCasa) {
		tpDeCasa = TpDeCasa;
	}
	public double gettpDeCasa() {
		return tpDeCasa;
	}

}