package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("O grande software de previsao do futuro.");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta: ");
        String pergunta = input.nextLine();


        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}
