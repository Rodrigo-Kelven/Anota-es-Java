package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        try{
            recursividadde();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public static void recursividadde() {
        recursividadde();
    }
}
