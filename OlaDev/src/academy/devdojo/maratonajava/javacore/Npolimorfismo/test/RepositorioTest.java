package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivos;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDedados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;


// POO orientada a interface é a mesma coisa de Polimorfismo
// se o tipo da variavel que faz referencia a um objeto é do tipo interface
// a classe na qual eu crio o objeto, deve ser implementada a interface
// e caso a classe criadora do objeto tenha o metodo abstrato (pertence somente à interface) sobre escrito nela mesma
// o a variavel de referencia do objeto acessa o metodo sobre escrito
// interfaces por padrao tem seus metodos publicos abstratos (serve somente de molde, a logica é adicionada onde a interface foi implementada)
public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorioBancoDedados = new RepositorioArquivos();
        repositorioBancoDedados.salvar();

        Repositorio repositorioMemoria = new RepositorioMemoria();
        repositorioMemoria.salvar();

        Repositorio repositorio = new  RepositorioBancoDedados();
        repositorio.salvar();
    }
}
