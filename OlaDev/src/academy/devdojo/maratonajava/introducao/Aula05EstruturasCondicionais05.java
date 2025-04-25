package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana
        byte dia = 1;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida!");
        }
        System.out.println("Fim.");

        // segundo exemplo
        System.out.println("Primeiro exemplo.");
        char sexo = 'M';

        switch (sexo){
            case 'M':{
                System.out.println("Masculino");
                break;
            }
            case 'F':{
                System.out.println("Feminino");
                break;
            }
            default:{
                System.out.println("Opação Invalida!");
            }
            System.out.println("Fim.");
        }

        // terceiro exemplo
        System.out.println("Terceiro exemplo.");
        String sexoDois = "M";

        switch (sexoDois){
            case "M":{
                System.out.println("Masculino");
                break;
            }
            case "F":{
                System.out.println("Feminino");
                break;
            }
            default:{
                System.out.println("Opação Invalida!");
            }
            System.out.println("Fim.");
        }
    }
}