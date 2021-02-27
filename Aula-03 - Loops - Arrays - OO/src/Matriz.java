import java.util.Random;
public class Matriz {
	public static void main(String[] args) {
		int[][] inteiros = {
								{1 ,  2, 4},
								{12,  7, 3},
								{20, -2, 8},
								{100, 18, -4},				
							};
		
		for(int linha=0; linha < inteiros.length; linha++) {
			for (int coluna=0; coluna < inteiros[linha].length; coluna++) {
				System.out.print(inteiros[linha][coluna]);
				if(coluna < inteiros[linha].length-1 ) {
					System.out.print(",\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz randomicos");
		Random randomico = new Random();
		float[][] numeros = new float[10][3];
		for(int linha=0; linha < numeros.length; linha++) {
			for (int coluna=0; coluna < numeros[linha].length; coluna++) {
				numeros[linha][coluna] = randomico.nextFloat()*100;
				System.out.print(numeros[linha][coluna]);
				if(coluna < numeros[linha].length-1 ) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}		
	}
}
