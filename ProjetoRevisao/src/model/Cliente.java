package model;

public class Cliente  extends Pessoa{
    private String[] pedidos; // Vetor para armazenar os pedidos

    // Construtor
    public Cliente(String nome, int idade, String[] pedidos) {
        super(nome, idade); // Chama o construtor da superclasse
        this.pedidos = pedidos;
    }

    // Sobrecarga de métodos (Overload)
    public void adicionarPedido(String pedido) {
        System.out.println("Adicionando pedido: " + pedido);
    }

    public void adicionarPedido(String pedido, StatusPedido status) {
        System.out.println("Adicionando pedido: " + pedido + " com status: " + status);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Cliente: " + nome + ", Idade: " + idade);
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos do cliente:");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }

     // Getters e Setters
     public String[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }
}