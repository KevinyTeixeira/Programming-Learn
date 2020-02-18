/******************************************************************************
[EN] Synthesis
Objective: use the operators (+, -, *, /,%, -, ++) in programming;
In       : number;
Out      : show the results of operations on the screen;

[PT] Síntese
Objetivo : utilizar os operadores (+, - ,*, /, %, --, ++) na programação;
Entrada	 : número;
Saída	 : mostrar na tela os resultados das operações;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	int num1, num2, resultado;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	// Collecting Data/Coletando Dados
	printf("Insira um número para participar das operações: ");
	scanf("%d", &num1);
	printf("Insira mais um número: ");
	scanf("%d", &num2);
	
	// Starting Operations/Iniciando Operações
	printf("\n\n*INICIANDO OPERAÇÕES;\n");
	resultado = num1 + num2; // Sum Operation/Operação de Soma 
	printf("SOMA: %d + %d = %d;\n", num1, num2, resultado); 
	resultado = num1 - num2; // Subtraction Operation/Operação de Subtração 
	printf("SUBTRAÇÃO: %d - %d = %d;\n", num1, num2, resultado); 
	resultado = num1 * num2; // Multiplication Operation/Operação de Multiplicação 
	printf("MULTIPLICAÇÃO: %d * %d = %d;\n", num1, num2, resultado); 
	resultado = num1 / num2; // Division Operation/Operação de Divisão
	printf("DIVISÃO: %d / %d = %d;\n", num1, num2, resultado); 
	resultado = num1 % num2; // Module Operation/Operação de Módulo
	printf("MÓDULO: |%d| |%d| = %d;\n", num1, num2, resultado); 
	num1++; num2++; // Increment Operation ++/Operação de ++
	printf("INCREMENTO COM ++: %d, e %d;\n", num1, num2); 
	num1--; num2--; // Decrement Operation --/Operação de --
	printf("DECREMENTO COM --: %d, e %d;\n", num1, num2); 
	return 0;
	
}