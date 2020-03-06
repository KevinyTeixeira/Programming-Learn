/******************************************************************************
Autor: Catholic University of Brasilia
*******************************************************************************/

import java.util.Scanner; // Remember #include? Make this association for now to be able to read/Lembra do #include ? Faça esta associação por enquanto para conseguir ler
  public class Leitura{
    public static void main (String args[]){
  //Start/Inicio 
    double salario;
    System.out.print("Informe um salário: ");
    salario = new Scanner(System.in).nextDouble( );// Big command, right? That's it to read a double/Comando grande, né? É só isso para ler um double
    int idade;
    System.out.print("Informe uma idade: ");
    idade = new Scanner(System.in).nextInt( );// Just that to read an int/Só isso para ler um int
    System.out.printf(" \n O salário informado foi : %f", salario);
    System.out.print(" \n A idade informada foi :"+idade); 
  //End/Fim 
  }
}