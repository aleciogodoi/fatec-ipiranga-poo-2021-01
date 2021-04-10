package exercicio_despesa;

import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	private String cpf;
	private ArrayList<Despesa> despesas;
	
	public DespesaPessoal(String cpf) {
		this.cpf = cpf;
		despesas = new ArrayList<Despesa>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}

	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}
	
	public double getTotal() {
		double total=0;
		for (Despesa desp: despesas)
			total += desp.getValor();
		return total;
	}
	
	public double getTotal(int mes, int ano) {
		double total=0;
		for (Despesa desp: despesas) {
			if (desp.getData().getYear() == ano  && desp.getData().getMonthValue() == mes)
				total += desp.getValor();
		}
		return total;
	}
	
	public double getTotal(LocalDate data) {
		double total=0;
		for (Despesa desp: despesas) {
			if (desp.getData().equals(data))
				total += desp.getValor();
		}
		return total;
	}

	public void imprime() {
	}
	
	public void imprime(int mes, int ano) {
	}
	
	public void imprime(LocalDate data) {
	}
	
}
