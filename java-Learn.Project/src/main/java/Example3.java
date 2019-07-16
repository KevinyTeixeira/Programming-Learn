/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Esse programa ilustra a diferença entre int e double, Arquivo Example3.java.
*/ 

class Example3 {
    public static void main (String args[]) {
        int var; // essa instrução declara uma variável int;
        double x; // essa instrução declara uma variável de ponto flutuante;
        
        var = 10; // atribui a var o valor 10;
        
        x = 10.0; // atribui a x o valor 10,0;
        
        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // Exibe uma linha em branco;
        
        //agora, divide as duas por 4;
        var = var / 4;
        x = x / 4;
        
        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);
    }
}

/*
 * The output of this code will be:
 * Original value of var: 10;
 * Original value of x: 10.0;
 * var after division: 2; - componente fracionário perdido;
 * x after division: 2.5; - componente fracionário preservado;
 */