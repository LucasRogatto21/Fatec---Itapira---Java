import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Declarando uma variavel inteira
        /*
        Teste
         */
        char letra;

        System.out.println("Digite uma letra: ");
        letra = (char) System.in.read(); // Só le 1 char - Horrivel de usar
        System.out.println("Letra digitada: " + letra);
    }
}