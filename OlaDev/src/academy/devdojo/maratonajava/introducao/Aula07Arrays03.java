package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // desta forma, o array é declarado e inicializado com valores,
        // desta forma, o tipo e tamanho é automaticamente "entendido" pelo java
        int[] numeros2 = {1,2,3,4,5};
        // terceira forma de declarar array
        int[] numeros3 = new int[]{1,2,3,4,5,6};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println("");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }


    }
}
