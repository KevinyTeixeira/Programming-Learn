/******************************************************************************
[EN] Synthesis
Objetivo: manipulate a user-supplied number in several different formats;
In      : number;
Out     : show the number on the screen with the different formats;

[PT] Síntese
Objetivo: manipular um número fornecido pelo usuário em vários formatos diferentes;
Entrada	: número;
Saída	: mostrar na tela o número com as diferentes formatações;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language

int main() {

	// Statements/Declarações
	int numero;
	float numero_real;
	char nome[20];
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
		
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	// Collecting entrys/Coletando entradas
	printf("> Insira o número que deseja avaliar as formatações: ");
	scanf("%d", &numero); fflush(stdin);
	printf("> Insira o número real que deseja avaliar as formatações: ");
	scanf("%f", &numero_real); fflush(stdin);
	printf("> Insira seu nome: ");
	scanf("%s", nome); fflush(stdin);
	printf("\n");
	
	printf("*IMPRIMINDO DADOS;\n");
	
	// Decimal, Octal and Hexadecimal
	printf("> DECIMAL, OCTAL E HEXADECIMAL\n");
	printf("%d em decimal é apresentado como: %d\n", numero, numero);
	printf("%d em octal é apresentado como: %o\n", numero, numero);
	printf("%d em hexadecimal é apresentado como: %X\n", numero, numero);
	printf("\n");
	
	// Real Numbers and with decimal places/Números Reais e casas decimais
	printf("> NÚMEROS REAIS E CASAS DECIMAIS\n");
	printf("%f em real é apresentado como: %f\n", numero_real, numero_real);
	printf("%f em real (com 2 casas decimais) é apresentado como: %.2f\n", numero_real, numero_real);
	printf("\n");
	
	// Literal constants/Constantes Literais
	printf("> CONSTANTES LITERAIS\n");
	printf("O nome em string é apresentado como: %s\n", nome);
	printf("O primeiro caractere do nome inserido é apresentado como: %c\n", nome[0]);
	
	return 0;
}