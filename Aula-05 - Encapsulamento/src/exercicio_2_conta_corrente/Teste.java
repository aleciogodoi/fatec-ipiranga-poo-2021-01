package exercicio_2_conta_corrente;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(
				"1234-X",
				"Central",1,
				"XPTO", 123,1);

		c1.creditar(1000);
		c1.debitar(350);
		c1.creditar(2000);
		System.out.println(c1);

	}

}
