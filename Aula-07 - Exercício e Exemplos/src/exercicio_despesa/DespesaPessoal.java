package exercicio_despesa;

import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	private String cpf;
	private ArrayList<Despesa> despesas;
	
	public DespesaPessoal() {
	}

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
	
	public double getTotal(int ano) {
		double total=0;
		for (Despesa desp: despesas) {
			if (desp.getData().getYear() == ano)
				total += desp.getValor();
		}
		return total;
	}

	public void imprime() {
		String linha = "--------------------------------------------------------------";
		int tamanhoLinha = linha.length();
		System.out.println("\n"+linha);
		System.out.println("CPF: "+this.cpf);
		System.out.println(linha);
		for (Despesa desp: despesas) {
			System.out.printf(desp.getData()+"\t");
			System.out.printf(desp.getDescDespesa());
			System.out.printf("\t\t\t\t%.2f\n",desp.getValor());
		}
		System.out.println(linha);
		System.out.printf("Total\t\t\t\t\t\t\t%.2f\n",getTotal());
		System.out.println(linha);	
	}
	
	public void imprime(int mes, int ano) {
		String linha = "--------------------------------------------------------------";
		int tamanhoLinha = linha.length();
		System.out.println("\n"+linha);
		System.out.println("CPF: "+this.cpf);
		System.out.println(linha);
		for (Despesa desp: despesas) {
			if (desp.getData().getYear() == ano  && desp.getData().getMonthValue() == mes) {
				System.out.printf(desp.getData()+"\t");
				System.out.printf(desp.getDescDespesa());
				System.out.printf("\t\t\t\t%.2f\n",desp.getValor());
			}
		}
		System.out.println(linha);
		System.out.printf("Total\t\t\t\t\t\t\t%.2f\n",getTotal(mes, ano));
		System.out.println(linha);	
	}
	
	public void imprime(LocalDate data) {
		String linha = "--------------------------------------------------------------";
		int tamanhoLinha = linha.length();
		System.out.println("\n"+linha);
		System.out.println("CPF: "+this.cpf);
		System.out.println(linha);
		for (Despesa desp: despesas) {
			if (desp.getData().equals(data)) {
				System.out.printf(desp.getData()+"\t");
				System.out.printf(desp.getDescDespesa());
				System.out.printf("\t\t\t\t%.2f\n",desp.getValor());
			}
		}
		System.out.println(linha);
		System.out.printf("Total\t\t\t\t\t\t\t%.2f\n",getTotal(data));
		System.out.println(linha);	
	}
	
}
