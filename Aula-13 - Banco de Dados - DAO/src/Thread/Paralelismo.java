package Thread;

public class Paralelismo extends Thread {
	public void run(){
		System.out.println("Início: " + getName());
		for(int i = 0; i < 10; i++){
			System.out.println(i + "-" + getName());
		}
		System.out.println("Fim: " + getName());
	}
}

