package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Dodge Ram 3500", 200);
        Carro carro2 = new Carro("Fusca", 200);
        Carro carro3 = new Carro("BMW", 200);

        // esta sendo setando um valor para o atributo da classe, ou seja, este atributo é da classe, nao do objeto
        // sendo assim, os objetos criados desta classe, receberam este valor setado
        // agora como o atributo é public pode ser acessado publicamente, static diz que o atributo é da classe nao do objeto
        // agora pode-se alterar o valor do atributo, onde sera refletido para outros objetos que forem criados a partir desta classe
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());

        carro1.imprime();
        //System.out.println(carro1.getNome());
        carro2.imprime();
        carro3.imprime();

        System.out.println();
    }
}
