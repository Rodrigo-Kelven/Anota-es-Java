package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args){
        // como TipoCliente é uma classe de enumeracao publica, que pode ser acessada em varios pacotes, seus atributos sao publicos tmbem por padrao
        // desta forma, o codigo fica mais seguro e menos sucetivel a erros
        // ja que somente os parametros/atributos dentro a classe publica de enumeracao TipoCliente sao validos
        Cliente cliente1 = new Cliente("Kelven", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Yuri", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        cliente1.imprime();
        cliente2.imprime();
    }
}
