import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario;
        boolean casado;
        int numFilhos;

        System.out.println(("Digite o nome: "));
        nome = sc.nextLine();

        System.out.println(("Digite o salario: "));
        salario = sc.nextDouble();

        System.out.println(("Digite True para casado: "));
        casado = sc.nextBoolean();

        System.out.println(("Digite a quantidade de filhos: "));
        numFilhos = sc.nextInt();

        System.out.println(nome + "voce tem " + numFilhos + "filhos" );
        System.out.println("Casado: " + casado);
    }
}