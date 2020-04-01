package productionAmbienc;

public class Funcionario {
	private String nome;
	private String matricula, CPF;
//	private int AnoDeAdmissao, TpDeCasa;
	private double Salario;

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Funcionario) {
			Funcionario temp = (Funcionario) obj;
			if(getMatricula().equalsIgnoreCase(temp.getMatricula()));
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\tMatrícula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSalário: " + getSalario() + "\tCargo: " + getCargo();
	}
	public Funcionario(String nome, String matricula, String CPF, double salario, char cargo) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(CPF);
		setSalario(salario);
		setCargo(cargo);
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
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public char getCargo() {
		return Cargo;
	}
	public void setCargo(char cargo) {
		Cargo = cargo;
	}
	private char Cargo; // 'D' = Diretor; 'P' = Professor;
}
