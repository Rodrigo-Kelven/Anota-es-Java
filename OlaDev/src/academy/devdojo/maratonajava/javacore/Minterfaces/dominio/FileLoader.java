package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load(){
        System.out.println("Carregando dados de uma arquivo.");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados de uma arquivo.");
    }

    // Este decorador/anotacao serve pra dizer ao java que estou sobre escrevendo um metodo que estou herdando da classe/Interface Pai
    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes do arquivo.");
    }

}
