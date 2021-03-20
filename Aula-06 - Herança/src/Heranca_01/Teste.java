package Heranca_01;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Alex", "123456098-09", 4231.22);
		Gerente g1 = new Gerente("Ana Maria", "9812154-25", 10210.47, 1234);

		System.out.println(f1);
		System.out.println(g1);

		System.out.println(g1.autentica(4321));
		System.out.println(g1.autentica(123));
		System.out.println(g1.autentica(1234));
		
	}

}
