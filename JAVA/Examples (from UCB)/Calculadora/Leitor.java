import java.util.Scanner;

@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	

public class Leitor {

	public static double lerDouble(String msg) { //METHOD
		System.out.println(msg);
		return lerDouble();
	}
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	public static char lerCaracter(String msg) {
		System.out.println(msg);
		return lerCaracter();
	}
	public static double lerDouble() { //METHOD
		return new Scanner(System.in).nextDouble();
	}
	public static char lerCaracter() {
		return new Scanner(System.in).next().charAt(0);
	}
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
}