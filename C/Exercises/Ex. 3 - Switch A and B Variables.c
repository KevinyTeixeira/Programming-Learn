/******************************************************************************
[EN] Synthesis
Objective: swap A and B variables;
In       : A and B values;
Out      : swap A and B variables;

[PT] Síntese
Objetivo : trocar valores das variáveis A e B;
Entrada	 : valores de A e B;
Saída	 : valores de A e B trocados;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	int a, b, aux, mtd;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	//Collecting Data/ Coletando Dados
	printf("> O objetivo deste programa é inverter os valores das variáveis A e B. \nPara começar, insira o valor de A: ");
	scanf("%d", &a); fflush(stdin);
	printf("Agora insira o valor de B: ");
	scanf("%d", &b); fflush(stdin);
	printf("\n> Há duas formas desta troca ser feita, use 1 para o primeiro método, ou 2 para o segundo método:");
	printf("\nNo 1º usamos uma varíavel auxiliar (aux), que guardará o valor de A e posteriormente a declarará à variável B.");
	printf("\nNo 2º método, usamos apenas cálculos matemáticos para inverter os valores. \nEscolha (1/2): ");
	scanf("%d", &mtd); fflush(stdin);
	printf("\n> No presente momento os valores, os valores são: ");	
	printf("\nA = %d;", a);	
	printf("\nB = %d;", b);
	
	if (mtd == 1) {
		//Swaping Data/ Trocando dados
		printf("\n");
		printf("\n*Trocando valores de A e B...");
		aux = a; 
		printf("\n> AUX = A ∴ aux = %d;", aux);
		a = b;
		printf("\n> A = B ∴ A = %d;", a);
		b = aux;
		printf("\n> B = AUX ∴ B = %d;", b);
		printf("\n>Valor trocados com sucesso!"); }
	else if (mtd == 2) {
		//Swaping Data/ Trocando dados
		printf("\n");
		printf("\n*Trocando valores de A e B...");
		printf("\n> A = A + B ∴ A = %d + %d;", a, b);
		a = a + b;
		printf("\n> B = B - A ∴ B = %d - %d;", b, a);		
		b = a - b;
		printf("\n> A = A - B ∴ A = %d - %d;", a, b);	
		a = a - b;
		printf("\n> Valores trocados com sucesso!"); }
	else  {
		printf("\n> Você não inseriu valores válidos, use (1/2) para continar. Programa encerrado!");
		return 0;   }

	//Conclusion/ Conclusão
	printf("\n");
	printf("\n> Agora os valores são: ");
	printf("\nA = %d;", a);
	printf("\nB = %d;", b);
	return 0;
}