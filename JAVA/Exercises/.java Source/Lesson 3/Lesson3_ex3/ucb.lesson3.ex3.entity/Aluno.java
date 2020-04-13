package ucb.lesson3.ex3.entity;

public class Aluno {

	private String nome;
	private double nota1, nota2, media;
	
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
	String texto = ("\nNome: " + getNome() + "	\t1ª Nota: " + getNota1() + "	\t2ª Nota: " + getNota2() + "	\tMédia: " + getMedia());
		return texto;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getNome() {
		return nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
