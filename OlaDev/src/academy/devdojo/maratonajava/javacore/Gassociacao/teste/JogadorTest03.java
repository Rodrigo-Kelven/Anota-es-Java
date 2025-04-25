package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Gremio");

        Jogador[] jogadores = new Jogador[]{jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Jogador ---");

        System.out.println("--- Time ---");
        time.imprime();
        System.out.println("--- Time ---");

        System.out.println("--- Jogador ---");
        jogador2.imprime();
        System.out.println("--- Jogador ---");
    }
}
