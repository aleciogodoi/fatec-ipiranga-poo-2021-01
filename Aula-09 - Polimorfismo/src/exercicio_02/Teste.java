package exercicio_02;

public class Teste {

	public static void main(String[] args) {
			
		Retangulo r1 = new Retangulo("branco", 5, 7);
		System.out.println(r1);
		r1.draw();
		
		Quadrado q1 = new Quadrado("azul", 7);
		System.out.println(q1);
		q1.draw();
		
		Triangulo t1 = new Triangulo("vermelho", 10, 5);
		System.out.println(t1);
		t1.draw();
		
		Circulo c1 = new Circulo("verde", 5);
		System.out.println(c1);
		c1.draw();
	}

}
