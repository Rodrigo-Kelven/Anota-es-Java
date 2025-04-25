package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptoinTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(12,2));
    }

    public static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw  new IllegalArgumentException("Argumento ilegal, nao pode ser zero '0'");
        }
        try {
            return a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        return 0;
    }
}
