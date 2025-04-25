package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Arrays, quando eu quero um array, eu digo pro java isso [], isso significa que a variavel será um array
        // isto é um array, para declarar um array se diz
        // o tipo, [] e o nome do array, somente isto e o java entendi que isto é uma array
        // ao declarar um arrar, obrigatoriamente tem que dizer quanto de memoria/espaco será alocado na memoria
        // neste exemplo, tres (3) espacos de memoria foram alocados
        int[] idades = new int[3];
        // declarando valores aos respectivos indices do array de temanho 3
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println("Memoria alocada do array: "+idades); // imprimindo valor da memoria onde o array de tamanho 3 esta alocado
        System.out.println("Indice 0 do array: "+idades[0]);
        System.out.println("Indice 1 do array: "+idades[1]);
        System.out.println("Indice 2 do array: "+idades[2]);

        System.out.println("");
        System.out.println("Percorrendo o array com for.");
        for(int i = 0; i < 3; i++){
            System.out.println(idades[i]);
        }
    }
}
