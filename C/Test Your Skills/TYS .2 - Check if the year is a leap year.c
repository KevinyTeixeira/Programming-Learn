/******************************************************************************
[EN] Synthesis
Objective: create a program that checks if the year entered by the user is a leap year;
In       : year;
Out      : show on screen whether the year is leap year or not;

[PT] S�ntese
Objetivo : criar um programa que verifique se o ano inserido pelo usu�rio � bissexto;
Entrada	 : ano;
Sa�da	 : mostrar na tela se o ano � bissexto ou n�o;

Autor: Keviny Teixeira
Data: 12/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main () {
	
	// Statements/Declara��es
	int ano;
	float resultado;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localiza��o padr�o do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa � permitir que o usu�rio insira um ano como dado de entrada para que o programa verifique se o ano � bissexto.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Informe um ano: ");
	scanf("%d;", &ano); fflush(stdin);
	printf("\n");
	printf("> A regra aplicada aqui segue 3 vertentes.\n");
	printf("> 1�: Se o ano � m�ltiplo de 400, ent�o ele � bissexto.\n");
	printf("> 2�: Se o ano � m�ltiplo de 4, mas n�o � m�ltiplo de 100, ent�o ele � bissexto.\n");
	printf("> 3�: Qualquer resultado diferente das condi��es 1 e 2 significa que o ano n�o � bissexto.\n\n");

	
	// Checking Year and Printing Operations/Checando Ano e Imprimindo Opera��es
	printf("*Verificando se o ano %d � bissexto...\n", ano);
	if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
	{
		resultado = ano % 4;
		printf("> |4| = %.2f;\n", resultado);
		resultado = ano % 100;
		printf("> |100| = %.2f;\n", resultado);
		resultado = ano % 400;
		printf("> |400| = %.2f;\n", resultado);
		printf("> %d � um ano bissexto. \n\n", ano); // apresenta na tela  caso condi��o seja verdadeira.
	}
	else
	{
		resultado = ano % 4;
		printf("> |4| = %.2f;\n", resultado);
		resultado = ano % 100;
		printf("> |100| = %.2f;\n", resultado);
		resultado = ano % 400;
		printf("> |400| = %.2f;\n", resultado);
    	printf("> %d n�o � um ano bissexto. \n\n", ano); // apresenta na tela caso condi��o seja verdadeira.
	}
	
	// Ending the program/Finalizando o programa
	printf("A execu��o do programa foi encerrada.");
	return 0;

}