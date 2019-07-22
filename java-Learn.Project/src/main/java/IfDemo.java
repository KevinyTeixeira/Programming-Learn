/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Demonstra a instru��o If, Arquivo IfDemo.java.
*/
class IfDemo {
    public static void main(String args []) {
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if (a < b) System.out.println("a is less than b");
        
        //Esta instru��o n�o exibir� nada;
        if (a == b) System.out.println("you won't see this");
        
        System.out.println();
        
        c = a - b; // c cont�m - 1
        
        System.out.println("c contains " + c);
        if(c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");
        
        System.out.println();
        
        c = b - a; // agora c cont�m 1;
        
        System.out.println("c contains " + c);
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");
    }
}