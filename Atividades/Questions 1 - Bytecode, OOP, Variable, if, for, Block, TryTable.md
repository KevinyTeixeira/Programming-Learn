<a href="https://github.com/KevinyTeixeira/Programming-learn/blob/1_JavaLearning/Atividades/Question%C3%A1rio%201%20-%20Bytecode%2C%20OOP%2C%20Variable%2C%20if%2C%20for%2C%20Block%2C%20TryTable.md">Português</a><br>

### CHAPTER 1: Exercises Answers
> These answers are based on the list of exercises proposed by Herbert Schildt, in his book "Java para Iniciantes 5º Edição". <br>

**1. What is bytecode and why is it important for using Java in internet programming?** <br>
<p align="justify">Bytecode is the .java code compiled in .class. When the java code becomes a bytecode, it has attributes of portability and security, since to be executed it uses the JVM (Java Virtual Machine).</p>

**2. What are the three basic principles of object-oriented programming?** <br>
The object-oriented programming (OOP) principles are:
- Encapsulation: programming engine that links the code and the data it treats.;
- Polymorphism: quality that allows an interface to access a general class of actions; That is, the same algorithm for different data types;
- Heritage: process by which an object can acquire the properties of another object..

**3. Where Java programs begin to run?** <br>
<p align="justify">They start in main ( ) command.</p>

**4. What is a variable?** <br>
A variable is a named location in memory to which a value can be assigned.</p>

**5. Which of the following variable names are invalid?**
- [ ]	count
- [ ]	$count
- [ ]	count27
- [x]	67count – variable names can not begin with numbers.

**6. How do I create a single line comment? And a multi-line comment?** <br>
<p align="justify">Just insert two backslashes (//) at the beginning of the line. For multiple lines should be inserted / * as opening and */ as closing. Here are some examples.</p>

```java
// this is a single line comment.
/*This is a comment from
multiple lines. */
```

**7. Show the general form of the if statement. Also show the for too.** <br>

```java
// Example of a if instruction, IfExample.java.

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
//Example of a for instruction, ForDemo.java.

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

**8. How to create a block?** <br>
<p align="justify">A block is created from the opening keys "{" and closing "}". It is used to compose a set of instructions. The following is an example of block.</p>

```java
/* Using the if instruction, BlockExample.java. */

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

**9. The Moon's gravity is about 17% that of Earth. Create a program that calculates your weight on the Moon.** <br>

```java
// Calculate your weight on the moon WeightOnMoon.java.

class WeightOnMoon {
	public static void main (String args[]) {
		double earth_weight,
		double moon_weight;
		
		earth_weight = 65.50; //My weight;

		moon_weight = earth_weight * 0.17;
		
		System.out.println("Your weight on moon is: " + moon_weight);
		
	}
```

**10. Adapt the code from the "Try this 1-2" section so that it displays a conversion table from inches to meters. Display 12 feet of conversions, inch by inch. Generate a white line every 12 inches. (One meter is equal to approximately 39.37 inches.)** <br>

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
			
		//every 12 lines, display a blank line.
		if (counter == 12) {
			System.out.println();
			counter = 0; //set counter to zero.
			}
		}
	}
}
```

**11. If you enter something by mistake in the program, will this result in what kind of error?** <br>
<p align="justify">Sintax error.</p>

**12. Is it important to consider the line we entered the instruction?** <br>
<p align="justify">No, since Java does not treat the end of the line as a terminator.</p>
