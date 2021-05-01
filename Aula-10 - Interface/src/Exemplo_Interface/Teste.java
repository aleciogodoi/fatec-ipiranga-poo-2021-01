package Exemplo_Interface;

import java.time.LocalDate;

public class Teste {
	public static void main(String [] args) {
		Secretaria s1 = new Secretaria(1,"Ana","12243231-2",5432.22, LocalDate.of(2018, 7, 15));
		Supervisor s2 = new Supervisor(2,"Pedro","99868869-6",8532.56, LocalDate.of(2012, 3, 10));
		Supervisor s3 = new Supervisor(3,"Clara","99884812-5",8532.56, LocalDate.of(2014, 9, 21));
		Diretor d1 = new Diretor(4, "Antonio", "8876767-0", 20121.98,LocalDate.of(2010, 4, 28), s1);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(d1);
	
	}
}
