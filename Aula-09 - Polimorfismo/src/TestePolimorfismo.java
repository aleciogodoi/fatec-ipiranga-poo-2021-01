public class TestePolimorfismo {
	public static void main(String args[]) {

		Bicho b0 = new Bicho();
		Bicho b1 = new Cachorro();
		Bicho b2 = new Gato();

		b0.fala();
		b1.fala();
		b2.fala();
		((Cachorro)b1).morde();  // TypeCasting
		System.out.println(((Cachorro)b1).apelido);
		
		// NÃO É POSSÍVEL CONVERTER GATO EM CACHORRO
		//((Cachorro)b2).fala();
		
		// NÃO É POSSÍVEL CONVERTER BICHO EM GATO OU CACHORRO
		((Cachorro)b0).fala();

		System.out.println(b0.getClass());
		System.out.println(b1.getClass());
		System.out.println(b2.getClass());
		
	}
}