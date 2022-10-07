import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do escoteiro: ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do escoteiro");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        //impressao antes de seprar o grupo
        membro.separarGrupo();
        membro.imprimir();



    }
}