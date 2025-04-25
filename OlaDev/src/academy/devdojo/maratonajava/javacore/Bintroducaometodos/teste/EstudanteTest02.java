package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Joao";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        // chamando o metodo que retorna os atributos do objeto declarado/inicializado
        estudante1.imprime();
        estudante2.imprime();
    }
}
