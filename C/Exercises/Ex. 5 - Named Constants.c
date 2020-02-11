/******************************************************************************
[EN] Synthesis
Objective: use the property "const" when declaring the variable to calculate the perimeter and circumference of an area.;
In       : pi, radius;
Out      : show the area, perimeter and circumference on the screen;

[PT] Síntese
Objetivo : utilizar a propriedade "const" ao declarar a variável para cálcular o perímetro e a circunferência de uma área;
Entrada	 : pi, raio;
Saída	 : mostrar na tela a área, o perímetro e a circunferência;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	const float pi = 3.1415;
	const int raio = 5;
	double areaCirc = pi * raio * raio;
	double perimCirc = 2 * pi * raio;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	printf("> O objetivo deste programa é apresentar a área e o perímetro de uma circunferência.\n");
	printf("> O cálculo da área é dada pela expressão: PÍ*RAIO^2\n;");
	printf("> O calculo do perímetro é dado pela expressão: 2*PÍ*RAIO;\n\n");
	
	printf("*DADOS DA QUESTÃO;\n");
	printf("> PI = %.2f;\n", pi);
	printf("> RAIO = %d;\n\n", raio);
	
	printf("*RESULTADO;\n");
	printf("Área = %.2f;\n", areaCirc);
	printf("Perímetro = %.2f;\n", perimCirc);
	printf("Circunferência do Raio = %d;", raio);
	return 0;
	
}