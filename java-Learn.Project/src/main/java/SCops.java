/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Demonstra os operadores lógicos de curto-circuito, Arquivo SCops.java.
 * A diferença entre seus equivalentes comuns é a versão comum sempre
 * avalia cada operando e a v ersão de curto-circuito só avalia
 * o segundo operando quando necessário.
 * Vide RelLogOps.java para os operadores demais lógicos.
*/
public class SCops {
	public static void main (String args[]) {
		int n, d, q;
		
		n = 10;
		d = 2;
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		d = 0; // configura d com zero
		
		// Já que d é igual a zero, o segundo operando não é avaliado.
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
			
		/* Sem o operador do curto circuito.
		   Isso causará um erro de divisão por 0.
		*/
		if(d != 0 & (n % d) == 0)
			System.out.println(d + " is factor of " + n);
		
	}
}

/*
 * The output of this code will be:
 * 2 is a factor of 10
 * ERROR: Exception in thread "main" java.lang.ArithmeticException: / by zero at SCops.main(SCops.java:27)
*/