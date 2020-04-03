<p align="justify">See in <a href="https://github.com/KevinyTeixeira/Programming-Learn/edit/JAVA-Branch/JAVA/Exercises/Ex.%20Lesson%202.md">Português</a><br>

> The activities section of each lesson available in the UCB material aims to consolidate the student's learning regarding the studied and discussed contents. Therefore, the activities developed by UCB will be kept in this file together with my respective answers.<br>

### LESSON 1: Java Presentation
**1. Java has an important feature, which is to be platform independent. Explain, in your own words, what this feature is and how Java provides it.** <br>
<p align="justify">It is a characteristic that aims to create an intermediate environment between the Operating System and the Application, this environment called the Java Virtual Machine (JVM). In this way, all java code is processed in the JVM, making Java applications multiplatform.</p>

**2. Using a basic text editor, such as notepad, create a .java file called ExercicioDois.java, which should solve the following problem: read a temperature in degrees Celsius and have it converted to degrees Fahrenheit. The conversion formula is: FAR = (9 * CEL + 160) / 5, with FAR being the temperature in Fahrenheit and CEL in Celsius.** 

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%201/Lesson1_ex2.java">Lesson1_ex2.java</a>.</i><br>

```java
import java.util.Scanner; // Required to read a user data insertion\Necessário para ler um dado inserido pelo usuário;

public class lesson1_ex2{

  public static void main (String args[]){

  // Statements/Declarações
  double CEL, FAR;
	
  System.out.printf("*INICIANDO PROGRAMA EM JAVA;");
	
  // Collecting entrys/Coletando entradas
  System.out.println("\n Informe um grau em escala Celsius: ");
  CEL = new Scanner(System.in).nextDouble( );
	
  // Converting Celsius to Fahrenheit/Convertendo Celsius para Fahrenheit
  System.out.printf("FAR = (9 * %.2f + 160)/5;", CEL);
  FAR = (9 * CEL + 160) / 5;
  
  // Printing results and ending the program/Imprimindo resultados e finalizando o programa
  System.out.printf("\nFAR = %.2f;", FAR);
  }
}
```

**3. Using a basic text editor, such as notepad, create a .java file called ExercicioTres.java, which should solve the following problem: receive two notes from the user and perform the arithmetic mean of these values. As an output, present the informed grades, the average and whether the student achieved approval or not.** <br>

<i>The source code for this answer is stored on github under the name <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/Lesson%201/Lesson1_ex3.java">Lesson1_ex3.java</a>.</i><br>

```java
import java.util.Scanner; // Required to read a user data insertion\Necessário para ler um dado inserido pelo usuário;

public class lesson1_ex3{

  public static void main (String args[]){
  
  // Statements/Declarações
  double nota_1, nota_2, media;
  String resultado;

  System.out.printf("*INICIANDO PROGRAMA EM JAVA;");

  // Collecting entrys/Coletando entradas
  System.out.printf("\nInforme a primeira nota do aluno: ");
  nota_1 = new Scanner(System.in).nextDouble( );
  System.out.printf("Informe a segunda nota do aluno: ");
  nota_2 = new Scanner(System.in).nextDouble( );

  // Calculating Arithmetic Mean and Generating result/Calculando Média Aritmética e Gerando Resultado
  System.out.printf("MÉDIA = (%.2f + %.2f)/2;", nota_1, nota_2);
  media = (nota_1 + nota_2) / 2;
  if (media >= 5) {
    resultado = "O aluno foi aprovado!"; // The student passed/O estudante foi aprovado
  } else {
    resultado = "O aluno foi reprovado!"; // The student failed/O estudante foi reprovado
  }
  
  // Printing results and ending the program/Imprimindo resultados e finalizando o programa
  System.out.printf("\nA primeira nota do aluno foi: %.2f;", nota_1);
  System.out.printf("\nA segunda nota do aluno foi: %.2f;", nota_2);
  System.out.printf("\nA média resultante É: %.2f;", media);
  System.out.printf("\n");
  System.out.print(resultado);
    }
  }
```
