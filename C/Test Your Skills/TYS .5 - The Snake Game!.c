/******************************************************************************
[EN] Synthesis
Objective: create a snake game in C;
In       : ###;
Out      : a snake game capable of being played by the user;

[PT] Síntese
Objetivo : criar um jogo da serpente em C;
Entrada	 : ###;
Saída	 : um jogo da serpente capaz de ser jogado pelo usuário;

Autor: Keviny Teixeira
Data: 17/02/2020
Source: Jwalin Bhatt, thanks for sharing; see in https://www.youtube.com/watch?v=8voxkPQ5n8c;
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.
#include <graphics.h> 
#include <time.h>

int main() {

	// Statements/Declarações
	int i, x[100], y[100], rx, ry, gd, gm, l, d=2, s=16;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa é permitir executar o jogo da serpente em que o usuário seja capaz de interagir.\n");
	
	// Collecting Data/Coletando Dados STARTING!
	srand(time(NULL));
	detectgraph(&gd,&gm);
	initgraph(&gd,&gm,NULL);
	setfillstyle(1,1);
	
	//BOUNDARY
	bar(s-s/2,s-s/2,(s/2)+s*(1350/s),s+s/2); //TOP
	bar(s-s/2,(-s/2)+s*(700/s),(s/2)+s*(1350/s),(s/2)+s*(700/s)); //BOTTOM
	bar(s-s/2,s-s/2,s+s/2,(s/2)+s*(700/s)); //LEFT
	bar((-s/2+s*(1350/s),s-s/2,(s/2)+s*(1350/s),(s/2)+s*(700/s)); //RIGHT
	getch();
	
	// The Snake!
	x[0]=s*(1350/(s*s)); y[0]=s*(700/(2*s));
	bar(X[0]-s/2,y[0]-s/2,x[0]+s/2,y[0]+s/2);
	l=5;
	for (i=1;i<l;i++)
	{
		x[i]=x[0]-(i*s);
		y[i]=y[0];
		bar(x[i]-s/2,y[i]-s/2,x[i]+s/2,y[i]+s/2;
	}
	
	//The Snake food!
	rx=s; ry=s;
	setfiilstyle(1,2);
	while(getpixel(rx,ry)!=0)
	{
		rx=s*(1+rand()%(1350/s-1));
		ry=s*(1+rand()%(700/s-1));
	}
	bar(rx-s/2, ry-s/2, rx+s/2, ry+s/2);
	delay(2000);
	while(1)
	{
		//UPDATING THE SNAKE
		setfillstyle(1,0);
		bar(x[l-1]-s/2,y[l-1]-s,x[l-1]+s/2,y[l-1]+s/2);
		for(i=l;i>0;i--)
		{
			x[i]=x[i-1];
			y[i]=y[i-1];
		}
		//UPDATING HEAD
		if (d == 0);
			x[0]=x[0]-s;
		else if (d == 1);
			y[0]=y[0]-s;
		else if (d == 2);
			x[0]=x[0]+s;
		else if (d == 3);
			y[0]=y[0]+s;
		//TERMINATION CONDITION
		if (getpixel(x[0], y[0])==1)
			break;
		//UPDATING DIRECTION
		if (GetAsyncKeyState(VK_RIGHT)&&d!=0);
			d = 2;
		else if (GetAsyncKeyState(VK_UP)&&d!=3);
			d = 1;
		else if (GetAsyncKeyState(VK_LEFT)&&d!=2);
			d = 0;
		else if (GetAsyncKeyState(VK_DOWN)&&d!=1);
			d = 3;
		if (getpixel (x[0], y[0])==2) //FOOD TAKEN?
		{
			rx = s; ry = s;
			setfillstyle(1,2);
			while(getpixel(rx,ry)!=0)
			{
				rx=s*(1+rand()%(1350/s-1));
				ry=s*(1+rand()%(700/s-1));
			}
			bar(rx-s/2, ry-s/2, rx+s/2, ry+s/2);
			l=l++;
		}
		// displaying the snake
		setfillstyle (1,1);
		for (i=0;i<l;i++)
			bar(x[i]-s/2,y[i]-s/2,x[i]+s/2,y[i]+s/2);
		delay(100);
	}
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("Sua pontuação foi: %d", l-5);
	while(!GetAsyncKeyState(VK_RETURN)); // Loop Structure/Estrutura de Repetição
	closegraph();
	getch();
	return 0;
}

/******************************************************************************
int main () {
	
	// Statements/Declarações
	int n, soma;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n\n");
	
	printf("*O objetivo deste programa é permitir que o usuário insira um número qualquer para que o programa apresente todos os números anteriores ao número inserido, e por fim, apresente a soma de todos os números apresentados.\n");
	
	// Collecting Data/Coletando Dados
	printf("> Insira um número qualquer.\n" );
	printf("> NUM: ");
	scanf ("%d", &n); fflush(stdin);
	printf("\n");
	
	// Generating Previous Numbers/Gerando Números Anteriores
	soma = soma_function(n);
	
	// Printing results and ending the program/Imprimindo resultados e finalizando o programa
	printf("%d;", soma);
	return 0;

}
*******************************************************************************/
