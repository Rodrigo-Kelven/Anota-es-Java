package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Carro 1";
        carro1.ano = 1990;
        carro1.modelo = "Foguete";

        carro2.nome = "Carro 2";
        carro2.ano = 2021;
        carro2.modelo = "Nutela";

        // isto esta dizendo que carro1 esta fazendo referencia/apontando para o endereco de memoria de carro2
        // agora carro1 recebe todos os valores passados para carro2
        carro1 = carro2;

        System.out.println(carro1.nome + " " + carro1.ano + " " + carro1.modelo);
        System.out.println(carro2.nome + " " + carro2.ano + " " + carro2.modelo);
    }
}
