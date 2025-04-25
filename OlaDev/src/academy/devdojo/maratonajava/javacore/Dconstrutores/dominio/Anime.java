package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int epsodios;
    private String genero;
    private String estudio;


    // um construtor deve ter o nome da classe!
    // construtor, nao tem tipo de retorno
    // mesmo nao criando, o java entende e cria automaticamente na hora da compilacao
    // o construtor é executado anyes de qualquer metodo
    // ao passar parametros no construtor, o constrututor entende que para criar o objeto, os parametros passados no construtor sao obrigatorios
    public Anime(String tipo, String nome, int epsodios, String genero) {
        // neste construtor, recebe apenas 4 parametros, nem mais nem menos
        this(); // chamando outro construtor que nao recebe parametros.
        // setando os parametros aos seus atributos
        this.tipo = tipo;
        this.nome = nome;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    // este é o construtor que esta recebendo os parametros passados em AnimeTeste01
    public Anime(String tipo, String nome, int epsodios, String genero, String estudio) {
        // esta sintaze diz que esta sendo passado parametros para outro construtor, fazendo uam sobre carga de construtores
        // caso queira passar parametros para outro construtor, deve-se saber que esta sintaxe deve sempre estar na primeira linha do construtor
        // neste construtor, recebe-se apenas 4 parametros, na linha 16 ele é declarado, desta forma, o codigo vai pra la
        this(tipo, nome, epsodios, genero);
        this.estudio = estudio;
    }

    // tambem é possivel sobre carga de construtores
    // neste construtor nao será passado nenhum valor para ser inicializado
    public Anime() {
        // Inicializa com valores padrão
        this.tipo = "Desconhecido";
        this.nome = "Desconhecido";
        this.epsodios = 0;
        this.genero = "Desconhecido";
        this.estudio = "Desconhecido";
        System.out.println("Dentro do construtor sem argumentos.");
    }


    public void imprime(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Epsodios: " + this.epsodios);
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
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
