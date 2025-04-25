package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

// isto é uma interface, interface nao é classe
// interface é um contrato onde todos os metodos ou metodos por padrao seram publicos e abstratos -> pertencem somente a classe
// objetos nao sao criados ´diretamente' de interfaces
public interface DataLoader {
    // quando se trata de intercafes, todos os metodos por padrao sao publicos e abstratos
    //public abstract void load();
    void load();

    // o default diz que este metodo publico, abstrato será implementado em todos os objetospor padrao caso nao tenha herdado na sub clsse criadora do objeto
    default void checkPermission(){
        System.out.println("Fazendo checkagem de permissoes.");
    }

}
