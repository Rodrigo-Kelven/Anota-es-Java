package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Rodrigo Kelven";
        String endereco = "Condo Encanto das Aguas";
        double salario = 5000D;
        String dataRecebimentoSalario = "30/15/2025";

        // %s diz que será impresso um valor do tipo string
        // %n diz que será pulado uma linha
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Endereco: %s%n", endereco);
        System.out.printf("Salario: R$ %.2f%n", salario);
        System.out.printf("Data de Recebimento: %s%n", dataRecebimentoSalario);
    }
}
