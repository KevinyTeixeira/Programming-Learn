package ucb.project.poo.main;

import ucb.project.poo.methods.Visao;

/*******************************************************************************************************************************************************
[EN] Synthesis
Objective: create a program that registers employees (principals and teachers respecting the concept of inheritance and polymorphism) and allows the user to execute the getImpostoDeRenda method of an employee, or of several employees (in this case returning the average and the total calculated tax);
In      : name, registration, CPF, salary, position, length of service and year of admission;
Out     : display on screen the list and data of registered employees and income taxes calculated by the system;

[PT] S�ntese
Objetivo: criar um programa que cadastre funcion�rios (diretores e professores respeitando o conceito de heran�a e polimorfismo) e possibilite ao usu�rio executar o m�todo getImpostoDeRenda de um funcion�rio, ou de v�rios funcion�rios (nesse caso retornando a m�dia e o total do imposto calculado);
Entrada : nome, matr�cula, cpf, sal�rio, cargo, tempo de casa e ano de admiss�o;
Sa�da   : apresentar na tela a lista e os dados dos funcion�rios cadastrados e os impostos de renda calculados pelo sistema;

Autor: Keviny Teixeira
FINAL WORK FROM ORIENTED OBJECT PROGRAM IN UCB;

PACKAGES:

ucb.project.poo.main
- Main.java | The main class;
- SelectionMenu.java | The selection menu;

ucb.project.poo.entity
- Funcionario.java | The primary entity;
- Diretor.java | The extended entity;
- Professor.java | The extended entity;

ucb.project.poo.list
- ListaDeFuncionarios.java | The general ArrayList;

ucb.project.poo.methods
- Visao.java | All methods used in this source are here;

ucb.project.poo.reader
- Leitor.java | Assists in the process of reading the variables.;

********************************************************************************************************************************************************/

public class Main {
	public static void main (String[] args) {

		Visao.initEntryData(); //Adding 3 datas to ArrayList/Adicionando 3 funcion�rios � ArrayList
		SelectionMenu.Menu(); //Open selection menu/Executa o menu de sele��o

	}
}
