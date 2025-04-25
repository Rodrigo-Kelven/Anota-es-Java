package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

// basicamente uma classe abstrata serve somente como molde, serve somente para ser extendida/extends
// para que as classe que à importem usem seus atributos, metodos e construtores para criarem seus objetos
// exemplo, a classe funcionario é abstrata, e será extendida para a classe Gerente, desta forma, nao é possivel criar objetos a aprtir da classe funcionario
// ou seja, pode-se criar objetos da clsse Gerente que extende a classe Funcionario somente para usar seus metods e contrutores
// é como se fosse uma Herança, mas a classe Pai/Funcionario nao pode e nao será usada para a criacao de nenhum objeto.
public abstract class Funcionario extends Pessoa{ // pessoa é uma classe abstrata, VA PARA A CLASSE PESSOA PARA ENTENDER MELHOR
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    // metodos abstratos so podem exitir dentro de classes abstratas
    // metodos abstratos sao metodos criado com a funcionalidade de deixar tal funcao por responsabilidade do objeto
    // ou seja, como este metodo é abstrato, ele nao tem corpo.
    // este metodo é chamado no construtor para a criacao do objeto
    // como este metodo abstrato esta dentro de uma classe abstrata, classe essa que é molde e é herdada/extendida por outras classes
    // este metodo deve existir dentro das classes que herdam desta classe
    // sendo assim, é responsabilidade do objeto a logica da acao, e obrigacao da classe herdar este metodo abstrato
    // resumindo, a classe pai manda todas as suas filhas herdarem e usar este metodo, mas, o uso deste metodo é de parte do objeto
    // este metodo so tem funcao de ser herdado, e talvez nao ser usado, mas sim implementado na funcao
    public abstract void calcularBonus();

    // metodo abstrato da clsse abstrata Pessoa
    // implementacao opcional
    @Override
    public void imprime() {
    }

    // pode ou nao ser usado, mas nao esta sendo usado, deixei apenas comentado
//    @Override
//    public String toString() {
//        return "Funcionario: " +
//                "Nome: " + nome +
//                ", Salario: R$ " + salario;
//    }
}
