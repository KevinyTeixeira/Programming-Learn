/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Calcula a dist�ncia que um rel�mpago percorreu at� atingir a terra considerando a velocidade de som de 7,2 segundos, Arquivo Sound.java.
*/
public class Sound {
	public static void main (String args[]) {
		double dist;
		
		dist = 7.2 * 1100; // 1100 p�s refere-se a velocidade aproximada em que o som viaja por segundo pelo ar
		
		System.out.println("The distance traveling by lightning is: " + dist);
	}
}

/*
 * The output of this code will be:
 * The distance traveling by lightning is: 7920.0
*/