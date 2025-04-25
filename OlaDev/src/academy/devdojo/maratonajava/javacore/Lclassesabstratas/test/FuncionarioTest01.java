package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        // como a classe Fucionario é abstrata, nao pode ser criado nenhum objeto diretamente dela
        // mas pode-se criar objetos a partir de onde a classe funcionario é extendida
        // Exemplo: a classe Gerente extends/Herda a classe Funcionario e usar o construtor de Funcionario para construir o objeto Gerente
        // a classe Funcionario/Pai é abstrata, isto significa que ela so servira de molde para ser extendida e usada em outras classes
        //Funcionario funcionario1 = new Funcionario("Kelven", 3000);

        Gerente gerente = new Gerente("Rodrigo Kelven", 3000);

        Desenvolvedor rodrigoKelven = new Desenvolvedor("Rodrigo Kelven", 3000);

        System.out.println(gerente);
        System.out.println(rodrigoKelven);

        gerente.imprime();
        rodrigoKelven.imprime();


    }
}