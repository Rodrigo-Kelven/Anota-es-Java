package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    // este modificador static diz que este atributo nao pertente mais ao objeto, mas sim a propria classe
    // ou seja, nao pode ser modificado pelo objeto, é como se fosse uma CARACTERISTICA DA CLASSE E NAO DO OBJETO
    private static double velocidadeLimite = 250;


    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        //this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima); // o this se refere ao objeto criado que faz referencia a classe Carro
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite); // aqui se refere a classe Carro
    }


    // mesma coisa dos atributos da classe, o static diz que este metodo pertence somente á Classe, e nao ao objeto
    // public diz qu eé publico
    // statis diz que este metodo é da classe e nao do objeto
    // void pois nao retorna nada (set nao retorna nada por padrao de convencao)
    // setVelocidadeLimite é o nome do metodo
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // pertence a classe
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
