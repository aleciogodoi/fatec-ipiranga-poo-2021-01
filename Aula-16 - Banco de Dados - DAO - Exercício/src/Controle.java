import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controle {
	static String[] principal = 
		 {"0 - Sair",
		  "1 - Tipo Despesa",
		  "2 - Pessoa",
		  "3 - Despesa"};
	static String[] itens = 
		 {"0 - Voltar",
		  "1 - Incluir",
		  "2 - Alterar",
		  "3 - Excluir",
		  "4 - Buscar",
		  "5 - Listar"};

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Menu menuPrincipal = new Menu(principal);
		int opcao = 0;
		do {
			opcao = menuPrincipal.input();
			switch(opcao) {
			case 1:
				menuTipoDespesa();
				break;
			case 2:
				menuPessoa();
				break;
			case 3:
				menuDespesa();
				break;
			}
		} while(opcao!=0);
	}
	
	public static void menuTipoDespesa() {
		Menu menuItens = new Menu(itens);
		int opcao = 0;
		do {
			TipoDespesa tipoDespesa = new TipoDespesa();
			opcao = menuItens.input();
			switch(opcao) {
			case 1:
				tipoDespesa = TipoDespesaUI.input(tipoDespesa);
				TipoDespesaDAO.insert(tipoDespesa);
				break;
			case 2:
				tipoDespesa.setIdTipo(TipoDespesaUI.inputIdTipo(0));
				tipoDespesa = TipoDespesaDAO.find(tipoDespesa.getIdTipo());
				tipoDespesa = TipoDespesaUI.input(tipoDespesa);
				TipoDespesaDAO.update(tipoDespesa);
				break;
			case 3:
				TipoDespesaDAO.delete(TipoDespesaUI.inputIdTipo(0));
				break;
			case 4:
				tipoDespesa = TipoDespesaDAO.find(TipoDespesaUI.inputIdTipo(0));
				JOptionPane.showMessageDialog(null, tipoDespesa);
				break;
			case 5:
				ArrayList<Object> objetos = new ArrayList<Object>();
				for (TipoDespesa tp: TipoDespesaDAO.getAll())
					objetos.add(tp);
				mostraDados(objetos);
				break;
			}
		} while(opcao!=0);
	}
	
	public static void menuPessoa() {
		Menu menuItens = new Menu(itens);
		int opcao = 0;
		do {
			opcao = menuItens.input();
			Pessoa pessoa = new Pessoa();
			switch(opcao) {
			case 1:
				pessoa = PessoaUI.input(pessoa);
				PessoaDAO.insert(pessoa);
				break;
			case 2:
				pessoa.setIdPessoa(PessoaUI.inputIdPessoa(0));
				pessoa = PessoaDAO.find(pessoa.getIdPessoa());
				pessoa = PessoaUI.input(pessoa);
				PessoaDAO.update(pessoa);
				break;
			case 3:
				PessoaDAO.delete(PessoaUI.inputIdPessoa(0));
				break;
			case 4:
				pessoa = PessoaDAO.find(PessoaUI.inputIdPessoa(0));
				JOptionPane.showMessageDialog(null, pessoa);
				break;
			case 5:
				ArrayList<Object> objetos = new ArrayList<Object>();
				for (Pessoa p: PessoaDAO.getAll())
					objetos.add(p);
				mostraDados(objetos);
				break;
			}
		} while(opcao!=0);
	}
	
	public static void menuDespesa() {
		Menu menuItens = new Menu(itens);
		int opcao = 0;
		do {
			opcao = menuItens.input();
			switch(opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		} while(opcao!=0);
	}

	public static void mostraDados(ArrayList<Object> objetos) {
		String dados = "";
		for(Object objeto : objetos) 
			dados += objeto + "\n";
		JOptionPane.showMessageDialog(null, dados);		
	}
}
