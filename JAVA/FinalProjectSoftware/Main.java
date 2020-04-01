package productionAmbienc;

public class Main {
	public static void main (String[] args) {
		Funcionario f = new Funcionario("Keviny", "5550082", "057.258.431-81", 8000, 'D');
		System.out.println(f.getNome());
		System.out.println(f.getMatricula());
		System.out.println(f.getCPF());
		System.out.println(f.getSalario());
		System.out.println(f.getCargo());
		System.out.println(f.toString());
		
	}
}
