package Excecao_04;


public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("Joaquim","123");
		System.out.println(c1.toString());
		
		ContaCorrente c2 = new ContaCorrente("Antonio","8780");
		System.out.println(c2.toString());

		c1.deposito(100);
		c1.tranferencia(100, c2);
		
		try {
			c1.deposito(-100);
		} catch(ContaException  e) {
			e.printStackTrace();
			System.out.println("Deu ruim!!!");
		}
		try {
			c1.tranferencia(100, c2);
		}  catch(ContaException  e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Deu ruim novamente!!!");
		}
		
	}
}
