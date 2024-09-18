package model;

public class Pedido {
    private Cliente cliente; // Associação com a classe Cliente
    private String descricao;
    private StatusPedido status;

    // Construtor
    public Pedido(Cliente cliente, String descricao, StatusPedido status) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.status = status;
    }

    public void mostrarPedido() {
        System.out.println("Pedido do cliente: " + cliente.nome);
        System.out.println("Descrição: " + descricao + ", Status: " + status);
    }
}

