package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // array multidimensional
        // este array simplismente faz referencia/aponta cada indice do primeiro array, para os outros arrays criados
        int[][] dias = new int[3][3];
        // int[] dias = new int[3]; -> isto indica que foi criado um array  de tamanho 3
        // int[][] dias = new int[3][3]; -> isto indica que foi criado um array  de tamanho 3, onde cada indice do array, aponta para o outro array criado
        // desta forma, será impresso o endereco de memoria do array 1 de tamanho 3 que criamos
        System.out.println(dias[0][0]);
        // declarando valor no indice 0 do primeiro array de tamanho 3
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;
        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;
        // imprimeindo valor declarado
        System.out.println("Imprimindo com o For.");
        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias.length; j++){
                System.out.println(dias[i][j]);
            }
        }

    }
}
