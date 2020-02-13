/******************************************************************************
[EN] Synthesis
Objective: create a program that checks if the year entered by the user is a leap year;
In       : year;
Out      : show on screen whether the year is leap year or not;

[PT] Síntese
Objetivo : criar um programa que verifique se o ano inserido pelo usuário é bissexto;
Entrada	 : ano;
Saída	 : mostrar na tela se o ano é bissexto ou não;

Autor: Keviny Teixeira
Data: 12/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main () {
	
	// Statements/Declarações
	int ano;
	float resultado;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa é permitir que o usuário insira um ano como dado de entrada para que o programa verifique se o ano é bissexto.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Informe um ano: ");
	scanf("%d;", &ano); fflush(stdin);
	printf("\n");
	printf("> A regra aplicada aqui segue 3 vertentes.\n");
	printf("> 1º: Se o ano é múltiplo de 400, então ele é bissexto.\n");
	printf("> 2º: Se o ano é múltiplo de 4, mas não é múltiplo de 100, então ele é bissexto.\n");
	printf("> 3º: Qualquer resultado diferente das condições 1 e 2 significa que o ano não é bissexto.\n\n");

	
	// Checking Year and Printing Operations/Checando Ano e Imprimindo Operações
	printf("*Verificando se o ano %d é bissexto...\n", ano);
	if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
	{
		resultado = ano % 4;
		printf("> |4| = %.2f;\n", resultado);
		resultado = ano % 100;
		printf("> |100| = %.2f;\n", resultado);
		resultado = ano % 400;
		printf("> |400| = %.2f;\n", resultado);
		printf("> %d é um ano bissexto. \n\n", ano); // apresenta na tela  caso condição seja verdadeira.
	}
	else
	{
		resultado = ano % 4;
		printf("> |4| = %.2f;\n", resultado);
		resultado = ano % 100;
		printf("> |100| = %.2f;\n", resultado);
		resultado = ano % 400;
		printf("> |400| = %.2f;\n", resultado);
    	printf("> %d não é um ano bissexto. \n\n", ano); // apresenta na tela caso condição seja verdadeira.
	}
	
	// Ending the program/Finalizando o programa
	printf("A execução do programa foi encerrada.");
	return 0;

}