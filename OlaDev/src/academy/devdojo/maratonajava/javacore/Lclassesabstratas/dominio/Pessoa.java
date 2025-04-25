package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;


// esta clsse abstrata possui o metodo abstrato imprime(), esta clsse esta sendo extendida para a classe Funcionario
// isto significa que a classe Funcionario herda este metodo imprime()
// mas o Java tem como convencao a implementacao opcional deste metodo desta classe, e este comportamente da classe pai
// se repete para as classe filhas, ou seja, a implementacao deste metodo nas sub classes de Funcionario, é opcional
// como é um metodo abstrato, este tipo de metodo existe somente em classes abstratas
// percebe-se que este metodo nao possui corpo e nem logica.
// isto significa que este metodo tem como obrigacao existir, APENAS EXISTIR NA CLASSE PAI. e em classes que herdam desta classe diretamente, deve EXISTIR e opcionalemnte ter logica.
// ou seja, se a classe Pessoa tiver uma sub classe, esta sub classe deve herdar obrigatoriamente este metodo
// e como nao existe logica neste metodo dentro da classe pai, a responsabilidade e logica deste metodo é responsabilidade do proprio objeto da classe
public abstract class Pessoa {
    public abstract void imprime();
}
