import java.util.Random;

public class Palavras {

	public static void main(String[] args) {
		Random r = new Random();
		String[] listaPalavras = { "abacate", "pepino", "futebol", 
								   "carro", "fiat", "vw", "bmw", "pedra", 
								   "tatu", "cão", "gato", "Brasil", "Argentina"};
		int tamanho = r.nextInt(listaPalavras.length)+1;
		String[] palavras = new String[tamanho];
		for (int i= 0; i < tamanho; i++) {
			palavras[i] = listaPalavras[r.nextInt(listaPalavras.length)];
			System.out.println(palavras[i]);
		}

	}

}
