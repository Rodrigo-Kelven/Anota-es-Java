package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.setNome("Kelven");
        String resultNome = pessoa1.getNome();
        System.out.println(resultNome);

        pessoa1.setIdade(19);
        int resultIdade = pessoa1.getIdade();
        System.out.println(resultIdade);

        pessoa2.criarPessoa("Kelven", 19);
        pessoa2.exibirPessoa();

    }
}
