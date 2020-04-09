package ucb.lesson3.ex3.entity;

public class Aluno {

	private static String nome;
	private static double nota1, nota2, media;
	
	public Aluno (String nome, double nota1, double nota2, double media) {
		setNome(nome);
		setNota1(nota1);
		setNota2(nota2);
		setMedia(media);
	}
	
	public Aluno(Object setNome, Object setNota1, Object setNota2, Object setMedia) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString () {
	String texto = ("\nNome: " + Aluno.getNome() + "	\t1ª Nota: " + Aluno.getNota1() + "	\t2ª Nota: " + Aluno.getNota2() + "	\tMédia: " + Aluno.getMedia());
		return texto;
	}
	
	public static double getMedia() {
		return media;
	}

	public static void setMedia(double media) {
		Aluno.media = media;
	}

	public static String getNome() {
		return nome;
	}
	public static double getNota1() {
		return nota1;
	}
	public static void setNota1(double nota1) {
		Aluno.nota1 = nota1;
	}
	public static double getNota2() {
		return nota2;
	}
	public static void setNota2(double nota2) {
		Aluno.nota2 = nota2;
	}
	public static void setNome(String nome) {
		Aluno.nome = nome;
	}
}
