/******************************************************************************
[EN] Synthesis
Objective: calculate the hypotenuse of a triangle based on the cathetus reported by the user;
In       : cathetus a, cathetus b;
Out      : show on screen the hypotenuse of the triangle;

[PT] Síntese
Objetivo : calcular a hipotenusa de um triângulo com base nos catetos informados pelo usuário;
Entrada	 : cateto a, cateto b;
Saída	 : mostrar na tela a hypotenusa do triângulo;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <math.h> // Required to use sqrt function.
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	double cateto_a, cateto_b, hipotenusa;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	// Collecting Data/Coletando Dados
	printf("*Este programa tem como objetivo calcular a hipotenusa do triângulo com base nos catetos informados pelo usuário.\n");
	printf(">Insira o valor do CATETO A: ");
	scanf("%lf", &cateto_a);
	printf(">Insira o valor do CATETO B: ");
	scanf("%lf", &cateto_b);
	printf("\n");

	// Calculating and printing operations/Calculando e imprimindo operações	
	printf("*Calculando a HIPOTENUSA do triângulo...\n");
	printf(">√(%.2lf*%.2lf + ", cateto_a, cateto_a);
	printf("%.2lf*%.2lf);", cateto_b, cateto_b);	
	hipotenusa = sqrt (cateto_a*cateto_a + cateto_b*cateto_b); // Sqrt function is use to square root/Sqrt refere-se a raiz quadrada.
	printf("\n\n");
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("*Imprimindo resultados...\n");
	printf(">HIPOTENUSA = %.2lf;", hipotenusa);
	return 0;
	
}