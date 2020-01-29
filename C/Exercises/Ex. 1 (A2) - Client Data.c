/******************************************************************************
[EN] Synthesis
Objetivo: register data for an airline customer;
In      : name, sex, cpf, phone ddd, bagsQtd, bgasTotalWeight;
Out     : show data on screen;

[PT] Síntese
Objetivo: cadastrar dados de um cliente da companhia aérea;
Entrada	: nome, sexo, cpf, telefone ddd, qtdMalas, psTotaldeMalas;
Saída	: mostrar os dados na tela;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.
#include<stdlib.h>

int main() {
	
	// Statements/Declarações
	char nome[100], cpf[11], fone[12], sexo, resposta; 
	float psTotaldeMalas;
	int qtdMalas;
	
	setlocale(LC_ALL,""); // Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	// Getting started/Iniciando Atendimento
	printf(">ATENDENTE: Para efetuar o cadastro na companhia aérea American Airlines, precisaremos que você forneça os seguintes dados (nome, sexo, cpf e telefone para contato). Também iremos pesar suas malas e observar a quantidade de malas que trouxe para saber se está tudo de acordo com as regras da empresa. Vamos começar? (s/n) \n");
	fflush(stdin); scanf("%c", &resposta); 
	while ((resposta != 's') && (resposta != 'n')) {
		printf(">ATENDENTE: Desculpe, sua resposta não ficou clara para mim. Insira (s/n) para responder.\n");
		fflush(stdin); scanf("%c", &resposta); 
	}
	if(resposta == 's') {
		// Collecting entrys/Coletando entradas
		printf(">ATENDENTE: Ótimo! Vamos começar então, informe seu nome completo por gentileza.\n");
		fflush(stdin); 	fgets(nome, 100, stdin);
		printf(">ATENDENTE: Agora informe seu CPF.\n");
		fflush(stdin); 	scanf("%s", cpf);
		printf(">ATENDENTE: Um número para contato (somente números).\n");
		fflush(stdin); 	scanf("%s", fone);
		printf(">ATENDENTE: Seu sexo. (M / F) \n");
		fflush(stdin); 	scanf("%c", &sexo);
		printf("TESTE %c\n", sexo);
		qtdMalas = rand()%7; psTotaldeMalas = (float)rand()/(float)(RAND_MAX) * 23;
		printf(">ATENDENTE: Perfeito! Agora avaliando suas malas, parece você trouxe %d malas.\n", qtdMalas);
		printf(">ATENDENTE: Já sobre o peso de suas malas, deu cerca de %.2f Kg.\n", psTotaldeMalas);
	}
	else if (resposta == 'n')
		printf(">ATENDENTE: Entendo, volte quando estiver disponível.");
		return 0;
}