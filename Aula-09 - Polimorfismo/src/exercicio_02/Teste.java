package exercicio_02;

public class Teste {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo("branca", 5, 7);
		System.out.println(r1);
		r1.draw();
		
		Quadrado q1 = new Quadrado("azul", 7);
		System.out.println(q1);
		q1.draw();
	}

}
