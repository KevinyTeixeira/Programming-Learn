/******************************************************************************
[EN] Synthesis
Objetivo: printf the iconic phrase "Hello World";
In      : no entry;
Out     : show welcome on screen with the user name;

[PT] Síntese
Objetivo: escrever com printf a icônica frase "Hello World";
Entrada : sem entrada;
Saída   : mostrar na tela as boas vindas com o nome do usuário;

Autor: Keviny Teixeira

*******************************************************************************/

#include <stdio.h>
#include <locale.h> // Required to include the Portuguese language.

int main()  {
    
    setlocale(LC_ALL,"");
    printf("*INICIANDO PROGRAMA EM C;");
    printf("\n> [EN] Hello World! Keviny, welcome to C language!");
    printf("\n> [PT] Olá Mundo! Keviny, seja bem vindo à linguagem C!");
    return 0;
    
}
