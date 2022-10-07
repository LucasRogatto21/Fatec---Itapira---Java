public class Apolice {
    private String nomeSegurado;
    private  int idade;
    private  float valorPremio;

    public void Imprimir(){
        //soutv ele cria o System.out.println com os atributos
        System.out.println("nomeSegurado = " + nomeSegurado);
        System.out.println("idade = " + idade);
        System.out.println("valorPremio = " + valorPremio);
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
}
