package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professo1 = new Professor("Yuri Farod");
        Professor professo2 = new Professor("Luiz Felipe");

        // criando um array do tipo class Professo para receber varios objetos do tipo do array
        Professor[] professores = new Professor[]{professo1, professo2};

        // construindo objeto escola1 com os parametros nome e um array de professores
        Escola escola1 = new Escola("Estacio", professores);

        escola1.imprime();
    }
}
