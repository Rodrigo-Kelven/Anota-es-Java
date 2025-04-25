package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // operador ternario
        // nao é recomendado usa-lo quando se tem muitos if/else
        double salario = 6000D;

        // Doar se salario for maior que 5000
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDOar = "Ainda nao tenho condicoes, mas vou ter";

        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDOar; // muito facio e lindo ;)

        System.out.println(resultado);
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDOar); // dentro do println
    }
}
