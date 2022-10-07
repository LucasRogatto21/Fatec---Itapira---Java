import javax.swing.*;

public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();

        apolice.setNomeSegurado("Jorge");
        apolice.setIdade(69);
        apolice.setValorPremio(1589.89f);

        apolice.Imprimir();


    }

}
