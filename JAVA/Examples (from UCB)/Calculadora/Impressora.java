import javax.swing.JOptionPane;

public class Impressora {

	public static void print(double valorUm, char operador, double valorDois, double resultado ) {
		System.out.println("[" + valorUm + "]" + operador + " [" + valorDois + "] = " + resultado + ";");
	}
	public static void printPane (double valorUm, char operador, double valorDois, double resultado) {
		JOptionPane.showMessageDialog(null, "[" + valorUm + "]" + operador + " [" + valorDois + "] = " + resultado + ";");
	}
	
}