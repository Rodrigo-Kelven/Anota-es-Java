package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// quando se trabalha com interfaces, nao usa-se o extends e sim o implements
// nao exite limite pra quantidade de interfaces que uma classe pode implementar
public class DatabaseLoader implements DataLoader, DataRemover {

    // este decorador/anotacao @Override diz que estou sobrepondo/sobre escrevendo este metodo que esta dentro da classe/Interface Pai ou super classe
    // so funciona quando os modificadores de acesso nao sao tao restritivos, como public e protected
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados.");
    }

}
