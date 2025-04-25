package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    // este atributo privado do tipo class Professor será um array
    private Professor[] professores;


    // construtor de objeto da classe Escola que recebe somente o nome do professor
    public Escola(String nome){
        this.nome = nome;
    }

    // construtor de objeto da classe Escola que recebe nome e um array do tipo class Professor
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        if(professores == null){
            System.out.println("Professor nao encontrado");
        }
        for (int i = 0; i < professores.length; i++){
            System.out.println("Professor " + i + " : " + professores[i].getNome());
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Professor[] getProfessores(){
        return professores;
    }
}
