/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author 05725843181
 * Demonstra a instrução if.
 * Arquivo IfDemo.java.
 */
class IfDemo {
    public static void main(String args []) {
        int a, b, c;
        
        a = 2;
        b = 3;
        
        if (a < b) System.out.println("a is less than b");
        
        //Esta instrução não exibirá nada;
        if (a == b) System.out.println("you won't see this");
        
        System.out.println();
        
        c = a - b; // c contém - 1
        
        System.out.println("c contains " + c);
        if(c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");
        
        System.out.println();
        
        c = b - a; // agora c contém 1;
        
        System.out.println("c contains " + c);
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");
    }
}
