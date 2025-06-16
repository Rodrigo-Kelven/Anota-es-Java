package conta;

public class Testereferencia {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 3000;
		
		System.out.println(primeiraConta.saldo);
		
		
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo = 2500;
		
		System.out.println(segundaConta.saldo);
		
	}
}
