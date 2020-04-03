package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: calculate a seller's final salary based on his salary and commission;
In      : seller's name, salary;
Out     : salary to be paid to the seller;

[PT] S�ntese
Objetivo: calcular o sal�rio final de um vendedor com base em seu sal�rio e comiss�o;
Entrada : nome do vendedor, salario;
Sa�da   : sal�rio a ser pago para o vendedor;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 3;
*******************************************************************************/

public class Lesson2_ex3 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declara��es
		String vendedor;
		double salario, salarioFinal, comissao = 0.15;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do vendedor: ");
		vendedor = new Scanner(System.in).nextLine();
		System.out.println("Informe o sal�rio(R$) do vendedor: ");
		salario = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		System.out.println("Considerando que a comiss�o recebida pelo vendedor seja de 15%.");
		System.out.println("Comiss�o = Salario * Comiss�o;");
		System.out.printf("Comiss�o = %.2f * %.2f;\n", salario, comissao);
		salarioFinal = salario * comissao; 
		System.out.println("Sal�rioFinal = Salario + Comiss�o;");
		System.out.printf("Sal�rioFinal = %.2f + %.2f;\n", salario, salarioFinal);
		salarioFinal = salarioFinal + salario;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O sal�rio ao final do m�s do(a) vendedor(a) " + vendedor + " � R$ " + salarioFinal + " reais;");
	}
}