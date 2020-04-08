package ucb.lesson7.ex1.entity;

public class RightTriangle extends Form {
	
	public RightTriangle(double base, double altura) {
		super (base, altura);
	}
		
	public void getHipotenusa(double base) {
		double resultado = Math.sqrt(Math.pow(base, 2) + Math.pow(base, 2));
		System.out.printf("A área da Hipotenusa é: %.2f\n", resultado);		
	}
	
	public void getArea(double base, double altura) {
		double resultado = (base * altura) / 2;
		System.out.printf("A área do Retângulo Triângulo é: %.2f\n", resultado);
	}
	
}
