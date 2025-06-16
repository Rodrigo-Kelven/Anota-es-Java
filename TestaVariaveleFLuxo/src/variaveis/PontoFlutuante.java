package variaveis;

public class PontoFlutuante {
	public static void main(String[] args) {
		
		double ok = 12.5;
		
		System.out.println(ok);
		
		int[] numeros = new int[5];
		
		for (int x = 0; x < 5; x++) {
			numeros[x] = x*2;
		}
		
		for (int i = 0; i < numeros.length; i++) {
		    System.out.printf("Posição %d: %d\n", i, numeros[i]);
		}


	}
}
