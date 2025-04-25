package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // declaracao e inicializacao do array
        int[] numeros = {1,2,3,4,5};

        // passando o array para a funcao somaArray
        calculadora.somaArray(numeros);
        // a diferenca é que nesta funcao, pode-se passar numeros como parametros
        calculadora.somaVarArgs(1,2,3,4,5);
        calculadora.somaVarArgs(numeros);
    }
}
