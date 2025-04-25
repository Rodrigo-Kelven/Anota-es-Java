package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        // construtor do objeto jogador
        Jogador jogador1 = new Jogador("seila");

        // construtor do objeto time
        Time time1 = new Time("Borrusia Dortiman");
        //BorrusiaDortiman.setNome("Borrusia Dortiman");

        //jogador1.setNome("seila");
        // get do valor do atributo do objeto jogador
        jogador1.setTime(time1);

        // aqui, esta sendo pego os valores referente ao objeto setado      // get do valor do atributo do objeto time1
        System.out.println("Jogador: " + jogador1.getNome() + " Joga no " + time1.getNome());
        // aqui esta sendo pego o objeto que foi passado
        System.out.println("Jogador: " + jogador1.getNome() + " Joga no " + jogador1.getTime());
    }
}
