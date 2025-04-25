package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // tipo do array, nome do array, alocacao de memoria do tipo do array e seu tamanho (tipo do array e tamanho é uma coisa so, me lembra Go)
        String[] nomes = new String[3];
        nomes[0] = "qwert";
        nomes[1] = "tyuiop";
        nomes[2] = "ghjkhj";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
