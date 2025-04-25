package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // neste exemplo, foi criado um array multidimensional, onde o array tem tamanho 3
        // e cada indice do array, aponta para um outro array que foi declarado de forma dinamica
        int[][] arrayInt = new int[3][];
        // outra forma de fazer este array
        // o tamanho do array, e dado pela quantidade de {}, neste abaixo tem 3, entao será = new int[3]
        int[][] arrayIntDois = {{1,2},{3,4,5},{6,7,8}};

        // declarando a referencia/apontamento dos indices do array para outros array de mesmo tipo e tamanho dinamico
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        // existe uma regra no java que impedi a declaracao dos valores do array quando se usa arrays multidimensionais
        //arrayInt[1] = {1,2,3}; porque basicamente, aqui esta tentando colocar 3 valores do tipo int em um unico indice do array
        arrayInt[2] = new int[]{1,2,3,4};
    }
}
