package conta;

public class CriarConta {
	public static void main(String[] args) {

		// criar é a mesma coisa que instanciar
		// aqui esta sendo criado/instanciado um objeto de tipo Conta
		Conta primeiraConta = new Conta();
		

		primeiraConta.depositar(0);
		primeiraConta.depositar(52);
		primeiraConta.depositar(5);

		primeiraConta.setAgencia(7);
		primeiraConta.setNumero(8);
		primeiraConta.setTitulat("Kelven");

		
		System.out.println(primeiraConta.getSaldo());
		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		System.out.println(primeiraConta.getTitular());

		primeiraConta.sacar(50);
		System.out.println(primeiraConta.getSaldo());
		
		
		primeiraConta.setTitulat("okok");
		System.out.println(primeiraConta.getTitular());
		
		primeiraConta.depositar(100000);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.sacar(597);
		System.out.println(primeiraConta.getSaldo());





	}
}