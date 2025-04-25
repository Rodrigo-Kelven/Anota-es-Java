package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // isto é um poll constante de strings
        String nome = "Kelven";
        String sobrenome = "Kelven";
        nome.concat()

        // isso retorna true, porque fazem referencia/apontam, para o mesmo objeto
        // ver internal string
        // como o tipo String é uma clsase, a variavel se torna um objeto, sendo um objeto, posso acessar seu valor
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome == sobrenome);
    }
}
