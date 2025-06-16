package conta;

// saldo, agencia, numero, titular

// esta classe é somente um molde para a criacoa de objetos, que no caso, objetos do tipo Conta
public class Conta {

	// caracteristicas
	private double saldo;
	private int agencia, numero;
	private String titular;

	// metodos ou comportamentos

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int numberAgencia) {
		this.agencia = numberAgencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitulat(String nome) {
		this.titular = nome;
	}

}