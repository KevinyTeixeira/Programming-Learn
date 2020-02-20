/******************************************************************************
[EN] Synthesis
Objective: generate multiple texts with multiple colors;
In       : no entry;
Out      : texts with different colors;

[PT] Síntese
Objetivo : gerar vários textos com várias cores;
Entrada	 : sem entrada;
Saída	 : textos com diversas cores;

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
	
	printf("*É importante observar que a biblioteca utilizada aqui (conio.h) só pode ser utilizada no Windows, portanto, os comandos textcolor e textbackground não funcionarão em outras plataformas. Vamos iniciar a impressão...\n");
	
	textbackground(GREEN);
	// message 
	cprintf("Change the background color to green");
	// set the color of text
	textcolor(BLUE);
	// message
	cprintf("Color of text is BLUE\n\n");
	// set blinking color
	textcolor(GREEN+BLINK);
	// message
	cprintf("\nThis is BLINKING text");
	getch();
	return 0;
	
}