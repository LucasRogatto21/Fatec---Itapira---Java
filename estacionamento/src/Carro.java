public class Carro {
    //atributos
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private double valor;

    //get e set dos atributos carro

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //métodos
    void acelerar(){
        //logica aqui - para acelerar
    }

    void estacionar(){

    }

    void mostrarDados(){
        System.out.println("Dados do Carro");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Valor R$ " + valor);
        System.out.println("=-=-=-=-=-=-=-=-=-");
    }
}
