public class Cachorro extends Bicho {
	String apelido;
	@Override
	public void fala() {
		System.out.println("Au au");
	}
	public void morde() {
		System.out.println("MORDI!!!");
	}
}