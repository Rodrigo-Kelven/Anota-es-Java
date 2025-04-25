package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores aritmeticos
        // + - / *

        int numero01 = 10;
        int numero02 = 20;

        int soma = numero01 + numero02;
        int subtracao = numero01 - numero02;
        int multiplicacao = numero01 * numero02;
        int divisao = numero01 / numero02;

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        // %d diz que será impresso um valor do tipo inteiro (int)
        // %n diz que será pulado uma linha
        System.out.printf("A soma de %d + %d é: %d%n", numero01, numero02, soma);
        System.out.printf("A subtracao de %d + %d é: %d%n", numero01, numero02, subtracao);
        System.out.printf("A multiplicacao de %d + %d é: %d%n", numero01, numero02, multiplicacao);
        System.out.printf("A divisao de %d + %d é: %d%n", numero01, numero02, divisao);
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezDiferenteVinte: "+isDezDiferenteVinte);


        // operadores logicos
        // && (AND) e
        // || (OR) ou
        // ! (NOT) nao

        int idade = 19;
        float salario = 3500F;
        System.out.println("");
        //boolean isDentroDaLei = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);
        System.out.println("");

        double ValorTotalContaCorrente = 1500D;
        double ValorTotalContaPoupanca = 3000D;
        float ValorPlayStation = 500F;

        boolean isPlayStationCincoCompravel = ValorTotalContaCorrente > ValorPlayStation || ValorTotalContaPoupanca >= ValorPlayStation;
        System.out.println("isPlayStationCincoCompravel: "+isPlayStationCincoCompravel);

        // operadores de atribuicao
        // = += -= *= /= %=

        double bonus = 1800D;
        bonus += 1200; // ou (||) bonus = bonus + 1200
        bonus -= 200; // ou (||) bonus = bonus - 200
        bonus *= 20; // ou (||) bonus = bonus * 20
        bonus /= 2; // ou (||) bonus = bonus / 2
        System.out.printf("Bonus: R$ %.2f%n", bonus);

        // incrementadores
        // a diferenca de usar o incremento antes ++contador ou depois contado++
        // é que sera executado a primeira operacao dependendo do que esteja sendo efetuado
        // ++contador -> incrementa primeiro depois exibe o valor
        // contador++ -> exibe o valor depois incrementa
        int contador = 0;
        contador++;
        contador++;
        contador++;
        contador--;

        int contadorDos = 0;
        ++contadorDos;

        System.out.println("contador: "+contador);
        System.out.println("contador: "+contadorDos);

    }
}
