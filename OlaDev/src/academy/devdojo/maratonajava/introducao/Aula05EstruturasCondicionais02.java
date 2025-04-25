package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 65;
        if(idade < 15){
            System.out.println("Categoria Infantil.");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil.");
        } else if (idade >= 18 && idade < 25) {
            System.out.println("Categoria Adulto.");
        } else if (idade >= 25 && idade < 30) {
            System.out.println("Pré Coroa.");
        } else if (idade >= 30 && idade < 45){
            System.out.println("Coroa.");
        } else if (idade >= 45 && idade < 60) {
            System.out.println("Pré Idoso.");
        } else {
            System.out.println("Idoso.");
        }
    }
}
