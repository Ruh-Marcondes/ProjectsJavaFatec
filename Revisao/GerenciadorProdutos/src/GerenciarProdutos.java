import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Disponibilidade;
import model.Produto;

public class GerenciarProdutos {

    private List<Produto> produtos = new ArrayList<>(); // Cria a lista de produtos
    private Scanner sc = new Scanner(System.in); // Cria o Scanner

    public static void main(String[] args) {

        GerenciarProdutos gp = new GerenciarProdutos();// Cria o objeto da classe

        // Loop de menu
        int opc = 0;
        do {
            gp.menu();
            System.out.println("Escolha a operação: ");
            opc = Integer.parseInt(gp.sc.nextLine());

            switch (opc) {
                case 1:
                    String nome;
                    double preco;
                    String disponibilidade;
                    LocalDate dataCastro;
                    System.out.println("============Cadastrando novo produto======");
                    System.out.println("Digite o nome do produto");
                    nome = gp.sc.nextLine();

                    System.out.println("\n Digite o preco do produto");
                    preco = Double.parseDouble(gp.sc.nextLine());

                    System.out.println("Qual a disponibilidade do produto: ");
                    disponibilidade = gp.sc.nextLine().toUpperCase();

                    dataCastro = LocalDate.now();

                    break;

                case 4:
                    gp.execSair();
                    break;
                default:
                    break;
            }

        } while (opc != 4);

    }

    // Metodos
    private void execCadastrar(String nome, double preco, String disponibilidade, LocalDate dataCastro) {
        Disponibilidade dis =  new Disponibilidade();
        dis.valueOf(disponibilidade);

        Produto produto = new Produto(nome, preco, dis, dataCastro);
        produtos.add(produto);

    }

    private void exeConsultar() {

    }

    private void exeConsultarPornome() {

    }

    private void execAlterarDisponibilidade() {

    }

    private void execSair() {
        System.out.println("Saindo do sistema");
    }

    private void menu() {
        System.out.println("=========Menu==========");
        System.out.println("1. Cadastrar novo Produto");
        System.out.println("2. Listar produtos cadastrador");
        System.out.println("3. Consultar produto");
        System.out.println("4. Sair");

    }
}
