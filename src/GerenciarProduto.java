import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProduto {

    List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProduto gerenciar = new GerenciarProduto();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            opcao = montarMenu(gerenciar, sc);
        }while (opcao != 9);
    }

    private static int montarMenu(GerenciarProduto gerenciar, Scanner sc) {
        int opcao;
        System.out.println("<< MENU PRINCIPAL >>");
        System.out.println("1. Cadastrar Novo Produto");
        System.out.println("2. Registar Entrada");
        System.out.println("3. Registar Saida");
        System.out.println("4. Saldo de um produto");
        System.out.println("5. Listar Todos Produtos");
        System.out.println("6. Mostrar Patrimonio");
        System.out.println("9. Sair");
        System.out.println("Escolha sua opcao: ");
        opcao = Integer.parseInt(sc.nextLine());

        switch (opcao){
            case 1:
                gerenciar.execCadastrarNovo(sc);
                break;
            case 2:
                gerenciar.execRegistrarEntrada(sc, gerenciar);
                break;
            case 3:
                gerenciar.execRegistrarSaida(sc, gerenciar);
                break;
            case 4:
                gerenciar.execMostrarSaldo(sc,gerenciar);
                break;
            case 5:
                gerenciar.execListarTodos();
                break;
            case 6:
                gerenciar.execPatrimonioInventariado();
                break;
            case 9:
                System.out.println("Fim do programa!");
                break;
            default:
                System.out.println("OPCAO INVALIDA!!");
        }
        return opcao;
    }

    public void execCadastrarNovo(Scanner sc){
      //Cadastra um novo produto e coloca na lista
        Produto produto = new Produto();

        System.out.println("Digite o codigo do produto:");
        produto.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a discricao do produto:");
        produto.setDescricao(sc.nextLine());
        System.out.println("Digite o valor unitario do produto:");
        produto.setValorUnitario(Double.parseDouble(sc.nextLine()));
        //Finalmente colocando na lista
        System.out.println("Cadastrado com Sucesso");
        produtos.add(produto);
    }

    public void execRegistrarEntrada(Scanner sc, GerenciarProduto gerenciar){
        System.out.println("Digite o codigo do produto a dar entrada: ");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);

        if(produto != null){
            //Produto existe, logo dou entrada
            System.out.println("Digite a quantidade de entrada");
            int qtdEntrada = Integer.parseInt(sc.nextLine());
            boolean ok = produto.registrarEntrada(qtdEntrada);
            if(ok){
                System.out.println("Entrada registrada do produto!");
            }else {
                System.out.println("QUANTIDADE INVALIDA - CORRIJA!");
            }
        }

    }

    public void execRegistrarSaida(Scanner sc, GerenciarProduto gerenciar){
        System.out.println("Digite o codigo do produto a dar saida: ");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);

        if(produto != null){
            //Pedir a quantidade de saida do produto
            System.out.println("Digite a quantidade de saida: ");
            int qtdSaida = Integer.parseInt(sc.nextLine());
            boolean ok = produto.registrarSaida(qtdSaida);
            if(ok){
                System.out.println("Saida do produto do produto registrada com sucesso!");
            }else {
                System.out.println("QUANTIDADE INDISPONIVEL NO ESTOQUE!");
            }
        }
    }

    public void execMostrarSaldo(Scanner sc, GerenciarProduto gerenciar){
        System.out.println("Digite o codigo do produto: ");
        int codProcurado = Integer.parseInt(sc.nextLine());
        Produto produto = gerenciar.procurarProduto(codProcurado);
        if(produto != null){
            produto.exibirDados();
        }else{
            System.out.println("Produto nao cadastrado");
        }
    }

    public  void execListarTodos(){
        //Apresentar na tela todos os produtos cadastrados
        for(Produto item : produtos){
            item.exibirDados();
        }
    }

    public void execPatrimonioInventariado(){
        double total = 0;
        for(Produto item : produtos){
            total += item.getValorUnitario() * item.getQuantidade();
        }
        System.out.println("Valor total do inventario: " + total);

    }

    public Produto procurarProduto (int codProduto){
        for(Produto item : produtos){
            if(codProduto == item.getCodigo()){
                return  item;
            }
        }
        return null;
    }
}