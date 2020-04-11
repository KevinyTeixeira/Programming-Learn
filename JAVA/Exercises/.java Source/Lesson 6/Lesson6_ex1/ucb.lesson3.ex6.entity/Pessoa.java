package ucb.lesson6.ex1.entity;

public class Pessoa {

	private static String nome;
	private static String id;
	public static String classeSocial;
	private static double salario;
	
	@Override
	public String toString() {
		return "\nID: " + Pessoa.getId() + "	\tNome: " + Pessoa.getNome() + "	\tClasse Social: " + Pessoa.getClasseSocial() + "	\tSalario: " + Pessoa.getSalario();
	}

	public Pessoa (String nome, String id, String classeSocial, double Salario) {
		setNome(nome);
		setId(id);
		setSalario(Salario);
	}
	
	public static String getClasseSocial() {
		return classeSocial;
	}

	public static void setClasseSocial(String classeSocial) {
		Pessoa.classeSocial = classeSocial;
	}
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Pessoa.id = id;
	}
	public static double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Pessoa.salario = salario;
	}
	
}
