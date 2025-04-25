package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        System.out.println("Inicio do While.");
        int count = 0;
        while (count < 10){
            System.out.println(count++);
            // conut++ irá de 0 à 9
            // ++count irá de 1 à 10
        }
        System.out.println("Fim do While.");
        System.out.println("");

        do{
            System.out.println("Dentro do Do While.");
        }while (count < 10);
        System.out.println("");



        for (int i = 0; i <= 10; i++) {
            System.out.printf("Dentro do For executando %d vez.%n", i);
        }
    }
}
