package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args){

        // tipos primitivos
        byte byteP = 1;
        short shortP = 2;
        int intP = 3;
        long longP = 4;
        float floatP = 5;
        double doubleP = 6;
        char charP = 7;
        boolean booleanP = true;

        // Isto sao Wrappers, wrappes é basicamente uma solucao para usar tipos primitivos como se fosse objetos e, Java
        // Por exemplo, listas, nao aceitam tipos primitivos como int, mas sim Integer, porque dentro de uma lista ou colecoes, sao guardadas referencias e nao os numeros
        // cada indice irá apontar, fazer referencia, para o valor que lhe representa, por isso é orientado a objetos
        Byte byteW = 1;
        Short shortW = 2;
        Integer intW = 3;
        Long longW = 4L;
        Float floatW = 5F;
        Double doubleW = 6D;
        Character charW = 7;
        Boolean booleanW = true;

        // isto se chama Boxing ou AutoBoxing, quando o Java converte tipo primitivo para uma clssse Wrapper
        Integer x = 10;
        // isto é unboxing, transforma de uma classe Wrapper para tipo primitivo
        int y = x;

        System.out.println(x);
        System.out.println(y);

        // aqui estou dizendo q a variavel intW2 que é do tipo Wrapper Integer, recebe uma string, mas, uso um metodo para transformar string em int,
        // só que na verdade nao é int de tipo primitivo, é Integer, Integer é um Wrapper
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);
    }
}