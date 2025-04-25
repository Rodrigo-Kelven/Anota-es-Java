package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprimi todos os numeros pares de 0 a 1 milhão

        int valorDesejado = 1000000;

        for (int i = 0; i <= valorDesejado; i++){
            // se o resto da divisao de i por 2 for 0, é par
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
