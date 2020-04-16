package ucb.lesson3.ex4.methods;

import ucb.lesson3.ex4.gands.GandS;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static int somatorioInit() {
		do {
		System.out.println("Insira um n�mero: ");
		GandS.setNumero(Leitor.lerInt());
		System.out.println("");
		System.out.println("Abaixo, est�o apresentados todos os valores anteriores ao n�mero lido at� zero.");
		if (GandS.getNumero() < 0)
			System.out.println("O n�mero inserido deve obrigatoriamente ser positivo. Tente novamente.");
		}while(GandS.getNumero() < 0);
		return GandS.getNumero();
	}
	
	// Performing sum/Efetuando somat�rio
	public static void somatorio(int numero) {
		for (int i = 0; i <= numero; i++) {
			System.out.printf("%d", i);
			GandS.setResultado(GandS.getResultado() + i);
			if (i != numero) {
				System.out.printf(" + ");
			} else if (i == numero) {
				System.out.printf(" = ");
				System.out.printf("%d", GandS.getResultado());
			}
		}
		somatorioEnding();
	}
	
	public static void somatorioEnding() {
		char resposta;
		System.out.printf("\n\n");
		System.out.println("Opera��o finalizada! Deseja efetuar gerar o somat�rio de outro n�mero?");
		System.out.println("[S] - Sim, o programa solicitar� um novo n�mero;");
		System.out.println("[N] - N�o, o programa ser� encerrado;");
		resposta = Leitor.lerCaracter();
		if (resposta == 'S') {
			System.out.println("");
			somatorioInit();
		} else if (resposta == 'N') {
			System.out.println("Programa encerrado.");
			System.exit(0);	
		} else
			System.out.println("Voc� n�o deu uma resposta v�lida. Programa encerrado!");
	}
}
