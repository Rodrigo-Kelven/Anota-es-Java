package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // metodos
    // estrutura dos metodos
    // modificador de acesso, retorno, nome do metodo
    public void somarDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(3000 - 1000);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public void multiplicaDoisNumerosDois(int num1, float num2){
        System.out.println(num1 * num2);
    }

    // em metodos com retorno especificado, deve-se lembrar que o retorno esta sendo passado, mas se nao for passado
    // para nenhuma variavel, o retorno nao será exibido
    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }

    public double divideDoisNumerosDois(double num1, double num2){
        return num1 / num2;
    }

    public double divideDoisNumerosTres(double num1, double num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return (int) num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros:");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }

    // esta sintaxe int... permite a passagem de numeros como parametros
    // Exemplo: 1,2,3,4,5
    // nao pode ser passado outro tipo de parametro depois da sintaxe VarArgs, somente antes.
    // Exemplo: somaVarArgs(double valor, int... numeros)
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println(soma);
    }

}
