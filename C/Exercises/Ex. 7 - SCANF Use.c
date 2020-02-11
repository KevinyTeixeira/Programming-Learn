/******************************************************************************
[EN] Synthesis
Objective: SCANF (Name and Numbers), and display their memory addresses;
In       : name, number;
Out      : print data and present their memory addresses;

[PT] Síntese
Objetivo : SCANF (Nome e Números), e apresentar seus endereços de memória;
Entrada	 : nome, número;
Saída	 : imprimir dados e apresentar seus endereços de memória;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {

	// Statements/Declarações
	char nome[15];
	int numero;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	printf("> Estre programa tem como objetivo utilizar o comando SCANF para imprimir nomes e números. É apenas um exercício de sua utilização.\n");
	
	//Scanf reading a name/Scanf faz leitura de um nome
	printf("* Insira seu primeiro nome: ");
	scanf("%s", nome); fflush(stdin);
	printf("> O nome digitado foi: %s;", nome);
	
	//Scanf reading a number/Scanf faz leitura de um número
	printf("\n\n* Insira um número qualquer: ");
	scanf("%d", &numero); fflush(stdin);
	printf("> O número digitado foi: %d;", numero);
	
	//Show in memory variable address/Mostra os endereços de memória das variáveis
	printf("\n\n* Endereços de memória;");
	printf("\n> Endereço da variável nome: %p;", &nome);
	printf("\n> Endereço da variável numero: %p;", &numero);
	return 0;
	
}