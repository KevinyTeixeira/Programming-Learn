package Lesson2;

import java.util.Scanner;

/******************************************************************************
[EN] Synthesis
Objective: calculate a seller's final salary based on his salary and commission;
In      : seller's name, salary;
Out     : salary to be paid to the seller;

[PT] Síntese
Objetivo: calcular o salário final de um vendedor com base em seu salário e comissão;
Entrada : nome do vendedor, salario;
Saída   : salário a ser pago para o vendedor;

Autor: Keviny Teixeira
QUESTION FROM LESSON 2, EXERCISE 3;
*******************************************************************************/

public class Lesson2_ex3 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String vendedor;
		double salario, salarioFinal, comissao = 0.15;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do vendedor: ");
		vendedor = new Scanner(System.in).nextLine();
		System.out.println("Informe o salário(R$) do vendedor: ");
		salario = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		System.out.println("Considerando que a comissão recebida pelo vendedor seja de 15%.");
		System.out.println("Comissão = Salario * Comissão;");
		System.out.printf("Comissão = %.2f * %.2f;\n", salario, comissao);
		salarioFinal = salario * comissao; 
		System.out.println("SalárioFinal = Salario + Comissão;");
		System.out.printf("SalárioFinal = %.2f + %.2f;\n", salario, salarioFinal);
		salarioFinal = salarioFinal + salario;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O salário ao final do mês do(a) vendedor(a) " + vendedor + " é R$ " + salarioFinal + " reais;");
	}
}