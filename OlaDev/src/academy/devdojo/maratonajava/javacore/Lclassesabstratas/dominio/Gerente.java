package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // este metodo é abstrato, ele deve ser implementado, a classe pai Funcionario obriga a subclsse Filha Gerente herdar este metodo
    @Override
    public void calcularBonus() {
        this.salario = this.salario + salario * 0.1;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome + " esta trabalhando.");
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "Nome: " + nome +
                ", Salario: R$ " + salario;
    }
}