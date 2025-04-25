package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
    double media = 0;

    public void imprimeDadosFuncionario(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        for (int i = 0; i < this.salario.length; i++){
            if (this.salario[0] <= 0 && this.salario[1] <= 0 && this.salario[2] <= 0){
                System.out.println("Sem dinheiro na conta.");
                break;
            }
            System.out.println("Salario: "+i+" "+this.salario[i]);
        }
    }

    public void imprimeMediaSalario(){
        System.out.println("----------------");

        for(int i = 0; i < this.salario.length; i++){
            media += this.salario[i];
        }
        System.out.println("Media salarial de: "+this.nome+" R$:"+media);
    }
}
