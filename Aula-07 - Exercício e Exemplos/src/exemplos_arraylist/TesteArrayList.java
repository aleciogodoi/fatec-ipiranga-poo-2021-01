package exemplos_arraylist;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();

		// Adicionando Itens
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		carros.add("VW");
		carros.add("Fiat");
		carros.add("GM");
		carros.add("Ferrari");
		System.out.println(carros);
		
		for (int i=0; i < carros.size(); i++)
			System.out.println("leitura 'for': "+carros.get(i));
		
		System.out.println("\n");
		for (String c: carros)
			System.out.println("leitura 'foreach': "+c);

		// Acessando um item
		System.out.println("\n\n"+carros.get(0));

		// Alterando um item
		carros.set(0, "Citroen");
		System.out.println(carros);

		// Removendo um item
		System.out.println(carros.remove(0));
		System.out.println(carros);
		
		// Removendo todos os itens
		carros.clear();
		System.out.println(carros);
	}

}
