package exemplo_classe_abstrata;

public class Teste {

	public static void main(String[] args) {
		RoboSimples r2d2 = new RoboSimples("r2d2", 0, 0, (short)90);
		System.out.println(r2d2);
		r2d2.move(20);
		System.out.println(r2d2);
		r2d2.mudaDirecao((short)180);
		r2d2.move(20);
		System.out.println(r2d2);
	}

}
