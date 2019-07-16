/**
 * @author 05725843181, 
 * @ReferenceBook Java para Iniciantes 5� Edi��o; Herbert Schildt;
*/
/* 
 * Este programa exibe uma tabela de convers�es de gal�es em litros, Arquivo GalToLitTable.java.
*/

//1. Use for ou if, ou blocos de c�digo, deve exibir uma tablea de convers�es
//com 1 gal�o e terminando com 100 gal�es. A cada 10 gal�es, um linha branca � exibida. Use counter para contador.
class GalToLitTable {
	public static void main(String args[]) {
		double liters, gallons;
		int counter;

		counter = 0;
			
		for ( gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // converte para litros;
			System.out.println(gallons + " gallons is " + liters + " liters.");
			counter++;
			// a cada d�cima linha, exibe uma linha em branco	
			if (counter == 10) {
				System.out.println("");
				counter = 0; // zera o contador de linhas
			}
		}
	}
}

/*
 * The output of this code will be:
 * 1.0 gallons is 3.7854 liters.
 * 2.0 gallons is 7.5708 liters.
 * 3.0 gallons is 11.356200000000001 liters.
 * 4.0 gallons is 15.1416 liters.
 * 5.0 gallons is 18.927 liters.
 * 6.0 gallons is 22.712400000000002 liters.
 * 7.0 gallons is 26.4978 liters.
 * 8.0 gallons is 30.2832 liters.
 * 9.0 gallons is 34.0686 liters.
 *10.0 gallons is 37.854 liters.
 * {...}
*/