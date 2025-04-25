package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();  // Tenta criar o arquivo
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();  // Se ocorrer um erro, imprime o rastreamento do erro
        }
    }
}
