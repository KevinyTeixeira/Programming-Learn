<p align="justify">Veja em <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/Ex.%20Lesson%201.md">English</a>.

> A seção de atividades de cada lição disponível no material da UCB objetivam consolidar a aprendizagem do aluno quanto aos conteúdos estudados e dicutidos. Sendo assim, as atividades elaboradas pela UCB serão guardadas neste arquivo juntamente com minhas respectivas respostas.<br>

### LIÇÃO 1: Apresentação do Java
**1. O Java possui uma importante característica, que é ser independente de plataforma. Explique, com suas palavras, o que é essa característica e como o Java a fornece.** <br>
<p align="justify">É uma característica que visa criar um ambiente intermediário entre o Sistema Operacional e a Aplicação, ambiente este chamado de Máquina Virtual Java (JVM). Desta forma, todo o código java é processado na JVM, tornando as aplicações Java multiplataforma.</p>

**2. Fazendo uso de um editor de texto básico, como o bloco de notas, crie um arquivo .java chamado ExercicioDois.java, que deverá resolver o seguinte problema: ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius.** 

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/lesson1_ex2.java">lesson1_ex2.java</a>.</i><br>

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

**3. Fazendo uso de um editor de texto básico, como o bloco de notas, crie um arquivo .java chamado ExercicioTres.java, que deverá resolver o seguinte problema: receber do usuário duas notas e realizar a média aritmética desses valores. Como saída, apresentar as notas informadas, a média e se o estudante alcançou aprovação ou não.** <br>

<i>O código fonte desta resposta está guardado no github sob o nome <a href="https://github.com/KevinyTeixeira/Programming-Learn/blob/JAVA-Branch/JAVA/Exercises/.java%20Source/lesson1_ex3.java">lesson1_ex3.java</a>.</i><br>

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
