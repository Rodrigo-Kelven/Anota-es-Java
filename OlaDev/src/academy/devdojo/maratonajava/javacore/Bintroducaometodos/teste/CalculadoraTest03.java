package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // em metodos com retorno especificado, deve-se lembrar que o retorno esta sendo passado, mas se nao for passado
        // para nenhuma variavel, o retorno nao será exibido
        double resultado = calculadora.divideDoisNumeros(150,12);
        System.out.println(resultado);
        // ou
        System.out.println(calculadora.divideDoisNumeros(150,12));

        System.out.println("Fazendo casting.");
        int resultadoDois = (int) calculadora.divideDoisNumerosDois(150,12);
        System.out.println(resultado);

        System.out.println("Retornando zero (0).");
        int result = (int) calculadora.divideDoisNumerosTres(20,0);
        System.out.println(result);
    }
}
