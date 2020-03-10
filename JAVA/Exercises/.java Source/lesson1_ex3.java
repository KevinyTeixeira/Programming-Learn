/******************************************************************************
[EN] Synthesis
Objective: receive two notes from the user and perform the arithmetic mean of these values;
In      : grade;
Out     : display the informed grades, the average and whether the student achieved approval or not;

[PT] Síntese
Objetivo: receber do usuário duas notas e realizar a média aritmética desses valores;
Entrada : notas;
Saída   : apresentar na tela as notas informadas, a média e se o estudante alcançou aprovação ou não;

Autor: Keviny Teixeira
QUESTION FROM LESSON 1, EXERCISE 3;
*******************************************************************************/

import java.util.Scanner; // Required to read a user data insertion\Necessário para ler um dado inserido pelo usuário;

public class Lesson1_ex3{

	public static void main (String args[]){

	// Statements/Declarações
	double nota_1, nota_2, media;
	String resultado;

	System.out.printf("*INICIANDO PROGRAMA EM JAVA;");

	// Collecting entrys/Coletando entradas
    System.out.printf("\nInforme a primeira nota do aluno: ");
    nota_1 = new Scanner(System.in).nextDouble( );
    System.out.printf("Informe a segunda nota do aluno: ");
    nota_2 = new Scanner(System.in).nextDouble( );

	// Calculating Arithmetic Mean and Generating result/Calculando Média Aritmética e Gerando Resultado
    System.out.printf("MÉDIA = (%.2f + %.2f)/2;", nota_1, nota_2);
	media = (nota_1 + nota_2) / 2;
	if (media >= 5) {
		resultado = "O aluno foi aprovado!"; // The student passed/O estudante foi aprovado
	} else {
		resultado = "O aluno foi reprovado!"; // The student failed/O estudante foi reprovado
	}

	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
    System.out.printf("\nA primeira nota do aluno foi: %.2f;", nota_1);
    System.out.printf("\nA segunda nota do aluno foi: %.2f;", nota_2);
    System.out.printf("\nA média resultante É: %.2f;", media);
    System.out.printf("\n");
    System.out.print(resultado);

	}
}