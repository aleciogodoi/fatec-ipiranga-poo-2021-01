package DAO;

import java.util.ArrayList;

public class TesteDAO {

	public static void main(String[] args) {
		DepartamentoDAO deptoDAO = new DepartamentoDAO();
		
		deptoDAO.delete(200);
		
		ArrayList<Departamento> departamentos = deptoDAO.get();
		for(Departamento depto: departamentos)
			System.out.println(depto);
		
		System.out.println(deptoDAO.get(10));
	}
}
