package Lesson2;

import java.util.Scanner;

/**********************************************************************************************************************************
[EN] Synthesis
Objective: receive two grades from a student using double, show grades, averages and inform whether the student has passed or not. Also allow the user to interrupt the program while it is running;
In      : name, notes;
Out     : display on the screen based on the numbers read, the average, the lowest number and the highest number;

[PT] Síntese
Objetivo: receber duas notas de um estudante usando double, mostrar as notas, as médias e informar se o aluno foi aprovado ou não. Também permitir que o usuário interrompa o programa durante sua execução;
Entrada : nome, notas;
Saída   : apresentar na tela as notas lidas, a média e o status de aprovação;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 7;
************************************************************************************************************************************/

public class Lesson2_ex7 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String Materia[] = new String[12], StatusDeAprovacao[] = new String [12];
		double Nota[] = new double [24], Media[] = new double [12], Soma [] = new double [12];
		char Resposta;
		int Aux = 0; // To help with apply 2 notes for every Matter/Para ajudar a aplicar 2 notas para cada Matéria

		// Defining Matters/Definindo Matérias	
		Materia[0] = "Português";
		Materia[1] = "Matemática";
		Materia[2] = "Biologia";
		Materia[3] = "Física";
		Materia[4] = "Química";
		Materia[5] = "Filosofia";
		Materia[6] = "Geografia";
		Materia[7] = "História";
		Materia[8] = "Sociologia";
		Materia[9] = "Educação Física";
		Materia[10] = "Artes";
		Materia[11] = "Lingua Estrangeira";

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		for (int i = 0; i < Materia.length; i++) { // Roll over "Materia" array/Rola pelo vetor "Materia"
			for (int n = 1; n < 3; n++) { // Roll over "Nota" array/Rola pelo vetor "Nota"
				do {
					System.out.println("Informe a sua nota do " + n + "º bimestre em " + Materia[i] + ": ");
					Nota[Aux] = new Scanner(System.in).nextDouble();
					if (Nota[Aux] < 0 || Nota[Aux] > 10) { // Loop if number is lower then 0 or high then 10/Gera um Loope se o número for menor que 0 ou maior que 10
						System.out.println("Você só pode inserir notas que estejam entre 0 e 10.");
					}
					}while (Nota[Aux] < 0 || Nota[Aux] > 10);
				Soma[i] = Soma[i] + Nota[Aux];
				Aux++;
			}
		}

		// Prompts the user if they want to interrupt execution/Pergunta ao usuário se deseja interromper a execução
		do { 
			System.out.println("Deseja continuar a execução do programa? (S/N)");
			Resposta = new Scanner(System.in).next().charAt(0);
			if (Resposta !='S' && Resposta !='N') {
				System.out.println("Você não respondeu adequadamente, insira S para sim ou N para não.");
			}
		} while (Resposta !='S' && Resposta !='N');
		if (Resposta == 'S') {
		} else if(Resposta == 'N') {
			System.out.println("Execução interrompida pelo usuário.");
			return;
		}
		
		// Calculating Mean/Calculando Média
		System.out.println("");
		System.out.println("# CALCULANDO MÉDIAS");
		System.out.println("MÉDIA = [SOMA DOS NOTAS] / QT DE NOTAS;");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
				System.out.println("MÉDIA = " + Soma[i] + " / 2;");	
				Media[i] = Soma[i] / 2;
				if (Media[i] > 5) {
					StatusDeAprovacao[i] = "APROVADO";
				} else {
					StatusDeAprovacao[i] = "REPROVADO";
				}
		}
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
			System.out.println("[" + Materia[i] + " - " + StatusDeAprovacao[i] + "] Com as notas " + Nota[Aux] + " e " + Nota[Aux+1] + ". Suma média final foi: " + Media[i] + ";");
			Aux++;
		}
	}
}