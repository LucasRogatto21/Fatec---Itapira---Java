public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        computador1.setMarca("HP");
        computador1.setModelo("Pavillon");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(123);
        computador1.setPreco(5000);

        computador1.imprimir();
        computador1.calcularValor();
        System.out.println();
        computador1.imprimir();

        computador2.setMarca("IBM");
        computador2.setModelo("New");
        computador2.setCor("Preta");
        computador2.setNumeroSerie(5555);
        computador2.setPreco(3000);

        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        int valorDeRetorno = computador2.alterarValor(6000);

        if (valorDeRetorno == 1){
            System.out.println("Valor alterado!");
        }else{
            System.out.println("Valor não alterado!");
        }
        computador2.imprimir();

    }
}