package exercicio_despesa;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		DespesaPessoal dp = new DespesaPessoal("1234201-21");
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 1, 1),"Farmacia", 105.71));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 1, 1),"Mercado", 203.37));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 1, 2),"Médico", 155.50));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 1, 2),"Padaria", 30.98));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 2, 1),"Feira", 105.71));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 2, 1),"Combustível", 102.37));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 2, 2),"Açougue", 121.50));
		dp.getDespesas().add(new Despesa(LocalDate.of(2020, 2, 2),"Farmacia", 7.54));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 1, 1),"Farmacia", 5.71));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 1, 1),"Mercado", 23.37));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 1, 2),"Médico", 205.50));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 1, 2),"Padaria", 23.98));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 2, 1),"Feira", 105.71));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 2, 1),"Combustível", 102.37));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 2, 2),"Açougue", 121.50));
		dp.getDespesas().add(new Despesa(LocalDate.of(2021, 2, 2),"Farmacia", 7.54));
		/*
		System.out.println(dp);
		System.out.printf("Total de Despesas          : %.2f ", dp.getTotal());
		System.out.printf("\nTotal de Despesas 2020   : %.2f ", dp.getTotal(2020));
		System.out.printf("\nTotal de Despesas 2021   : %.2f ", dp.getTotal(2021));
		System.out.printf("\nTotal de Despesas 01/2020: %.2f ", dp.getTotal(1, 2020));
		System.out.printf("\nTotal de Despesas 01/2021: %.2f ", dp.getTotal(1, 2021));
		System.out.printf("\nTotal de Despesas 02/01/2020: %.2f ", dp.getTotal(LocalDate.of(2020, 1, 2)));
		System.out.printf("\nTotal de Despesas 02/01/2021: %.2f ", dp.getTotal(LocalDate.of(2021, 1, 2)));
		*/
		dp.imprime();
		dp.imprime(1, 2020);
		dp.imprime(2, 2021);
		dp.imprime(LocalDate.of(2021, 1, 2));
		
	}

}
