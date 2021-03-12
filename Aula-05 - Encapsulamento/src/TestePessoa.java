
public class TestePessoa {

	public static void main(String[] args) {
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
		
		outrasClasses.Hello hello = new outrasClasses.Hello();
		hello.main(args);
		//hello.boaNoite();
		//hello.bomDia();
	}

}
