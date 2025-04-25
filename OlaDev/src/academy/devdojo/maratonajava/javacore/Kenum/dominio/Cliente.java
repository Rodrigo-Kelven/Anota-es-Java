package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    //  É possivel criar metodos de enumeracao dentro da classe, provavelmente nao é uma boa pratica, mas o codigo fica bem mais pratico e facil de entener
    public enum TipoPagamento{
        DEBITO,
        CREDITO

    }
    private String nome;

    // este atributo é do tipo TipoCliente, que é uma classe de enumeracao
    // este tipo de classe (enumeracao) serve exclusivamente quando se tenho diversos tipos de parametro que podem ser validos
    // ou seja, somente os atributos dentro da classe sao validos
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    // construtor
    // aqui no construtos, o parametro passaod é do tipo TipoCliente, ou seja
    // quando o atributo for passado, será validade automticamente, ja que foi passado o atributo especifico da classe TipoCliente.
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public TipoCliente getTipo(){
        return this.tipoCliente;
    }

    public void setTipo(TipoCliente tipoCliente){
        this.tipoCliente = tipoCliente;
    }

    public void imprime(){
        System.out.println("--- Dados do Cliente ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipoCliente);
        System.out.println("Tipo Pagamento: "+this.tipoPagamento);
    }
}
