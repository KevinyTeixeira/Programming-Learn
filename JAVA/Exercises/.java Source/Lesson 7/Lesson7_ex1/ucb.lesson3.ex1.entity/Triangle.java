package ucb.lesson7.ex1.entity;

public class Triangle extends Form {

	public Triangle(double base, double altura) {
		super(base, altura);
	}
	
	public void getArea(double base, double altura) {
		double resultado = (base * altura);
		System.out.printf("A �rea do Tri�ngulo �: %.2f", resultado);
	}

}
