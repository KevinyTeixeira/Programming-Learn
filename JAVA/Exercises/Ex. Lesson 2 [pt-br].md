<p align="justify">Veja em <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/Ex.%20Lesson%202.md">English</a>.

> A seção de atividades de cada lição disponível no material da UCB objetivam consolidar a aprendizagem do aluno quanto aos conteúdos estudados e dicutidos. Sendo assim, as atividades elaboradas pela UCB serão guardadas neste arquivo juntamente com minhas respectivas respostas.<br>

### LIÇÃO 2: Ambiente de Desenvolvimento e Sintaxe U1
**1. Crie um programa que permita a entrada pelo usuário dos seguintes dados: salário de um professor, a idade de uma criança, se um servidor tem plano de saúde ou não, se uma pessoa é casada (c) ou solteira (s) e o nome do aluno. Por fim, imprima todas as entradas usando System.out.println.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex1.java">Lesson2_ex1.java</a>.</i><br>

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

**2. Crie um programa que calcule o juro de uma dívida que você contraiu no mês passado no crediário de uma loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex2.java">Lesson2_ex2.java</a>.</i><br>

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

**3. Crie um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês. Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, o programa deve mostrar como resultado o seu nome e o seu salário no final do mês.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex3.java">Lesson2_ex3.java</a>.</i><br>

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

**4. Crie um programa que leia a idade e a altura de 10 pessoas. Calcule e informe a média das alturas das pessoas com mais de 50 anos. Para isso, use for.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex4.java">Lesson2_ex4.java</a>.</i><br>

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

**5. Crie um programa que leia 500 valores inteiros e positivos e retorne o maior valor, o menor valor e a média dos números lidos. Faça as apresentações para o usuário de forma organizada.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex5.java">Lesson2_ex5.java</a>.</i><br>

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
**6. Crie um programa que receba duas notas de um estudante em valores double. Na sequência, apresente todos os valores informados, a média, e se ele está aprovado ou reprovado. Detalhe: você não deve permitir que os valores informados como notas sejam inferiores a 0 ou superiores a 10. Para validação, use do/while.** <br><br>
**Observação:** neste exercício eu resolvi me desafiar e tentar declarar duas notas para cada matéria. Estou feliz com o resultado!<br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex6.java">Lesson2_ex6.java</a>.</i><br>

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

**7. Crie um programa similar ao exercício 6, mas com o diferencial de que o usuário deve informar se quer continuar a usar o programa informando S-Sim ou N-Não.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex7.java">Lesson2_ex7.java</a>.</i><br>

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

**8. Crie um programa que receba 5 mil dados do usuário do tipo inteiro. Sabe-se que valores negativos não são aceitos. Após receber esses valores e popular o array, imprima na saída padrão a média dos valores, quantos valores são ímpares e todos os valores que foram informados..** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%202/Lesson2_ex8.java">Lesson2_ex8.java</a>.</i><br>

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
