/******************************************************************************
[EN] Synthesis
Objetivo: use the Getch command in the program;
In      : key;
Out     : the input key;

[PT] Síntese
Objetivo: utilizar o comando Getch no programa;
Entrada	: tecla;
Saída	: a tecla de entrada;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.
#include <conio.h> // Required to use functions like getch, getche, gotoxy, textcolor, etc.

int main() {
	
	// Statements/Declarações
	char c;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*É importante observar que a biblioteca utilizada aqui (conio.h) só pode ser utilizada no Windows, portanto, os comandos getch e getche não funcionarão em outras plataformas. Vamos iniciar o teste dos comandos...\n");
	
	printf(">Pressione uma tecla : ");
	c = getche();
	printf("\n>Leitura feita com getche()");
	printf("\n>Pressione novamente uma tecla: ");
	c = getch();
	printf("\n>Leitura feita com getch()");
	getch();
	return 0;
	
}