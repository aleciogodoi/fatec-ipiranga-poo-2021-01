package exemplos_static;

public class Teste {

	public static void main(String[] args) {
		System.out.println(FuncoesMatematicas.exponencial(5, 2));
		System.out.println(FuncoesMatematicas.fatorial(5)+"\n");
		
		for (int n=1; n < 11; n++)
			System.out.print(FuncoesMatematicas.fibo(n)+" ");
		
		System.out.println("\nTotal de Pessoas "+ Pessoa.getTotalPessoas());
		Pessoa maria = new Pessoa(1, "Maria Aparecida");
		Pessoa joao = new Pessoa(2, "João dos Santos");
		Pessoa ana = new Pessoa(3, "Ana Clara");
		Pessoa beatriz = new Pessoa(4, "Beatriz Silva");
		System.out.println("Total de Pessoas "+ Pessoa.getTotalPessoas());
	}

}
