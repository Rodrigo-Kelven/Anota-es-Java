package academy.devdojo.maratonajava.javacore.Jmodificadoresdeacessofinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadoresdeacessofinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMIT);
        System.out.println(Carro.VELOCIDADE_LIMIT_DOIS);
    }
}
