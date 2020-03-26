<p align="justify">See in <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/Ex.%20Lesson%202%20%5Bpt-br%5D.md">Português</a><br>

> The activities section of each lesson available in the UCB material aims to consolidate the student's learning regarding the studied and discussed contents. Therefore, the activities developed by UCB will be kept in this file together with my respective answers.<br>

### LESSON 2: Development Environment and U1 Syntax
**1. Create a program that allows the user to enter the following data: salary of a teacher, the age of a child, whether a server has health insurance or not, whether a person is married (c) or single (s) and the name of the student. Finally, print all entries using System.out.println.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex1.java">Lesson2_ex1.java</a>.</i><br>

```java
package lesson2;

import java.util.Scanner;

public class Lesson2_ex1 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String nomeAluno;
		char planoDeSaude, CasadoOuSolteiro;
		int idadeCrianca;
		double slProfessor;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do aluno: ");
		nomeAluno = new Scanner(System.in).nextLine();
		System.out.println("Informe a idade da criança: ");
		idadeCrianca = new Scanner(System.in).nextInt();
		System.out.println("Informe o salário do professor: ");
		slProfessor = new Scanner(System.in).nextDouble();
		do{
			System.out.println("O aluno tem plano tem plano de saúde? (S/N)");
			planoDeSaude = new Scanner(System.in).next().charAt(0);
			if (planoDeSaude !='S' && planoDeSaude !='N') {
				System.out.println("O usuário não usou caracteres válidos para responder se tem plano de saúde ou não. Por favor, insira S (para Sim) ou N (para Não)."); 
				System.out.println("RESPOSTA: " + planoDeSaude); 
			}
		}while(planoDeSaude !='S' && planoDeSaude !='N');
		do{
			System.out.println("O aluno é casado ou solteiro? (C/S)");
			CasadoOuSolteiro = new Scanner(System.in).next().charAt(0);
			if (CasadoOuSolteiro !='C' && CasadoOuSolteiro !='S') {
				System.out.println("O usuário não usou caracteres válidos para responder se é casado ou não. Por favor, insira C (para Casado) ou S (para Solteiro)."); 
			}
		}while(CasadoOuSolteiro !='C' && CasadoOuSolteiro !='S');
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O nome do aluno informado foi: "+ nomeAluno);
		System.out.println("A idade da criança informada foi: "+ idadeCrianca);
		System.out.println("O salário do professor informado foi: "+ slProfessor);
		if(planoDeSaude =='S'){
			System.out.println("Foi informado que o aluno tem plano de saúde.");
		}else{
			System.out.println("Foi informado que o aluno não tem plano de saúde.");
		}
		if(CasadoOuSolteiro =='C'){
			System.out.println("Foi informado que o aluno é casado.");
		}else{
			System.out.println("Foi informado que o aluno é solteiro.");
		}
	}
}
```

**2. Create a program that calculates the interest on a debt that you incurred last month in a store's installment. The monthly interest rate and the debt amount will be provided by the user.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex2.java">Lesson2_ex2.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex2 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		double TxDeJuros, Capital, Juros, Total;
		int Tempo;
		
		// Collecting Data/Coletando Dados
		System.out.println("Prezado usuário, informe o valor da sua dívida (R$): ");
		Capital = new Scanner(System.in).nextDouble();
		System.out.println("Informe a quantos meses você não paga esta dívida: ");
		Tempo = new Scanner(System.in).nextInt();
		System.out.println("Informe qual a taxa de juros mensal informado pela empresa(%): ");
		TxDeJuros = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		System.out.println("Juros = Taxa de Juros * Tempo;");
		System.out.printf("Juros = %.2f * %.2f * %d;\n", Capital, TxDeJuros, Tempo);
		Juros = Capital * TxDeJuros * Tempo;
		System.out.println("Total = Capital + Juros;");
		System.out.printf("Total = %.2f + %.2f;\n", Capital, Juros);
		Total = Capital + Juros;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.printf("\nVocê informou que sua dívida é: %.2f reais;\n", Capital);
		System.out.println("Você informou que não paga sua conta a: " + Tempo + " meses;");
		System.out.printf("Você informou que a taxa de juros mensal do banco é: %.2f%%;\n", TxDeJuros);
		System.out.printf("O juros acumulado é R$ %.2f reais.\nPortanto, sua dívida atualmente é R$ %.2f reais!", Juros, Total);
	}
}
```

**3. Create a program that reads a salesperson's name, fixed salary and total sales made by him in the month. Knowing that this seller earns 15% commission on his sales made, the program must show his name and salary at the end of the month as a result.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex3.java">Lesson2_ex3.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex3 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String Vendedor;
		double Salario, SalarioFinal, Comissao = 0.15;
		
		// Collecting Data/Coletando Dados
		System.out.println("Informe o nome do vendedor: ");
		Vendedor = new Scanner(System.in).nextLine();
		System.out.println("Informe o salário(R$) do vendedor: ");
		Salario = new Scanner(System.in).nextDouble();

		// Calculating Interest/Calculando Juros
		System.out.println("Considerando que a comissão recebida pelo vendedor seja de 15%.");
		System.out.println("Comissão = Salario * Comissão;");
		System.out.printf("Comissão = %.2f * %.2f;\n", Salario, Comissao);
		SalarioFinal = Salario * Comissao; 
		System.out.println("SalárioFinal = Salario + Comissão;");
		System.out.printf("SalárioFinal = %.2f + %.2f;\n", Salario, SalarioFinal);
		SalarioFinal = SalarioFinal + Salario;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("O salário ao final do mês do(a) vendedor(a) " + Vendedor + " é R$ " + SalarioFinal + " reais;");
	}
}
```

**4. Create a program that reads the age and height of 10 people. Calculate and report the average height of people over 50. For this, use for.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex4.java">Lesson2_ex4.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex4 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int Idade[] = new int [3];
		double Altura[] = new double [3], Media, Soma =0;
		
		// Collecting Data/Coletando Dados
		for (int i = 0; i < Idade.length; i++) {
			System.out.println("[" + i + "] Informe a idade desta pessoa: ");
			Idade[i] = new Scanner(System.in).nextInt();
			System.out.println("[" + i + "] Informe a altura desta pessoa:");
			Altura[i] = new Scanner(System.in).nextDouble();
			if (Idade[i] > 50) {
				Soma = Soma + Altura[i];				
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("MÉDIA = [Soma das Idades] / Qt de Idades;");
		System.out.println("MÉDIA = " + Soma + "/ " + Idade.length + ";");
		Media = Soma / Idade.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A média das alturas das pessoas que contém mais de 50 anos é: " +  Media);
	}
}
```

**5. Create a program that reads 500 integer and positive values and returns the highest value, the lowest value and the average of the numbers read. Make presentations to the user in an organized way.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex5.java">Lesson2_ex5.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex5 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int Numero[] = new int [500], Maior = 0, Menor = 999999999, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Informe o número que irá compor o vetor" + "[" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) { //Loop if number is lower then 0/Gera um Loope se o número for menor que 0
				System.out.println("Você não pode inserir números que sejam menores do que 0.");
			}
			}while (Numero[i] < 0);
			if (Menor > Numero[i]) { //Identifying if this is the lower number/Identificando se é o menor número
				Menor = Numero[i];
				System.out.println("O menor número agora passa a ser: " + Menor + ";");
			}
			if (Maior < Numero[i]) { //Identifying if this is the high number/Identificando se é o maior número
				Maior = Numero[i];				
				System.out.println("O maior número agora passa a ser: " + Maior + ";");
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("MÉDIA = [SOMA DOS NÚMEROS] / QT DE NÚMEROS;");
		System.out.println("MÉDIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("A média dos números lidos é: " +  Media);
		System.out.println("O menor número lido foi: " +  Menor);
		System.out.println("O maior número lido foi: " +  Maior);
	}
}
```
**6. Create a program that receives two grades from a student in double values. In the sequence, present all the values informed, the average, and if it is approved or disapproved. Detail: you must not allow values entered as grades to be less than 0 or greater than 10. For validation, use do / while.** <br><br>
**Note:** in this exercise I decided to challenge myself and try to declare two notes for each matter. I'm happy with the result!<br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex6.java">Lesson2_ex6.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex6 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String Nome, Materia[] = new String[12], StatusDeAprovacao[] = new String [12];
		double Nota[] = new double [24], Media[] = new double [12], Soma [] = new double [12];
		int Aux = 0; // To help with apply 2 notes for every Matter/Para ajudar a aplicar 2 notas para cada Matéria

		// Defining Matters/Definindo Matérias	
		Materia[0] = "Português";
		Materia[1] = "Matemática";
		Materia[2] = "Biologia";
		Materia[3] = "Física";
		Materia[4] = "Química";
		Materia[5] = "Filosofia";
		Materia[6] = "Geografia";
		Materia[7] = "História";
		Materia[8] = "Sociologia";
		Materia[9] = "Educação Física";
		Materia[10] = "Artes";
		Materia[11] = "Lingua Estrangeira";

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		for (int i = 0; i < Materia.length; i++) { // Roll over "Materia" array/Rola pelo vetor "Materia"
			for (int n = 1; n < 3; n++) { // Roll over "Nota" array/Rola pelo vetor "Nota"
				do {
					System.out.println("Informe a sua nota do " + n + "º bimestre em " + Materia[i] + ": ");
					Nota[Aux] = new Scanner(System.in).nextDouble();
					if (Nota[Aux] < 0 || Nota[Aux] > 10) { // Loop if number is lower then 0 or high then 10/Gera um Loope se o número for menor que 0 ou maior que 10
						System.out.println("Você só pode inserir notas que estejam entre 0 e 10.");
					}
					}while (Nota[Aux] < 0 || Nota[Aux] > 10);
				Soma[i] = Soma[i] + Nota[Aux];
				Aux++;
			}
		}

		// Calculating Mean/Calculando Média
		System.out.println("");
		System.out.println("# CALCULANDO MÉDIAS");
		System.out.println("MÉDIA = [SOMA DOS NOTAS] / QT DE NOTAS;");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
				System.out.println("MÉDIA = " + Soma[i] + " / 2;");	
				Media[i] = Soma[i] / 2;
				if (Media[i] > 5) {
					StatusDeAprovacao[i] = "APROVADO";
				} else {
					StatusDeAprovacao[i] = "REPROVADO";
				}
		}
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
			System.out.println("[" + Materia[i] + " - " + StatusDeAprovacao[i] + "] Com as notas " + Nota[Aux] + " e " + Nota[Aux+1] + ". Suma média final foi: " + Media[i] + ";");
			Aux++;
		}
	}
}
```

**7. Create a similar program of exercise 6, but with the difference that the user must inform if he wants to continue using the program by informing Y-Yes or N-No.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex7.java">Lesson2_ex7.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex7 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		String Materia[] = new String[12], StatusDeAprovacao[] = new String [12];
		double Nota[] = new double [24], Media[] = new double [12], Soma [] = new double [12];
		char Resposta;
		int Aux = 0; // To help with apply 2 notes for every Matter/Para ajudar a aplicar 2 notas para cada Matéria

		// Defining Matters/Definindo Matérias	
		Materia[0] = "Português";
		Materia[1] = "Matemática";
		Materia[2] = "Biologia";
		Materia[3] = "Física";
		Materia[4] = "Química";
		Materia[5] = "Filosofia";
		Materia[6] = "Geografia";
		Materia[7] = "História";
		Materia[8] = "Sociologia";
		Materia[9] = "Educação Física";
		Materia[10] = "Artes";
		Materia[11] = "Lingua Estrangeira";

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		for (int i = 0; i < Materia.length; i++) { // Roll over "Materia" array/Rola pelo vetor "Materia"
			for (int n = 1; n < 3; n++) { // Roll over "Nota" array/Rola pelo vetor "Nota"
				do {
					System.out.println("Informe a sua nota do " + n + "º bimestre em " + Materia[i] + ": ");
					Nota[Aux] = new Scanner(System.in).nextDouble();
					if (Nota[Aux] < 0 || Nota[Aux] > 10) { // Loop if number is lower then 0 or high then 10/Gera um Loope se o número for menor que 0 ou maior que 10
						System.out.println("Você só pode inserir notas que estejam entre 0 e 10.");
					}
					}while (Nota[Aux] < 0 || Nota[Aux] > 10);
				Soma[i] = Soma[i] + Nota[Aux];
				Aux++;
			}
		}

		// Prompts the user if they want to interrupt execution/Pergunta ao usuário se deseja interromper a execução
		do { 
			System.out.println("Deseja continuar a execução do programa? (S/N)");
			Resposta = new Scanner(System.in).next().charAt(0);
			if (Resposta !='S' && Resposta !='N') {
				System.out.println("Você não respondeu adequadamente, insira S para sim ou N para não.");
			}
		} while (Resposta !='S' && Resposta !='N');
		if (Resposta == 'S') {
		} else if(Resposta == 'N') {
			System.out.println("Execução interrompida pelo usuário.");
			return;
		}
		
		// Calculating Mean/Calculando Média
		System.out.println("");
		System.out.println("# CALCULANDO MÉDIAS");
		System.out.println("MÉDIA = [SOMA DOS NOTAS] / QT DE NOTAS;");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
				System.out.println("MÉDIA = " + Soma[i] + " / 2;");	
				Media[i] = Soma[i] / 2;
				if (Media[i] > 5) {
					StatusDeAprovacao[i] = "APROVADO";
				} else {
					StatusDeAprovacao[i] = "REPROVADO";
				}
		}
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		Aux = 0;
		for (int i = 0; i < Materia.length; i++) {
			System.out.println("[" + Materia[i] + " - " + StatusDeAprovacao[i] + "] Com as notas " + Nota[Aux] + " e " + Nota[Aux+1] + ". Suma média final foi: " + Media[i] + ";");
			Aux++;
		}
	}
}
```

**8. Create a program that receives 5,000 user data of the int type. It is known that negative values are not accepted. After receiving these values and populating the array, print on the standard output the average of the values, how many values are odd and all the values that were informed.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson2_ex8.java">Lesson2_ex8.java</a>.</i><br>

```java
package Lesson2;

import java.util.Scanner;

public class Lesson2_ex8 {
	
	@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	
	
	public static void main (String args[]) {
	
		// Statementes/Declarações
		int Numero[] = new int [5000], QtImpar = 0, Soma = 0;
		double Media;

		// Collecting Data/Coletando Dados
		System.out.println("# COLETANDO DADOS");
		System.out.println("Você precisará popular 5 mil vetores. (Somente Números Inteiros e Positivos)");
		for (int i = 0; i < Numero.length; i++) {
			do {
			System.out.println("Insira um número para o vetor [" + i + "]: ");
			Numero[i] = new Scanner(System.in).nextInt();
			if (Numero[i] < 0) {
				System.out.println("Não é permitido números negativos, insira somente números positivos");
			} 		
			}while (Numero[i] < 0);
			if (Numero[i] % 2 != 0) {
				QtImpar++;
			}
			Soma = Soma + Numero[i];
		}

		// Calculating Mean/Calculando Média
		System.out.println("");
		System.out.println("# CALCULANDO MÉDIA");
		System.out.println("MÉDIA = [SOMA DOS NÚMEROS] / QT DE NÚMEROS;");
		System.out.println("MÉDIA = " + Soma + " / " + Numero.length + ";");
		Media = Soma / Numero.length;
		
		// Printing results and ending the program/Imprimindo resultados e finalizando o programa
		System.out.println("");
		System.out.println("# IMPRIMINDO RESULTADOS");
		for (int i = 0; i < Numero.length; i++) {
			System.out.print(" [" + i + "] = " + Numero[i] + ";");
		}
		System.out.println("");
		System.out.println("A média dos números lidos foi: " + Media + ";");
		System.out.println("O total de números ímpares lidos foi: " + QtImpar + ";");
	}
}
```
