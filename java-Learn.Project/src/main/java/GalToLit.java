/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Este programa converte gal�es em litros, Arquivo GalToLit.java.
*/ 
class GalToLit {
    public static void main(String args[]) {
        int gallons; // cont�m o n�mero de gal�es;
        double liters; // cont�m o n�mero de litros;
        
        gallons = 57; // come�a com 57 gal�es;

        liters = gallons * 3.7854; // converte para litros;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
    
/*
 * The output of this code will be:
 * 57 gallons is 215.7678 liters;
 */