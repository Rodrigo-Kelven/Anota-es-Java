package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    // os tipos destes atributos sao o nome da propria clsse, TipoCliente, TipoCliente é o tipo dos atributos
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;

    }


}
