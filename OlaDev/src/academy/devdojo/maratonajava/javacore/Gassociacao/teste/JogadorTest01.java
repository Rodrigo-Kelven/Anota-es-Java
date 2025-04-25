package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kelven");
        Jogador jogador2 = new Jogador("Seila");
        Jogador jogador3 = new Jogador("kokok");

        // isto se chama associacao
        // crio uma variavel que será um array que será do tipo classe Jogador sendo
        // Jogador é a classe
        // [] isto dis que será um array
        // entao a variavel jogadores é um array do tipo Jogador, por que deste tipo?
        // Porque ele receberá objetos deste tipo, entao obrigatoriamente tem que ser do tipo Jogador
        // new Jogador aloca na memoria do array criado, a referencia 'endereco de memoria/ponteiro' dos objetos criados antes,
        // onde cada indice do array apontará para o respectivo endereco de memoria
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        //jogador1.setNome("Kelven");
        System.out.println(jogador1.getNome());
        System.out.println(jogador2.getNome());
        System.out.println(jogador3.getNome());

        System.out.println("Usando for para imprimir jogarores");
        for (int i = 0; i < jogadores.length; i++){
            jogadores[i].imprime();
        }
    }
}
