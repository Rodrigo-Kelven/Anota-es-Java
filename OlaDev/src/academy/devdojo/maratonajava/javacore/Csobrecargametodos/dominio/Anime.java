package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int epsodios;
    private String genero;


    // construtor, nao tem tipo de retorno
    // mesmo nao criando, o java entende e cria automaticamente na hora da compilacao
    public Anime() {

    }


    public void init(String tipo, String nome, int epsodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.epsodios = epsodios;
    }

    // sobre carga de metodo é simplismente metodos com o mesmo nome, mas o tipo ou quantidade de parametros diferentes.
    public void init2(String tipo, String nome, int epsodios, String genero) {
        this.init(tipo, nome, epsodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Epsodios: " + this.epsodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
    }

    // no set nao será retornado nenhum tipo de dado, por isso retorna void/vazio
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    // ja o get tem que ter o tipo de retorno
    public String getTipo(){
        return this.tipo;
    }

    public void setEpsodios(int epsodios){
        this.epsodios = epsodios;
    }

    public int getEpsodios(){
        return this.epsodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
