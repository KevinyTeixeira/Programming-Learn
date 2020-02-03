/******************************************************************************
[EN] Synthesis
Objetivo: practice variables with SIGNED, UNSIGNED, SHORT and LONG modifiers;
In      : int;
Out     : show on the screen all the characteristics of the modifiers;

[PT] Síntese
Objetivo: praticar variáveis com modificadores SIGNED, UNSIGNED, SHORT e LONG;
Entrada	: inteiros;
Saída	: mostrar na tela todos as características dos modificadores;

Autor: Keviny Teixeira
*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main() {
	
	// Statements/Declarações
	unsigned int unsignedInt = 97;
	signed int signedInt = 97;
	short int shortInt = 55;
	long int longInt = 55;
	int commonInt = 55;
	
	setlocale(LC_ALL,"");// Set current user location default of SO/Adota a localização padrão do SO
	
	printf("*INICIANDO PROGRAMA EM C;\n");
	
	// SIGNED E UNSIGNED
	printf("1. SIGNED e UNSIGNED são responsáveis por fornecer um controle sobre a faixa de valores dos inteiros através do sinal.\n");
	printf(">Vejamos o modificador SIGNED, ele permite que seja utilizado sinais POSITIVOS(+) e NEGATIVOS (-). Um exemplo pode ser o número 97, veja abaixo ao atribuirmos o valor como positivo e outro como negativo.\n");
	printf("  >POSITIVO: %d;\n", signedInt); signedInt = -97;
	printf("  >NEGATIVO: %d;\n", signedInt);
	printf("  >VALE LEMBRAR: o uso do SIGNED serve apenas para fins didáticos, já que ao declarar Int, o C adota automaticamente o Int como signed.\n");
	printf(">Vejamos agora o modificador UNSIGNED, ele permite que seja utilizado apenas sinais POSITIVOS(+). Utilizando o mesmo exemplo do número 97, veja como o resultado se comporta.\n");
	printf("  >POSITIVO: %d;\n", unsignedInt); unsignedInt = unsignedInt-98;
	printf("  >NEGATIVO: %d;\n", unsignedInt);
	printf("\n");
	// SHORT E LONG
	printf("2. SHORT e LONG são responsáveis por fornecer um controle sobre o tamanho dos inteiros.\n");
	printf(">Vejamos o tamanho desses modificadores.\n");
	printf("  >INTEIRO...: %d, %zu bytes;\n", commonInt, sizeof(int) );
	printf("  >LONG......: %d, %zu bytes;\n", longInt, sizeof(long) );
	printf("  >SHORT.....: %d, %zu bytes;\n", shortInt, sizeof(short) );
	printf(">Por fim, segue abaixo a diferença entre os inteiros com relação aos bytes armazenados:\n");
	printf("  >Um inteiro de 1 byte (char) armazena do número -128 a +127;\n");
	printf("  >Um inteiro de 2 bytes armazena do número -32 768 a +32 767;\n");
	printf("  >Um inteiro de 4 bytes armazena do número -2 147 483 648 a +2 147 483 647;\n");
	printf("  >Um inteiro de 8 bytes armazena do número -9 223 372 036 854 775 808 a +9 223 372 036 854 775 807;\n");
	return 0;
}