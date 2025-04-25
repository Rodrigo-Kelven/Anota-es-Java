package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // obrigatoriamente o resultado ou o que esta entre parenteses, presica ser booleano
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.printf("Pode comprar bebida alcoolica. %n");
        }
        if (!isAutorizadoComprarBebida){ // !isAutorizadoComprarBebida é a mesma coisa que isAutorizadoComprarBebida == false
            System.out.println("Nao pode comprar bebida alcoolica.");
        }

    }
}
