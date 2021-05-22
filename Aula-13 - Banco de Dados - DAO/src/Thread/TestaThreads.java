package Thread;

public class TestaThreads {
	public static void main(String[] args) {
		System.out.println("Início: main");
		Paralelismo p1 = new Paralelismo(),
		            p2 = new Paralelismo(),
		            p3 = new Paralelismo();
		p1.start(); p2.start(); p3.start();
		System.out.println("Fim: main");
	}
}
