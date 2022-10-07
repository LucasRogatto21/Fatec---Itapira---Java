public class Produto {

    private int codigo;
    private String descricao;
    private double valorUnitario;
    private  int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean registrarEntrada(int qtdEntrada){
        if(qtdEntrada <= 0){
            return false;
        }else{
            quantidade =+ qtdEntrada;
            return true;
        }
    }
    public boolean registrarSaida(int qtdSaida){
        if(qtdSaida > quantidade){
            return false;
        }else{
            quantidade =- qtdSaida;
            return true;
        }
    }
    public void exibirDados(){
        System.out.println("Dadados do Produto");
        System.out.println("codigo = " + codigo);
        System.out.println("descricao = " + descricao);
        System.out.println("valorUnitario = " + valorUnitario);
        System.out.println("quantidade = " + quantidade);
    }
}
