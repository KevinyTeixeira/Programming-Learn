/******************************************************************************
[EN] Synthesis
Objetivo: working with literary variables with scanf and fgets;
In      : name;
Out     : show names on screen using scanf and fgtes;

[PT] Síntese
Objetivo: trabalhar com variáveis literarias com scanf e fgets;
Entrada	: nome;
Saída	: mostrar na tela nomes usando scanf e fgtes;

Autor: Keviny Teixeira

*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	char nome[20];
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	printf("> Este programa tem como objetivo apenas praticar o uso dos comandos SCANF e FGETS.\n");
	printf("\n> Esta atribuição será feita pelo FGETS. Insira seu nome e sobrenome: "); 
	fgets( nome, 20, stdin); // FGETS assigning a name to the variable "name"/FGETS atribundo um nome à variável "nome"
	printf("> FGETS: %s ", nome);
	printf("\n> Esta atribuição será feita pelo SCANF. Insira somente seu nome: ");
	scanf("%s", nome); 	fflush(stdin); // SCANF assigning a name to the variable "name"/SCANF atribundo um nome à variável "nome"
	printf("> SCANF: %s.", nome);
	
}