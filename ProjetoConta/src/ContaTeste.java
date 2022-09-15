import java.util.Scanner;

public class ContaTeste {
    static Conta conta = new Conta();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        double valor;

        do{
            construirMenu();
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execDepositar();
                    break;
                case 3:
                    execSacar();
                    break;
                case 4:
                    execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao !=9);
    }

    private static void construirMenu() {
        System.out.println("CAIXA");
        System.out.println("1. Cadastrar");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Consultar");
        System.out.println("9. SAIR/ENCERRAR");
        System.out.println("Escolha sua opção");
    }

    public static void execCadastrar() {
        System.out.println("Inicio do Cadastro");
        System.out.println("Numero da Conta: ");
        conta.setConta(sc.nextLine().toString());
        System.out.println("Numero da agencia: ");
        conta.setAgencia(sc.nextLine().toString());
        System.out.println("Nome do Cliente: ");
        conta.setNomeCliente(sc.nextLine().toString());

    }

    public static void execConsultar() {
        conta.imprimir();
    }

    public static void execSacar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantia a ser sacada: ");

        int x = conta.sacar(Integer.parseInt(sc.nextLine()));

        if (x == 1){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saque não realizados");
        }
    }

    public static void execDepositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantia a ser depositada: ");
        conta.depositar(Integer.parseInt(sc.nextLine()));
    }

}