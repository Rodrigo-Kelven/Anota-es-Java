package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    // atributos privados da classe Pessoa
    protected String nome;
    protected int cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, int cpf){
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome, int cpf, Endereco endereco){
        this(nome, cpf);
        this.endereco = endereco;
    }

    // metodo publico de retorno vazio da classe Pessoa
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereco: "+this.endereco.getRua()+" "+this.endereco.getCep());
    }

    // metodo get da classe Pessoa
    public Endereco getEndereco() {
        return endereco;
    }

    // metodo set da classe Pessoa
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // metodo get da classe Pessoa
    public int getCpf() {
        return cpf;
    }

    // metodo set da classe Pessoa
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // metodo get da classe Pessoa
    public String getNome() {
        return nome;
    }

    // metodo set da classe Pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }
}
