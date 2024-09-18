import model.Cliente;
import model.Funcionario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        // Coletar informações de Clientes
        System.out.println("Quantos clientes deseja adicionar?");
        int numClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numClientes; i++) {
            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite a idade do cliente:");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            String[] pedidos = {"Pedido 1", "Pedido 2"}; // Exemplo de pedidos
            Cliente cliente = new Cliente(nomeCliente, idadeCliente, pedidos);
            listaClientes.add(cliente);
        }

        // Coletar informações de Funcionários
        System.out.println("Quantos funcionários deseja adicionar?");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Digite o nome do funcionário:");
            String nomeFuncionario = scanner.nextLine();
            System.out.println("Digite a idade do funcionário:");
            int idadeFuncionario = scanner.nextInt();
            System.out.println("Digite o salário do funcionário:");
            double salarioFuncionario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            // Gerar horas trabalhadas randomicamente
            int[][] horasTrabalhadas = new int[2][5]; // 2 semanas, 5 dias por semana
            for (int semana = 0; semana < 2; semana++) {
                for (int dia = 0; dia < 5; dia++) {
                    horasTrabalhadas[semana][dia] = random.nextInt(9); // Horas entre 0 e 8
                }
            }

            Funcionario funcionario = new Funcionario(nomeFuncionario, idadeFuncionario, salarioFuncionario, horasTrabalhadas);
            listaFuncionarios.add(funcionario);
        }

        // Mostrar informações dos Clientes
        System.out.println("\nClientes cadastrados:");
        for (Cliente cliente : listaClientes) {
            cliente.mostrarInformacoes();
            cliente.mostrarPedidos();
        }

        // Mostrar informações dos Funcionários
        System.out.println("\nFuncionários cadastrados:");
        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.mostrarInformacoes();
            funcionario.mostrarHorasTrabalhadas();
        }

    
    }
}