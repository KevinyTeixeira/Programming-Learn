/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author 05725843181
 * Try this 1-1
 * Este programa converte galões em litros.
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