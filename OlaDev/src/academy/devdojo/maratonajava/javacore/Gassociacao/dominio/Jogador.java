package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    // construtor
    public Jogador(String nome){
        this.nome = nome;
    }

    // metodo set nome
    public void setNome(String nome){
        this.nome = nome;
    }

    // metodo get nome
    public String getNome(){
        return this.nome;
    }

    // o tipo do parametro passado deve ser o mesmo tipo do atributo da classe
    // como a classe vai colocar um valor diferente em seu atributo? nao faz sentido
    // se o atributo é do tipo Time que é uma classe
    // o arquimento deve ser do tipo Time que é uma classe
    public void setTime(Time time){
        this.time = time;
    }

    public String getTime(){
        return this.time.getNome();
    }

    public void imprime(){
        System.out.println(this.nome);
        if(this.time != null){
            System.out.println(this.time.getNome());
        }
    }

}