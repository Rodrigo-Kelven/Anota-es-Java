package academy.devdojo.maratonajava.javacore.Jmodificadoresdeacessofinal.dominio;

public class Carro {
    private String nome;
    // isto é uma constante, static final diz que esta variavel privada do tipo double é constante
    // e pos ser uma constante, por convencao, deve-se ser declarada em UPCASE (letra maiuscula)
    // e caso tenha palavras compostas como no exemplo, deve-se ser separada por underscor _
    // como é uma constante, deve-se inicializar com um valor padrao, já que o valor nao poderá ser modificado posteriormente
    public static final double VELOCIDADE_LIMIT = 250;
    // outra forma de declarar o valor da variavel constante é usando blocos de inicializacao estaticos
    public static final double VELOCIDADE_LIMIT_DOIS;
    static {
        VELOCIDADE_LIMIT_DOIS = 350;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
