import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TipoDespesaCRUD {

	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				TipoDespesaDAO.insert(entradaDados());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, TipoDespesaDAO.find(entradaId()));
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				imprimir(TipoDespesaDAO.getAll());
				break;
			}
		} while (opcao !=0);

	}
	
	public static int menu() {
		String menu = "0 - Sair\n"
				+ "1 - Incluir\n"
				+ "2 - Pesquisar\n"
				+ "3 - Alterar\n"
				+ "4 - Excluir\n"
				+ "5 - Lista";
		return Integer.valueOf(JOptionPane.showInputDialog(menu));
	}
	
	public static void imprimir (ArrayList<TipoDespesa> tipoDespesas) {
		String dados ="";
		for (TipoDespesa tipo: tipoDespesas) {
			dados += tipo+"\n";
		}
		JOptionPane.showMessageDialog(null, dados);
	}
	
	public static TipoDespesa entradaDados() {
		TipoDespesa tipoDespesa = new TipoDespesa();
		tipoDespesa.setDescrTipo(JOptionPane.showInputDialog("Tipo Despesa:"));
		return tipoDespesa;
	}
	
	public static int entradaId() {
		int id = Integer.valueOf(JOptionPane.showInputDialog("Id:"));
		return id;
	}

}
