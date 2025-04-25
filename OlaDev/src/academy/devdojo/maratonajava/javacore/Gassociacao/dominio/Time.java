package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        if (jogadores != null){
            for (Jogador jogador : jogadores){
                System.out.println("Jogadores do "+this.nome+":"+" "+jogador.getNome());
            }
        } else {
            System.out.println("Nenhum jogador foi encontrado");
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
