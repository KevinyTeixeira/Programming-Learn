<a href="https://github.com/KevinyTeixeira/Programming-learn/blob/1_JavaLearning/Atividades/Question%C3%A1rio%201%20-%20Bytecode%2C%20OOP%2C%20Variable%2C%20if%2C%20for%2C%20Block%2C%20TryTable.md">Português</a><br>

### CAPÍTULO 1: Respostas dos Exercícios
> Estas respostas são com base na lista de exercícios proposta pelo livro "Java para Iniciantes 5º Edição", de Herbert Schildt. <br>

**1. O que é bytecode e por que ele é importante para o uso de Java em programação na internet?** <br>
<p align="justify">Bytecode é o código .java compilado em .class. Quando o código java torna-se um bytecode, possui atributos de portabilidade e segurança, já que para ser executado utiliza-se a JVM (Java Virtual Machine).</p>

**2. Quais são os três princípios básicos da programação orientada a objetos?** <br>
A (OOP, object-oriented programming)  tem como princípios básicos as características de:
- Encapsulamento: mecanismo de programação que vincula o código e os dados que ele trata;
- Polimorfismo: qualidade que permite que uma interface acesse uma classe geral de ações; Ou seja, um mesmo algoritmo para diferentes tipos de dados;
- Herança: processo pelo qual um objeto pode adquirir as propriedades de outro objeto.

**3. Onde os programas Java começam a ser executados?** <br>
<p align="justify">Começam a ser executados em main ( ).</p>

**4. O que é uma variável?** <br>
Uma variável é um local nomeado na memória ao qual pode ser atribuído um valor.</p>

**5. Quais dos nomes da e variável a seguir são inválidos?**
- [ ]	count
- [ ]	$count
- [ ]	count27
- [x]	67count – nomes de variáveis não podem começar com dígitos.

**6. Como se cria um comentário de linha única? E um comentário de várias linhas?** <br>
<p align="justify">Basta inserir duas barras invertidas (//) no início da linha. Já para várias linhas deve ser inserido /* como abertura e */ como fechamento. Segue alguns exemplos.</p>

```Java
// este é um comentário de linha única.
/*Este é um comentário de
Várias linhas. */
```

**7. Mostre a forma geral da instrução if. Mostre também a do laço for.** <br>

```java
// Exemplifica a instrução if, IfExample.java.

class ifExample {
	public static void main (String args[]) {
	   int a, b, c;
	   
	   a = 1;
	   b = 2;
	   c = 3;
		
   //This instruction will be ignored!!
   if ( a==b );System.out.println("a variable equal to b.");

   if ( a!=b );System.out.println("a variable is different from b.");

   System.out.println("");
	}
}
```

```java
//Exemplifica a instrução for, ForDemo.java.

public class ForDemo {
	public static void main (String args[]) {
		int count, number, result;
		
		number = 7;
		
		for(count = 1; count < 11; count++) {
			result = count * number;
			System.out.println(count + " * " + number + " = " + result + ";");
			//number++;
		}
	}
}
```

**8. Como se cria um bloco de código?** <br>
<p align="justify">Um bloco de código é criado a partir das chaves de abertura “{“ e de fechamento “}”. É utilizada para compor um conjunto de instruções. Segue abaixo um exemplo de código em bloco.</p>

```java
/* Usando o exemplo da instrução if acima, acrescentamos o uso de bloco, BlockExample.java. */

class BlockExample {
	public static void main (String args[]) {
		int a, b, c;
		
		a = 1;
		b = 2;
		c = 3;
		
		//This instruction will be ignored!!
		if (a == b) System.out.println("a variable equal to b.");
		
		if (a != b) {
			System.out.println("a variable is differente from b.");
			System.out.println("");
			c = a - b;
			System.out.println("Now, c variable valor is a - b.");
			System.out.println("");
			System.out.println("C valor is: " + c);
		}
	}
```

**9. A gravidade da Lua é cerca de 17% a da Terra. Crie um programa que calcule seu peso na Lua?** <br>

```java
// Calcula seu peso na lua WeightOnMoon.java.

class WeightOnMoon {
	public static void main (String args[]) {
		double earth_weight, // Peso na Terra
double moon_weight; // Peso na Lua
		
		earth_weight = 65.50; //My weight;

		moon_weight = earth_weight * 0.17;
		
		System.out.println("Your weight on moon is: " + moon_weight);
		
	}
```

**10. Adapte o código da seção “Tente isso 1-2” para que ele exiba uma tabela de conversões de polegadas para metros. Exiba 12 pés de conversões, polegada a polegada. Gere uma linha me branco a cada 12 polegadas. (Um metro é igual a aproximadamente 39,37 polegadas.)** <br>

```java
//This code convert inches to meters, InchToMeter.java.

public class InchToMeter {
	public static void main (String args[]) {
		double	meters, inches;
		int counter;

		counter = 0;
		
		for (inches = 1; inches <= 144; inches++ ) {
			meters = inches / 39.37;
			System.out.println(inches + " inches is " + meters + " meters.");
			counter++;
			
		//a cada 12 linhas, exibe uma linha em branco.
		if (counter == 12) {
			System.out.println();
			counter = 0; //zera o contador de linhas.
			}
		}
	}
}
```

**11. Se você cometer um engano na digitação ao inserir seu programa, isso resultará que tipo de erro?** <br>
<p align="justify">Ocorrerá um erro de sintaxe.</p>

**12. É importante o local onde inserimos uma instrução em uma linha?** <br>
<p align="justify">Não, já que Java não trata o final da linha como terminador.</p>
