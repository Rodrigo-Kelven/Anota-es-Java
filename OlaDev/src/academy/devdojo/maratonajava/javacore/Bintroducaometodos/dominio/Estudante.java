package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    // atributos\caracteristicas desta classe/objeto
    public String nome;
    public int idade;
    public char sexo;

    // este metodo dentro da class pode ter acesso aos atributos da class com a palvra especial this
    // this é usado quando quero dizer que quero acessar um atributo que esta dentro da classe
    // nao é obrigatorio, mas pro convencao e coesao é uma boa pratica de desenvolvimento
    // nao é uma boa pratica colocar um metodo nesta classe, vai de encontro com a responsabilidade unica de classes
    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
