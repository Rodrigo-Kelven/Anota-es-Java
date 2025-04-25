package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        Pessoa pessoa1 = new Pessoa("Kelven");

        endereco.setRua("Manuel");
        endereco.setCep("123456879");


        pessoa1.setCpf(123456789);
        pessoa1.setEndereco(endereco);

        pessoa1.imprime();

        System.out.println("--- Funcionario ---");
        Funcionario funcionario1 = new Funcionario("Kelven");
        Funcionario funcionario2 = new Funcionario("Kelven2", 123456);
        Funcionario funcionario3 = new Funcionario("Kelven3", 123456, endereco);


        funcionario1.setCpf(123456789);
        funcionario1.setEndereco(endereco);
        funcionario1.setSalario(3000);

        funcionario1.imprime();
        funcionario1.relatorioPagamento();

        funcionario2.setEndereco(endereco);
        funcionario2.setSalario(3000);

        System.out.println("-----------------");
        funcionario2.imprime();
        funcionario2.relatorioPagamento();

        System.out.println("-----------------");
        funcionario3.setSalario(3000);
        funcionario3.imprime();
        funcionario3.relatorioPagamento();

    }
}
