package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao03 {
    // imprime os primeiro 25 numeros
    public static void main(String[] args) {

        int valorMax = 50;

        for (int i = 0; i <= valorMax; i++) {
            // se i for maior que 25 ele para
            if (i == 5){
                System.out.printf("Numero %d: ", i);
                continue;
            }
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
