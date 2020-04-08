package ucb.lesson7.ex1.entity;

public abstract class Form {

	private static double base;
	private static double altura = 0;

	
	public Form (double base, double altura) {
		setAltura(altura);
		setBase(base);
		return;
	}
	
	public static double getBase() {
		return base;
	}

	public static void setBase(double base) {
		Form.base = base;
	}

	public static double getAltura() {
		return altura;
	}

	public static void setAltura(double altura) {
		Form.altura = altura;
	}

	public void getArea(double base, double altura) {
	}
	
	public void getHipotenusa(double base) {
	}
	
}
