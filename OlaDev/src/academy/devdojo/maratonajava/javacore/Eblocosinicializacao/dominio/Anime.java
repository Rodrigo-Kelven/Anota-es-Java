package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] epsodios; // array de epsodios
    // isto é um bloco de inicializacao, ele será executado antes do construtor, independente de onde esteja
    {
        System.out.println("Dentro do bloco de inicializacao");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    // este é o construtor da classe Anime
    public Anime() {

        epsodios = new int[100];

        for (int i = 0; i < epsodios.length; i++){
            epsodios[i] = i+1;
        }

        System.out.println("Endereco de memoria do objeto: " + epsodios);

        for(int i = 0; i < epsodios.length; i++){
            System.out.print(epsodios[i] + " ");
        }
    }

    // retorna um array de inteiro
    public int[] getEpsodios(){
        return this.epsodios;
    }
}
