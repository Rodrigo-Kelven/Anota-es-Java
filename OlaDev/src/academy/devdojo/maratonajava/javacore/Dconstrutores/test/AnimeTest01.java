package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // ao passar os parametros neste construtor, o java identificara quantos parametros tem, e irá passar para o construtor adequado
        // este construtor recebe 5 parametros
        Anime anime  = new Anime("seila", "one",12,"ok", "ko");

        anime.imprime();
        System.out.println("--------------");

        // neste objeto, o seu construtor nao recebe nenhum parametro, por isso ele recebe valores padroes
        // a medida que sao passados parametros no construtor, os dados sao setadoes por diferente construtores de quantidade de parametros diferentes
        Anime anime2 = new Anime();
        anime2.imprime();

    }
}
