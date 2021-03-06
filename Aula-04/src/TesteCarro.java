public class TesteCarro {
	public static void main(String[] args) {
		Carro car1 = new Carro("Fiat", "Argo", "Vermelha");
		Carro car2 = new Carro("VW", "Polo", "Prata");

		System.out.println(car1);
		System.out.println(car2);
		
		Carro[] carros = new Carro[3];
		carros[0] = new Carro("Honda","Civic", "Branca");
		carros[1] = new Carro("Ferrari","F40", "Amarela");
		carros[2] = new Carro("BMW","Z50", "Azul");
		
		for (Carro carro : carros) {
			System.out.println(carro);
		}

	}
}
