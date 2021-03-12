import javax.swing.JOptionPane;
public class TesteAnimal {
	public static void main(String[] args) {
		int opcao = 0;
		String menu = "0 - Sair\n"
					+ "1 - Comer\n"
					+ "2 - Domir\n"
					+ "3 - Correr\n"
					+ "4 - Morrer";
		
		Animal rex = new Animal();
		JOptionPane.showMessageDialog(null, rex);

		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			switch (opcao){
			case 1:
				rex.comer();
				break;
			case 2:
				rex.dormir();
				break;
			case 3:
				rex.correr();
				break;
			case 4:
				rex.morrer();
				break;	
			}
	
			System.out.println(rex);
		} while(opcao!=0);	
	}
}
