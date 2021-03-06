/******************************************************************************
[EN] Synthesis
Objective: create a program that allows the insertion of the values of a matrix [3][4] by the user, and create a transposed matrix from the generated matrix;
In       : matrix [3][4] values;
Out      : show on screen the matrix generated by the user and the transposed matrix generated by the program;

[PT] S�ntese
Objetivo : criar um programa que permita a inser��o dos valores de uma matriz [3][4] pelo usu�rio, e crie uma matriz transposta a partir da matriz gerada;
Entrada	 : valores da matriz [3][4];
Sa�da	 : mostrar na tela a matriz gerada pelo usu�rio e a matriz transposta gerada pelo programa;

Autor: Keviny Teixeira
Data: 13/02/2020
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main () {
	
	// Statements/Declara��es
	int mtrx[3][4], mtrx_transp[4][3], lin , col;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localiza��o padr�o do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa � permitir que o usu�rio insira os valores correspondentes para compor a matriz [3][4] para que o programa gere uma matriz transposta a partir desta.\n");
	
	// Collecting Data/Coletando Dados
	for(lin = 0; lin < 3;lin++) {
		for(col = 0; col < 4;col++) {
	  printf("> Insira um elemento para compor a matriz [%d][%d].\n", lin, col);
	  printf("> MATRIZ [%d][%d]: ", lin, col);
	  scanf ("%d", &mtrx[ lin ][ col ]); fflush(stdin);
		}
		printf ("\n");
	}
	
	// Generating Transposed Matrix/Gerando Matriz Transposta
	 for (lin = 0; lin < 4; lin++) {
		for (col = 0; col < 3; col++) {
			mtrx_transp[lin][col] = mtrx[col][lin];}
		col=0;
		}
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("*Imprimindo resultados...\n");
	printf("> A matriz gerada por voc� �:\n\n"); //User Matrix/Matriz do Usu�rio
	  for (lin = 0; lin < 3; lin++) {
		for (col = 0; col < 4; col++) {
		  printf("[%d]\t", mtrx[lin][col]);
		}
		printf("\n\n");
	 }
	printf("> A matriz transposta gerada pelo programa �:\n\n"); //Program Transposed Matrix/Matriz Transposta do Programa
	   for (lin = 0; lin < 4; lin++) {
		for (col = 0; col < 3; col++) {
		  printf ("[%d]\t",mtrx_transp[lin][col]);
		}
		printf("\n");
	  }

	return 0;

}