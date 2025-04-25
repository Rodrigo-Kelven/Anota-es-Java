package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        // para receber dados do teclado, deve-se importar uma biblioteca e adicionar a variavel esta biblioteca
        // esta variavel agora pode receber dados do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        // a variavel entrada agora contem o metodo nextLine(), que permite a leitura de diversas palavras
        // ja que quero imprimir este texto digitado, devo atribuir este texto a outra variavel do mesmo tipo do texto que foi digitado
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("Ola "+nome+","+"sua idade é: "+idade+", Seu sexo é "+sexo);


    }
}
