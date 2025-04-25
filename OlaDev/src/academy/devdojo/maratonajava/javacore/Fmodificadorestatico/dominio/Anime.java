package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] epsodios; // array de epsodios

    // PASSOS
    // 0 - Bloco de inicializacao é executado quando a JVM carrega a classe
    // 1 - Alocado um espaco de memoria pro objeto
    // 2 - Cada atributo da clsase é criado e inicializado com valores defualt ou o que for passado
    // 3 - Bloco de inicializacao é executado antes do construto caso o bloco exista
    // 4 - Construtor é executado


    // isto é um bloco de inicializacao, ele será executado antes do construtor, independente de onde esteja
    static {
        System.out.println("Dentro do bloco de inicializacao");
        epsodios = new int[100];

        for (int i = 0; i < epsodios.length; i++){
            epsodios[i] = i+1;
        }
    }

    // aqui é o construtor da classe Anime
    public Anime(String nome){
        this.nome = nome;
    }

    // este é o construtor da classe Anime
    public Anime() {



        System.out.println("Endereco de memoria do objeto: " + epsodios);
        System.out.println("Endereco de memoria da Classe: " + Anime.epsodios);

        for(int i = 0; i < epsodios.length; i++){
            System.out.print(epsodios[i] + " ");
        }
    }

    // retorna um array de inteiro
    public int[] getEpsodios(){
        return Anime.epsodios;
    }

    // os blocos de inicializacao sao executos em sequencia, independente de onde estejam, sempre seram os primeiros
    static {
        System.out.println("Dentro do bloco de incializacao estatico 2");
    }

    static {
        System.out.println("Dentro do bloco de incializacao estatico 3");
    }

    // tambem é possivel ter um bloco de inicializacao nao estatico, este bloco refere-se ao objeto
    {
        System.out.println("Dentro do bloco de inicializacao nao estatico 4");
    }
}
