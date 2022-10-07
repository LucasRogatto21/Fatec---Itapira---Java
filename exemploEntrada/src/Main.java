import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Ler entradas de dados
        int a,b,soma;
        System.out.println(("Digite o valor de a: "));
        a = sc.nextInt(); //Scanf ("%d, &a)

        System.out.println(("Digite o valor de b: "));
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A soma = " + soma);

    }
}