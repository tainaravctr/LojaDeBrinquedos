import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Brinquedo> brinquedos = new ArrayList<>();


    public void adicionarBrinquedo() {
        System.out.println("Digite o nome do brinquedo:");
        String nome = scanner.nextLine();

        System.out.println("Digite a cor do brinquedo:");
        String cor = scanner.nextLine();

        Brinquedo brinquedo = new Brinquedo(nome, cor);
        brinquedos.add(brinquedo);
        System.out.println("Brinquedo adicionado: " + brinquedo.toString());
    }


    public void mostrarBrinquedos() {
        if (brinquedos.isEmpty()) {
            System.out.println("Não há brinquedos na loja ainda :(");
        } else {
            System.out.println("Brinquedos disponíveis na loja:");
            for (Brinquedo brinquedo : brinquedos) {
                System.out.println(brinquedo.toString());
            }
        }
    }


    public void mostrarQuantidadeBrinquedos() {
        System.out.println("Quantidade de brinquedos na loja: " + brinquedos.size());
    }


    public void mudarCorBrinquedo() {
        System.out.println("Digite o nome do brinquedo para mudar a cor:");
        String nome = scanner.nextLine();

        Brinquedo brinquedoEncontrado = null;
        for (Brinquedo brinquedo : brinquedos) {
            if (brinquedo.nome.equalsIgnoreCase(nome)) {
                brinquedoEncontrado = brinquedo;
                break;
            }
        }

        if (brinquedoEncontrado != null) {
            System.out.println("Digite a nova cor para o brinquedo:");
            String novaCor = scanner.nextLine();
            brinquedoEncontrado.mudarCor(novaCor);
            System.out.println("Brinquedo após mudar a cor: " + brinquedoEncontrado.toString());
        } else {
            System.out.println("Brinquedo não encontrado na loja.");
        }
    }
}
