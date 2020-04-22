package ucb.lesson3.ex5.methods;

import ucb.lesson3.ex5.gands.GandS;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static void MyMath() {
		int operacao = 0;
		
		do {
		System.out.println("Escolha qual a operação que deseja executar: ");
		System.out.println("[1] Calcular o fatorial de um número;");
		System.out.println("[2] Verificar entre dois números, qual é o maior;");
		System.out.println("[3] Verificar se um número é par;");
		System.out.println("[4] Verificar se um número é primio;");
		operacao = Leitor.lerInt();
		if (operacao < 1 || operacao > 4)
			System.out.println("Você não inseriu uma opção válida, escolha entre 1 e 4!");
		}while(operacao < 1 || operacao > 4);
		gettingNumber(operacao);
		
		
		switch (operacao) {
		
		case 1:
			calculateFactorialNumber(GandS.getNumero1());
			break;
		case 2:
			isHighNumber(GandS.getNumero1(), GandS.getNumero2());
			break;
		case 3:
			isEvenNumber(GandS.getNumero1());
			break;
		case 4:
			isPrimeNumber(GandS.getNumero1());
			break;
		default:
			System.out.println("Você não escolheu uma opção válida! Programa encerrado.");
		}
	}
	
	//Collecting entry number/Coletando número de entrada
	public static void gettingNumber(int operacao) {
		System.out.println("");
		if (operacao == 2) {
			System.out.println("Insira o primeiro número: ");
			GandS.setNumero1(Leitor.lerInt());
			System.out.println("Insira o segundo número: ");
			GandS.setNumero2(Leitor.lerInt());
			System.out.println("");
		} else {
			System.out.println("Insira o número que deseja utilizar para a operação: ");
			GandS.setNumero1(Leitor.lerInt());
			System.out.println("");
		}
	}
	
	//Check if user will end program/Verifica se o usuário deseja encerrar o programa
	public static void programEnding() {
		char resposta;
		System.out.printf("\n");
		System.out.println("Operação finalizada! Deseja efetuar efetuar outra operação?");
		System.out.println("[S] - Sim, o programa retornará para o início;");
		System.out.println("[N] - Não, o programa será encerrado;");
		resposta = Leitor.lerCaracter();
		if (resposta == 'S') {
			System.out.println("");
			MyMath();
		} else if (resposta == 'N') {
			System.out.println("Programa encerrado.");
			System.exit(0);	
		} else
			System.out.println("Você não deu uma resposta válida. Programa encerrado!");
	}
	
	// Performing factorial/Efetuando cálculo do fatorial
	public static void calculateFactorialNumber(int numero) {
		System.out.println("*IMPRIMNDO FATORIAL");
		System.out.printf ("[" + numero + "!] = ");
		int resultado = 1;
		for (; numero > 0; numero--) {
			System.out.printf("%d!", numero);
			resultado = resultado * numero;
			if (numero <= 1)
				System.out.printf(" = %d;", resultado);
			else
				System.out.printf(" * ");
		}
		programEnding();
	}
	
	//Check who is the high number/Verificando qual é o maior número
	public static void isHighNumber(int numero1, int numero2) {
		System.out.println("*VERIFICANDO O MAIOR NÚMERO");
		if (numero1 > numero2) {
			System.out.println("O número [" + numero1 + "] é maior do que o número [" + numero2 + "]!");
			programEnding();
		} else if (numero2 > numero1) {
			System.out.println("O número [" + numero2 + "] é maior do que o número [" + numero1 + "]!");
			programEnding();
		} else {
			System.out.println("Os números inseridos são iguais!");
			programEnding();
		}
	}

	//Check if number is even/Verificando se o número é par
	public static void isEvenNumber(int numero) {
		System.out.println("*VERIFICANDO SE O NÚMERO É PAR");
		if ((numero%2) == 0) {
			System.out.println("O número inserido é par!");
			programEnding();
		} else {
			System.out.println("O número inserido é impar!");
			programEnding();
		}
	}
	
	//Check if is prime number/Verificando se é um número primo
	public static void isPrimeNumber(int numero) {
		System.out.println("*VERIFICANDO SE É UM NÚMERO PRIMO");
		for (int i = 2; i < numero; i++) {
			if ((numero%i) == 0) {
				System.out.println("O número NÃO É um número primo!");
				programEnding();
			} else {
				System.out.println("O número É um número primo!");
				programEnding();
			}
		}
	}

}
