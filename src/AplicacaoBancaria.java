import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoBancaria {

    private List<Cliente> clientes;

    // Construtor
    public AplicacaoBancaria() {
        clientes = new ArrayList<>();
    }

    // Método para iniciar a execução da aplicação
    public void executar() {
        // Implementação do menu e operações bancárias

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibir o menu principal
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Abrir conta");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Transferência");
            System.out.println("5. Investir");
            System.out.println("6. Consultar saldo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Realizar a operação escolhida
            switch (opcao) {
                case 1:
                    // Abrir conta
                    // Implementação
                    break;
                case 2:
                    // Sacar
                    // Implementação
                    break;
                case 3:
                    // Depositar
                    // Implementação
                    break;
                case 4:
                    // Transferência
                    // Implementação
                    break;
                case 5:
                    // Investir
                    // Implementação
                    break;
                case 6:
                    // Consultar saldo
                    // Implementação
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);
    }
}

