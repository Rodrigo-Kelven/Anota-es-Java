package academy.devdojo.maratonajava.introducao;

public class Aula02TpoPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos
        // int, double, float, char, byte, short, long, boolean

        // convencao de variaveis
        // a primeira letra é maiuscula
        // se for palavras compostas, a primeira é minuscula, e as demais primeiras letras das palavras, maiuscula
        int idade = 10;
        int idadeComCast = (int) 10000000000L; // isto é um casting de um valor do tipo long L para forcadamente int
        long idadeLong = 100000L;
        double salarioDouble = 2000D;
        float salarioFloat = 2500.0F; // este F no final, diz ao compilador que isto é um numero float, é uma convencao
        byte idadeByte = 10;
        short idadeShort = 100;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';

        // string em java sao classes, classes comecao com letra maiuscula
        String nome = "Rodrigo Kelven, Developer Backend Java";
        // esta sintaxe é nova, a partir do java 10
        var nomeDois = "Rodrigo Kelven, Developer Backend Java";


        System.out.printf("idade = %d\n", idade);
        System.out.println(idade);
        System.out.printf(verdadeiro ? "verdadeiro" : "falso"); // isto é um operador ternario
        System.out.println("");
        System.out.printf(falso ? "verdadeiro" : "falso"); // isto é um operador ternario
        System.out.println("");
        System.out.printf("idadeComCast = %d\n", idadeComCast);
        System.out.printf("nome = %s\n", nome);
        System.out.println("Hello Word: "+ nome);
    }
}