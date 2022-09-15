import java.util.Scanner;

public class Conta {

    Scanner sc = new Scanner(System.in);
    private String conta;
    private String agencia;
    private  double saldo;
    private  String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public int sacar(double valor){
        if (valor <= saldo && saldo > 0 ){
            saldo = saldo - valor;
            return 1;
        }else{
            return 0;
        }

    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public  void imprimir(){
        System.out.println("Nome Cliente = " + nomeCliente);
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
    }
}
