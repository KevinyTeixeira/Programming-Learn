/******************************************************************************
[EN] Synthesis
Objective: create a program that allows any number to be inserted by the user, and returns all previous numbers (of the number entered) and the sum of all numbers presented;
In       : number;
Out      : mostra na tela o número digitado pelo usuário, todos os números do número do usuário e a soma total;

[PT] Síntese
Objetivo : criar um programa que permita a inserção de um número qualquer pelo usuário, e retorne todos os números anteriores (ao número inserido) e a soma de todos os números apresentados;
Entrada	 : número;
Saída	 : mostra na tela o número inserido pelo usuário, todos os números anteriores ao número do usuário e a soma total;

Autor: Keviny Teixeira
Data: 14/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int soma_function (int n) { // Create a sum function/Criando função de soma
  int soma;
  	soma = 0; // Sum reset/Reseta a soma
	for(int cont = n; n > 0;n--) {
	  printf("%d ", n); // Print previous numbers/Imprime os números anteriores
		if(n != 1)
		printf("+ "); // Add Sum signal/Adiciona o sinal da Soma
		else
		printf("= "); // Add Equality signal/Adiciona o sinal de Igualdade
		soma = soma + n;}
		return (soma);//Sum result/Resultado da Soma
}

int main () {
	
	// Statements/Declarações
	int n, soma;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa é permitir que o usuário insira um número qualquer para que o programa apresente todos os números anteriores ao número inserido, e por fim, apresente a soma de todos os números apresentados.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Insira um número qualquer.\n" );
	printf("> NUM: ");
	scanf ("%d", &n); fflush(stdin);
	printf("\n");
	
	// Generating Previous Numbers/Gerando Números Anteriores
	soma = soma_function(n);
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("%d;", soma);
	return 0;

}