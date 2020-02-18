/******************************************************************************
[EN] Synthesis
Objective: create a converter from miles to kilometers;
In       : miles quantity;
Out      : show on screen the value in kilometers corresponding to the miles entered;

[PT] Síntese
Objetivo : criar um conversor de milhas para quilômetros;
Entrada	 : quantidade de milhas;
Saída	 : mostrar na tela o valor em quilômetros correspondente as milhas inseridas;

Autor: Keviny Teixeira
Data: 11/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main () {
	
	// Statements/Declarações
	float milhas;
	float km;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa é apresentar uma quantidade de quilômetros que seja correspondente à quantidade de milhas inseridas pelo usuário. A conversão de milhas para km será apresentada na tela.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Informe um valor em Milhas: ");
	scanf("%f;", &milhas); fflush(stdin);
	printf("> 1 milha equivale a cerca de 1.60934 km.\n\n");
	
	// Converting Miles in km and Printing Operations/Convertendo Milhas em Kilômetros e Imprimindo Operações
	printf("*Convertendo milhas em quilômetros...\n");
	km = milhas * 1.60934; // converte milhas para km
	printf("> km = milhas * 1.60934; km = %.3f * 1.60934;", milhas);
	printf("\n\n");
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("*Imprimindo resultados...\n");
	printf("> %.3f milhas corresponde a <=> %2.3f km.", milhas, km); // apresenta na tela o valor convertido.s	
	return 0;
	
}