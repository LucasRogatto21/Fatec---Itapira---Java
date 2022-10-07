public class GerenciarEstacionamento {

    //método main - inicialializar o programa
    public static void main(String[] args) {
        //Cadastrar o carro do Maromo
        Carro carro = new Carro();
        carro.setPlaca("FFF-0000");
        carro.setModelo("C3");
        carro.setMarca("Citroen");
        carro.setValor(30000.00);
        carro.setCor("Branca");

        carro.mostrarDados();

    }
}
