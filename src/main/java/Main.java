import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nBem-vindo à Loja de Brinquedos!");
            System.out.println("Escolha uma opção:");
            System.out.println("1- Adicionar brinquedo");
            System.out.println("2- Mostrar todos os brinquedos");
            System.out.println("3- Mostrar quantidade de brinquedos");
            System.out.println("4- Mudar cor de um brinquedo");
            System.out.println("5- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    loja.adicionarBrinquedo();
                    break;
                case 2:
                    loja.mostrarBrinquedos();
                    break;
                case 3:
                    loja.mostrarQuantidadeBrinquedos();
                    break;
                case 4:
                    loja.mudarCorBrinquedo();
                    break;
                case 5:
                    System.out.println("Saindo da loja... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}