package ucb.lesson6.ex1.entity;

public class Pessoa {

	private  String nome;
	private  String id;
	private  String classeSocial;
	private  double salario;
	
	@Override
	public String toString() {
		return "\nID: " + getId() + "	\tNome: " + getNome() + "	\tClasse Social: " + getClasseSocial() + "	\tSalario: " + getSalario();
	}

	public Pessoa (String nome, String id, String classeSocial, double Salario) {
		setNome(nome);
		setId(id);
		setClasseSocial(classeSocial);
		setSalario(Salario);
	}
	
	public String getClasseSocial() {
		return classeSocial;
	}

	public void setClasseSocial(String classeSocial) {
		this.classeSocial = classeSocial;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
