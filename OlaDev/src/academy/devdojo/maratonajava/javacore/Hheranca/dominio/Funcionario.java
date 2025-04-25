package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

// esta classe extente/herda a classe Pessoa
// isso significa que a classe Funcionario terá atributor/metodos que pertencem á Pessoa
public class Funcionario extends Pessoa {

    // somente este atributo privado pertence a Funcionario
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome, int cpf){
        super(nome, cpf);
    }

    public Funcionario(String nome, int cpf, Endereco endereco){
        super(nome, cpf, endereco);
    }
    // metodo de imprimir valores do objeto referente à classe Funcionario que extends Pessoa
    public void imprime(){
        // este super.imprime diz que irá herdar e acessar o metodo imprime da classe Pai (Pessoa)
        // isto so funciona se ambas as classes tiverem os mesmos metodo
        // desta forma, este metodo irá herdar a impressao de nome, cpf, endereco.
        super.imprime();
        // E irá acrescentar a impressao de salario, que é referente somente à classe Funcionario
        System.out.println("Salario: "+this.salario);

    }

    public void relatorioPagamento(){
        System.out.println("Eu: "+this.nome+" recebi: R$ "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
