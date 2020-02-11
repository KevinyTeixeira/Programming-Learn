/******************************************************************************
[EN] Synthesis
Objective: create a converter from miles to kilometers;
In       : miles quantity;
Out      : show on screen the value in kilometers corresponding to the miles entered;

[PT] S�ntese
Objetivo : criar um conversor de milhas para quil�metros;
Entrada	 : quantidade de milhas;
Sa�da	 : mostrar na tela o valor em quil�metros correspondente as milhas inseridas;

Autor: Keviny Teixeira
Data: 11/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main () {
	
	// Statements/Declara��es
	float milhas;
	float km;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localiza��o padr�o do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa � apresentar uma quantidade de quil�metros que seja correspondente � quantidade de milhas inseridas pelo usu�rio. A convers�o de milhas para km ser� apresentada na tela.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Informe um valor em Milhas: ");
	scanf("%f;", &milhas); fflush(stdin);
	printf("> 1 milha equivale a cerca de 1.60934 km.\n\n");
	
	// Converting Miles in km and Printing Operations/Convertendo Milhas em Kil�metros e Imprimindo Opera��es
	printf("*Convertendo milhas em quil�metros...\n");
	km = milhas * 1.60934; // converte milhas para km
	printf("> km = milhas * 1.60934; km = %.3f * 1.60934;", milhas);
	printf("\n\n");
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("*Imprimindo resultados...\n");
	printf("> %.3f milhas corresponde a <=> %2.3f km.", milhas, km); // apresenta na tela o valor convertido.s	
	return 0;
	
}