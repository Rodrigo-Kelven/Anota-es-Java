package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    // esta convencao diz que quando um metodo for criado para inserir um valor em um atributo
    // o nome do metodo inicia-se com set, para informar que esta sendo setado um valor
    public void setNome(String nome){
        this.nome = nome;
    }

    // o get serve apenas para retornar o valo ja setado no atributo pelo metodo set
    // o metodo retorna um valor do tipo String
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void criarPessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void exibirPessoa(){
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    }
}
