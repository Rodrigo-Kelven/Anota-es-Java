package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

// Polimorfismo
// Polimorfismo é a habilidade de criar variáveis do tipo de uma classe pai,
// mas referenciar objetos de classes filhas dessa classe pai.

// Características do polimorfismo:
// 1. O tipo da variável de referência deve ser da classe pai.
// 2. O objeto criado deve ser de uma classe filha (ou subclasse) dessa classe pai.
// 3. Exemplo: se a classe Produto é estendida pela classe Computador,
//    então a variável de referência deve ser do tipo Produto,
//    mas o objeto criado (através de 'new') deve ser de uma classe filha,
//    como Computador.

// Com isso, o polimorfismo funciona porque:
// - A variável de referência é do tipo classe pai (Produto).
// - O objeto que a variável irá referenciar é de uma classe filha (Computador).
//
// Caso o metodo a ser chamado não tenha sido sobrescrito na classe filha,
// o metodo da classe pai será executado.
// Caso o metodo tenha sido sobrescrito na classe filha, o metodo da subclasse será chamado,
// mesmo sendo a variável do tipo classe pai.

// Exemplo:
// Produto p1 = new Computador("Dell", 2500);
// - A variável p1 é do tipo Produto (classe pai),
// - O objeto criado é do tipo Computador (classe filha).
// - Isso é polimorfismo, porque a variável p1, sendo do tipo Produto,
//   pode referir-se a um objeto de qualquer subclasse de Produto (como Computador).

// Resumo:
// O tipo da variável de referência deve ser a classe pai,
// e o objeto criado deve ser de uma classe filha dessa classe pai.
// Caso o metodo seja sobrescrito, o metodo da classe filha será chamado,
// caso contrário, o da classe pai será executado.

// nova descoberta
// Se for adicionado um atributo qualquer dentro de uma classe filha, e este atributo tenha Get, Set
// como voce vai acessar este metodo apartir da sua variavel de referencia de tipo classe Pai,
// se este atributo nao esta na classe Pai?
// nao tem como acessar um metodo ou atributo que esta em uma classe filha se o mesmo nao existir na classe Pai.
public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
