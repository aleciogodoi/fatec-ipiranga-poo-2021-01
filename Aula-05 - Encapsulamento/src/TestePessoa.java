
public class TestePessoa {

	public static void main(String[] args) {
		// Atrituto constante e estatico
		// Não preciso declarar uma classe (static)
		// E não posso alterar valor (final)
		System.out.println("TEMPERATURA_MAXIMA:"+Pessoa.TEMPERATURA_MAXIMA);
		System.out.println("Total de Pessoas:"+Pessoa.getTotalPessoas());
		
		
		Pessoa joao = new Pessoa("1235643","João da Silva", 73.2f, 1.74f);
		System.out.println(joao);
		joao.setAltura(1.72f);
		joao.setPeso(71.f);

		System.out.println(joao.getAltura());
		System.out.println(joao.getPeso());
		
		Pessoa maria = new Pessoa();
		maria.setNome("Maria");
		maria.setCpf("76776776-09");
		maria.setAltura(1.71f);
		maria.setPeso(63.21f);
		System.out.println(maria);
		
		Pessoa antonio = new Pessoa("6664442","Antonio da Silva", 70.2f, 1.75f);
		System.out.println(antonio);
		
		outrasClasses.Hello hello = new outrasClasses.Hello();
		hello.main(args);
		//hello.boaNoite();
		//hello.bomDia();
		System.out.println("Total de Pessoas:"+Pessoa.getTotalPessoas());
	}

}
