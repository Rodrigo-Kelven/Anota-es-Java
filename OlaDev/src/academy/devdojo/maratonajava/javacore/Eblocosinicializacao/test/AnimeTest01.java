package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("ok");

        System.out.println(anime.getEpsodios());
    }
}
