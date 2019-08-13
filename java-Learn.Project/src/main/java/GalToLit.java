/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5º Edição; Herbert Schildt;
*/
/* 
 * Este programa converte galões em litros, Arquivo GalToLit.java.
*/ 
class GalToLit {
    public static void main(String args[]) {
        int gallons; // contém o número de galões;
        double liters; // contém o número de litros;
        
        gallons = 57; // começa com 57 galões;

        liters = gallons * 3.7854; // converte para litros;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
    
/*
 * The output of this code will be:
 * 57 gallons is 215.7678 liters;
 */