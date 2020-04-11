package ucb.lesson6.reader;

import java.util.Scanner;

@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse

	public class Leitor {

		public static String lerString(String mensagem) {
			System.out.println(mensagem);
			return lerString();
		}
		public static double lerDouble(String mensagem) {
			System.out.println(mensagem);
			return lerDouble();
		}
		public static int lerInt(String mensagem) {
			System.out.println(mensagem);
			return lerInt();
		}
		public static char lerCaracter(String mensagem) {
			System.out.println(mensagem);
			return lerCaracter();
		}
		public static String lerString() {
			return new Scanner(System.in).nextLine();
		}
		public static double lerDouble() {
			return new Scanner(System.in).nextDouble();
		}
		public static char lerCaracter() {
			return new Scanner(System.in).next().charAt(0);
		}
		public static int lerInt() {
			return new Scanner(System.in).nextInt();
		}
		
}
