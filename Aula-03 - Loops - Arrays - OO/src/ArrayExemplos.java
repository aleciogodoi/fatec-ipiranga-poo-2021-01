import java.util.List;
import java.util.Random;
public class ArrayExemplos {

	public static void main(String[] args) {
		
		Random randomico = new Random();
		// Array de inteiros já declarando valores
		int[] inteiros = {1, 10, -20, 9, 30, 50};
		System.out.println("Array inteirios");
		for(int i=0; i < inteiros.length; i++) {
			System.out.println(inteiros[i]);
		}
		
		// Array de floats com tamanho definido
		float[] numeros = new float[10];

		System.out.println("\nArray float");
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = randomico.nextFloat()*10;
			System.out.println(numeros[i]);
		}
	}

}
