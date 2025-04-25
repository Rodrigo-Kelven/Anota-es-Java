package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }


    // este metodo sobre escrito esta vindo de algum lugar, se eu extendi a classe Produto par cá
    // esse metodo vem de lá, mas nao esta lá, em Produto existe uma implementacao, implementacao so existe para interfaces
    // este metodo esta em uma interface que esta sendo implementada na minha classe Pai, logo minhas classes filhas herdam este metodo
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }
}
