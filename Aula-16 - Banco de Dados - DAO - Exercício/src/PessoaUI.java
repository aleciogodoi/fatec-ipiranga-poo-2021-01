import java.sql.Date;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class PessoaUI {
	public static Pessoa input(Pessoa pessoa) {
		pessoa.setCpf(inputCpf(pessoa.getCpf()));
		pessoa.setDataNascimento(inputDataNascimento(pessoa.getDataNascimento()));
		pessoa.setNome(inputNome(pessoa.getNome()));
		pessoa.setEmail(inputEmail(pessoa.getEmail()));
		pessoa.setPeso(inputPeso(pessoa.getPeso()));
		return pessoa;
	}

	public static int inputIdPessoa(int idPessoa) {
		idPessoa = Integer.valueOf(JOptionPane.showInputDialog("Id Pessoa",idPessoa));
		return idPessoa;
	}
	
	public static String inputCpf(String cpf) {
		cpf = JOptionPane.showInputDialog("CPF",cpf);
		return cpf;
	}
	
	public static Date inputDataNascimento(Date dataNascimento) {
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		if (dataNascimento!=null) {
			dia = dataNascimento.toLocalDate().getDayOfMonth();
			mes = dataNascimento.toLocalDate().getMonthValue();
			ano = dataNascimento.toLocalDate().getYear();
		}
		
		dia = Integer.valueOf(JOptionPane.showInputDialog("Dia", dia));
		mes = Integer.valueOf(JOptionPane.showInputDialog("Mês", mes));
		ano = Integer.valueOf(JOptionPane.showInputDialog("Ano", ano));
		
		dataNascimento = Date.valueOf(LocalDate.of(ano, mes, dia));
		return dataNascimento;
	}
	
	public static String inputNome(String nome) {
		nome = JOptionPane.showInputDialog("Nome",nome);
		return nome;
	}
	
	public static String inputEmail(String email) {
		email = JOptionPane.showInputDialog("Email",email);
		return email;
	}
	
	public static float inputPeso(float peso) {
		peso = Float.valueOf(JOptionPane.showInputDialog("Peso",peso));
		return peso;
	}
}
