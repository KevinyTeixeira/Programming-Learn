/**
 * @author 05725843181, Keviny Teixeira Tryout;
 */
/*
 * This code convert hous to second in a table, Arquivo HoursToSecondsTable.java;
 */

class HoursToSecondsTable {
	public static void main (String args[]) {
		int hours, counter;
		double seconds;
		
		counter = 0; 
		for (hours = 1; hours <= 100; hours++) {
			seconds = hours * 3600; // Convert hours in seconds;
			System.out.println(hours + " hours is " + seconds + " seconds.");
			counter++;
			if (counter == 10) { // for every 10 counts, create a empty line;
				System.out.println("");
				counter = 0;
			}
		}	
	}
}

/*
 * 1 hours is 3600.0 seconds.
 * 2 hours is 7200.0 seconds.
 * 3 hours is 10800.0 seconds.
 * 4 hours is 14400.0 seconds.
 * 5 hours is 18000.0 seconds.
 * 6 hours is 21600.0 seconds.
 * 7 hours is 25200.0 seconds.
 * 8 hours is 28800.0 seconds.
 * 9 hours is 32400.0 seconds.
 * 10 hours is 36000.0 seconds.
 * {...}
*/