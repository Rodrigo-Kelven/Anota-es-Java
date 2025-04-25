package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Tomate produto2 = new Tomate("Tomate vermelho",2);
        produto2.setDataValidade("124578");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println(produto2.getDataValidade());

        System.out.println("------------");

        Produto ok = new Computador("okok", 45555);
        CalculadoraImposto.calcularImposto(ok);

    }
}
