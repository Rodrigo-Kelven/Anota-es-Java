package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Taxavel;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    // este codigo nao será nescessario com o polimorfismo
//    public static void calcularImpostoComputado(Computador computador){
//        System.out.println("Ralatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.println("Imposto do computador: " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Ralatorio de imposto do computador");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto do tomate: " + imposto);
//    }

    // esta classe static pertence somente a esta classe
    // esta classe espera receber uma variavel que faz referencia/aponta para algum objeto que tenha algum tipo
    // o tipo da variavel é uma classe chamada Produto, e o tipo do objeto que ela faz referencia/aponta e Computador
    // Computado extends Produto, ou seja, Computador é uma sub classe de Produto
    // logo, se a variavel a ser recebida é do tipo produto, e esta variavel faz referncia/aponta para um objeto que foi criado apartir da class Computador
    // esta variavel pode acessar tudo que existe na classe Pai/Produto e filha/Computador
    // isto é Polimorfismo
    // variavel do tipo classe Pai
    // objeto que a variavel faz referencia/aponta de tipo sub classe/filha da classe Pai
    public static void calcularImposto(Produto produto){
        System.out.println("Ralatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto do produto: " + imposto);
        // esta palvra reservada tem como funcionalidade fazer a seguinte pergunta
        // o tipo da variavel produto que é uma classe Pai, tem como filha/sub classe a classe Tomate?
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Valor do Tomate: " + tomate.getDataValidade());
        }

    }
}
