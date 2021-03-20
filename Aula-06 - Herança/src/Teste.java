
public class Teste {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("Abc", "(11) 9123-9999");
		f1.imprimir();

		FornecedorPessoa fp1 = new FornecedorPessoa("João","(11) 9999-8889","12345676","09875745-2");
		fp1.imprimir();
		
		FornecedorEmpresa fe1 = new FornecedorEmpresa("XPTO","(11) 7777-8889","0012348765-5","09821243-26");
		fe1.imprimir();
		
	}

}
