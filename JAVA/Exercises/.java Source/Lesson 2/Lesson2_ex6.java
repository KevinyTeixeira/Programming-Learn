package Lesson2;

import java.util.Scanner;

/**********************************************************************************************************************************
[EN] Synthesis
Objective: receive two grades from a student using double, show grades, averages and inform whether the student has passed or not;
In      : name, notes;
Out     : display on the screen based on the numbers read, the average, the lowest number and the highest number;

[PT] S�ntese
Objetivo: receber duas notas de um estudante usando double, mostrar as notas, as m�dias e informar se o aluno foi aprovado ou n�o;
Entrada : nome, notas;
Sa�da   : apresentar na tela as notas lidas, a m�dia e o status de aprova��o;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 6;
************************************************************************************************************************************/

public class Lesson2_ex6 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		String materia[] = new String[12], statusDeAprovacao[] = new String [12];
		double nota[] = new double [24], media[] = new double [12], soma [] = new double [12];
		int aux = 0; // To help with apply 2 notes for every Matter/Para ajudar a aplicar 2 notas para cada Mat�ria

		// Defining Matters/Definindo Mat�rias	
		materia[0] = "Portugu�s";
		materia[1] = "Matem�tica";
		materia[2] = "Biologia";
		materia[3] = "F�sica";
		materia[4] = "Qu�mica";
		materia[5] = "Filosofia";
		materia[6] = "Geografia";
		materia[7] = "Hist�ria";
		materia[8] = "Sociologia";
		materia[9] = "Educa��o F�sica";
		materia[10] = "Artes";
		materia[11] = "Lingua Estrangeira";

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		for (int i = 0; i < materia.length; i++) { // Roll over "Materia" array/Rola pelo vetor "Materia"
			for (int n = 1; n < 3; n++) { // Roll over "Nota" array/Rola pelo vetor "Nota"
				do {
					System.out.println("Informe a sua nota do " + n + "� bimestre em " + materia[i] + ": ");
					nota[aux] = new Scanner(System.in).nextDouble();
					if (nota[aux] < 0 || nota[aux] > 10) { // Loop if number is lower then 0 or high then 10/Gera um Loope se o n�mero for menor que 0 ou maior que 10
						System.out.println("Voc� s� pode inserir notas que estejam entre 0 e 10.");
					}
					}while (nota[aux] < 0 || nota[aux] > 10);
				soma[i] = soma[i] + nota[aux];
				aux++;
			}
		}

		// Calculating Mean/Calculando M�dia
		System.out.println("");
		System.out.println("# CALCULANDO M�DIAS");
		System.out.println("M�DIA = [SOMA DOS NOTAS] / QT DE NOTAS;");
		aux = 0;
		for (int i = 0; i < materia.length; i++) {
				System.out.println("M�DIA = " + soma[i] + " / 2;");	
				media[i] = soma[i] / 2;
				if (media[i] > 5) {
					statusDeAprovacao[i] = "APROVADO";
				} else {
					statusDeAprovacao[i] = "REPROVADO";
				}
		}
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		aux = 0;
		for (int i = 0; i < materia.length; i++) {
			System.out.println("[" + materia[i] + " - " + statusDeAprovacao[i] + "] Com as notas " + nota[aux] + " e " + nota[aux+1] + ". Suma m�dia final foi: " + media[i] + ";");
			aux++;
		}
	}
}