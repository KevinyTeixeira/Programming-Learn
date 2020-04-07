package ucb.lesson3.ex1.main;

import ucb.lesson3.ex1.gettersAndSetters.GettersAndSetters;
import ucb.lesson3.ex1.methods.Visao;
import ucb.lesson3.reader.Leitor;

	/******************************************************************************
	[EN] Synthesis
	Objective: receive from the user the monthly interest rate and the amount of the debt, then return the resulting interest for the late payment;
	In      : interest rate, debt value;
	Out     : display the interest resulting from the late payment of the debt on screen;

	[PT] S�ntese
	Objetivo: receber do usu�rio a taxa de juros mensal e o valor da d�vida e, em seguida, devolver os juros resultantes do atraso no pagamento;
	Entrada : taxa de juros, valor da d�vida;
	Sa�da   : apresentar na tela os juros resultantes pelo atraso do pagamento da d�vida;

	Autor: Keviny Teixeira
	QUESTION FROM LESSON 2, EXERCISE 2;
	*******************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
		
	public static void main (String args[]) {

		// Collecting Data/Coletando Dados
		System.out.println("Prezado usu�rio, informe o valor da sua d�vida (R$): ");
		GettersAndSetters.capital = Leitor.lerDouble();
		System.out.println("Informe a quantos meses voc� n�o paga esta d�vida: ");
		GettersAndSetters.tempo = Leitor.lerInt();
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		GettersAndSetters.txDeJuros = Leitor.lerDouble();

		// Calculating Interest/Calculando Juros
		GettersAndSetters.total = Visao.calculatingInterest(GettersAndSetters.juros, GettersAndSetters.capital, GettersAndSetters.txDeJuros, GettersAndSetters.tempo, GettersAndSetters.total);
			
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVoc� informou que sua d�vida �: %.2f reais;\n", GettersAndSetters.capital);
		System.out.println("Voc� informou que n�o paga sua conta a: " + GettersAndSetters.tempo + " meses;");
		System.out.printf("Voc� informou que a taxa de juros mensal do banco �: %.2f%%;\n", GettersAndSetters.txDeJuros);
		System.out.printf("O juros acumulado � R$ %.2f reais.\nPortanto, sua d�vida atualmente � R$ %.2f reais!", GettersAndSetters.juros, GettersAndSetters.total);
	}
}
