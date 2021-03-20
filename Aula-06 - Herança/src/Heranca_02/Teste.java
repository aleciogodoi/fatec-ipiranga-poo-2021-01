package Heranca_02;

public class Teste {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[5];
		veiculos[0] = new Veiculo("XPT-0908", 2009);
		veiculos[1] = new Onibus("ONB-3032", 2010, 50);
		veiculos[2] = new Caminhao("CMO-6578", 2018, 4);
		veiculos[3] = new Onibus("XXX-7777", 2012, 60);
		veiculos[4] = new Caminhao("CCC-3331", 2020, 5);
		
		for(Veiculo veic: veiculos) {
			veic.exibirDados();
		}
	}
}
