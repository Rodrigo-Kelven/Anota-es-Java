package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;


// clsse Pai Funcionario que é abstrata serve somente de molde para a classe Desenvolvedor criar seus objetos
// usando o construtor de Funcionario herdado/extendido com o super() e passando os parametros exigidos pelo construtor
public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    // este metodo é abstrato, ele deve ser implementado, a classe pai Funcionario obriga a subclsse Filha Desenvolvedor herdar este metodo
    @Override
    public void calcularBonus() {
        this.salario = this.salario + salario * 0.1;
    }

    public void imprime() {
        System.out.println("Desenvolvedor: " + this.nome + " esta estudando Java.");
    }

    // metodo para substituir o imprime()
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
