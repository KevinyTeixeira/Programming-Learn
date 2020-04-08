package ucb.lesson7.ex1.main;

import ucb.lesson7.ex1.entity.Form;
import ucb.lesson7.ex1.entity.RightTriangle;
import ucb.lesson7.ex1.entity.Triangle;
import ucb.lesson7.reader.Leitor;

/**********************************************************************************************************************************************
[EN] Synthesis
Objective: receive the base and height values from the user, then calculate the figure of the right and right triangles. However, both have different calculations that must be treated in their respective classes;
In      : base, height;
Out     : display the interest resulting from the late payment of the debt on screen;

[PT] Síntese
Objetivo: receber do usuário os valores da base e da altura, em seguida calcular a figura dos triângulos retângulos e dos retângulos. No entanto, ambos tem cálculos diferentes que devem ser tratados em suas respectivas classes;
Entrada : base, altura;
Saída   : present the results of the calculations on screen;

Autor: Keviny Teixeira
QUESTION FROM LESSON 7, EXERCISE 1;

PACKAGES:

ucb.lesson7.ex1.main
- Main.java | The main class;

ucb.lesson7.ex1.methods
- Visao.java | All methods used in this source are here;

ucb.lesson7.ex1.entity
- Form.java | The forms class (primary entity)
- RectangleTriangle.java | The right triangle class (extended entity);
- Triangle.java | The triangle class (extended entity);

ucb.lesson7.reader
- Leitor.java | Assists in the process of reading the variables.;
***********************************************************************************************************************************************/
	
public class Main {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
		
	public static void main (String args[]) {

		// Collecting Data/Coletando Dados
		System.out.println("Este programa tem o objetivo de calcular a área de um triângulo retângulo, e de um triângulo.");
		System.out.println("");
		System.out.println("Informe a base da forma geométrica: ");
		Form.setBase(Leitor.lerDouble());
		System.out.println("Informe a altura da forma geométrica: ");
		Form.setAltura(Leitor.lerDouble());

		// Calculating area and printing results/Calculando area e imprimindo resultados
		Form rt = new RightTriangle(Form.getBase(), Form.getAltura());
		Form t = new Triangle(Form.getBase(), Form.getAltura());
		System.out.println("");
		rt.getHipotenusa(Form.getBase());
		rt.getArea(Form.getBase(), Form.getAltura());
		t.getArea(Form.getBase(), Form.getAltura());
		
	}
}
