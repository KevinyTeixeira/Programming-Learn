package ucb.lesson3.ex5.methods;

import ucb.lesson3.ex5.gands.GandS;
import ucb.lesson3.reader.Leitor;

public class Visao {

	public static void MyMath() {
		int operacao = 0;
		
		do {
		System.out.println("Escolha qual a opera��o que deseja executar: ");
		System.out.println("[1] Calcular o fatorial de um n�mero;");
		System.out.println("[2] Verificar entre dois n�meros, qual � o maior;");
		System.out.println("[3] Verificar se um n�mero � par;");
		System.out.println("[4] Verificar se um n�mero � primio;");
		operacao = Leitor.lerInt();
		if (operacao < 1 || operacao > 4)
			System.out.println("Voc� n�o inseriu uma op��o v�lida, escolha entre 1 e 4!");
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
			System.out.println("Voc� n�o escolheu uma op��o v�lida! Programa encerrado.");
		}
	}
	
	//Collecting entry number/Coletando n�mero de entrada
	public static void gettingNumber(int operacao) {
		System.out.println("");
		if (operacao == 2) {
			System.out.println("Insira o primeiro n�mero: ");
			GandS.setNumero1(Leitor.lerInt());
			System.out.println("Insira o segundo n�mero: ");
			GandS.setNumero2(Leitor.lerInt());
			System.out.println("");
		} else {
			System.out.println("Insira o n�mero que deseja utilizar para a opera��o: ");
			GandS.setNumero1(Leitor.lerInt());
			System.out.println("");
		}
	}
	
	//Check if user will end program/Verifica se o usu�rio deseja encerrar o programa
	public static void programEnding() {
		char resposta;
		System.out.printf("\n");
		System.out.println("Opera��o finalizada! Deseja efetuar efetuar outra opera��o?");
		System.out.println("[S] - Sim, o programa retornar� para o in�cio;");
		System.out.println("[N] - N�o, o programa ser� encerrado;");
		resposta = Leitor.lerCaracter();
		if (resposta == 'S') {
			System.out.println("");
			MyMath();
		} else if (resposta == 'N') {
			System.out.println("Programa encerrado.");
			System.exit(0);	
		} else
			System.out.println("Voc� n�o deu uma resposta v�lida. Programa encerrado!");
	}
	
	// Performing factorial/Efetuando c�lculo do fatorial
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
	
	//Check who is the high number/Verificando qual � o maior n�mero
	public static void isHighNumber(int numero1, int numero2) {
		System.out.println("*VERIFICANDO O MAIOR N�MERO");
		if (numero1 > numero2) {
			System.out.println("O n�mero [" + numero1 + "] � maior do que o n�mero [" + numero2 + "]!");
			programEnding();
		} else if (numero2 > numero1) {
			System.out.println("O n�mero [" + numero2 + "] � maior do que o n�mero [" + numero1 + "]!");
			programEnding();
		} else {
			System.out.println("Os n�meros inseridos s�o iguais!");
			programEnding();
		}
	}

	//Check if number is even/Verificando se o n�mero � par
	public static void isEvenNumber(int numero) {
		System.out.println("*VERIFICANDO SE O N�MERO � PAR");
		if ((numero%2) == 0) {
			System.out.println("O n�mero inserido � par!");
			programEnding();
		} else {
			System.out.println("O n�mero inserido � impar!");
			programEnding();
		}
	}
	
	//Check if is prime number/Verificando se � um n�mero primo
	public static void isPrimeNumber(int numero) {
		System.out.println("*VERIFICANDO SE � UM N�MERO PRIMO");
		for (int i = 2; i < numero; i++) {
			if ((numero%i) == 0) {
				System.out.println("O n�mero N�O � um n�mero primo!");
				programEnding();
			} else {
				System.out.println("O n�mero � um n�mero primo!");
				programEnding();
			}
		}
	}

}
