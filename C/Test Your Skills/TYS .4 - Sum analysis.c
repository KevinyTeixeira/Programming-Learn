/******************************************************************************
[EN] Synthesis
Objective: create a program that allows any number to be inserted by the user, and returns all previous numbers (of the number entered) and the sum of all numbers presented;
In       : number;
Out      : mostra na tela o n�mero digitado pelo usu�rio, todos os n�meros do n�mero do usu�rio e a soma total;

[PT] S�ntese
Objetivo : criar um programa que permita a inser��o de um n�mero qualquer pelo usu�rio, e retorne todos os n�meros anteriores (ao n�mero inserido) e a soma de todos os n�meros apresentados;
Entrada	 : n�mero;
Sa�da	 : mostra na tela o n�mero inserido pelo usu�rio, todos os n�meros anteriores ao n�mero do usu�rio e a soma total;

Autor: Keviny Teixeira
Data: 14/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int soma_function (int n) { // Create a sum function/Criando fun��o de soma
  int soma;
  	soma = 0; // Sum reset/Reseta a soma
	for(int cont = n; n > 0;n--) {
	  printf("%d ", n); // Print previous numbers/Imprime os n�meros anteriores
		if(n != 1)
		printf("+ "); // Add Sum signal/Adiciona o sinal da Soma
		else
		printf("= "); // Add Equality signal/Adiciona o sinal de Igualdade
		soma = soma + n;}
		return (soma);//Sum result/Resultado da Soma
}

int main () {
	
	// Statements/Declara��es
	int n, soma;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localiza��o padr�o do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa � permitir que o usu�rio insira um n�mero qualquer para que o programa apresente todos os n�meros anteriores ao n�mero inserido, e por fim, apresente a soma de todos os n�meros apresentados.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Insira um n�mero qualquer.\n" );
	printf("> NUM: ");
	scanf ("%d", &n); fflush(stdin);
	printf("\n");
	
	// Generating Previous Numbers/Gerando N�meros Anteriores
	soma = soma_function(n);
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("%d;", soma);
	return 0;

}