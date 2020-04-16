package ucb.lesson3.ex4.methods;

import ucb.lesson3.ex4.gands.GandS;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static int somatorioInit() {
		do {
		System.out.println("Insira um número: ");
		GandS.setNumero(Leitor.lerInt());
		System.out.println("");
		System.out.println("Abaixo, estão apresentados todos os valores anteriores ao número lido até zero.");
		if (GandS.getNumero() < 0)
			System.out.println("O número inserido deve obrigatoriamente ser positivo. Tente novamente.");
		}while(GandS.getNumero() < 0);
		return GandS.getNumero();
	}
	
	// Performing sum/Efetuando somatório
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
		System.out.println("Operação finalizada! Deseja efetuar gerar o somatório de outro número?");
		System.out.println("[S] - Sim, o programa solicitará um novo número;");
		System.out.println("[N] - Não, o programa será encerrado;");
		resposta = Leitor.lerCaracter();
		if (resposta == 'S') {
			System.out.println("");
			somatorioInit();
		} else if (resposta == 'N') {
			System.out.println("Programa encerrado.");
			System.exit(0);	
		} else
			System.out.println("Você não deu uma resposta válida. Programa encerrado!");
	}
}
