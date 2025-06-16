package interfaces;


public class TestantoInterfaces {
	public static void main(String[] args) {
		
		Carro car = new Carro();
		
		car.setNome("Teste");
		System.out.println(car.getNome());
		System.out.println(car.getAno());
		
		System.out.println(car.getPotencia());
		System.out.println(car.getCavalos());
		
	}
}
