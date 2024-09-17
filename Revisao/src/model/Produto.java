package model;

import java.time.LocalDate;

public class Produto {
    
    
    private String nomeProduto;
    private double precoProduto;
    private Disponibilidade disponibilidade;
    private LocalDate dataCadasto;

    
    
    //Metodos

    public Produto(String nome, double preco, Disponibilidade disponibilidade, LocalDate dataCastro){
        this.nomeProduto = nome;
        this.precoProduto = preco;
        this.disponibilidade = disponibilidade;
        this.dataCadasto = dataCastro;
    }


    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Disponibilidade getDisponibilidade() {
        return this.disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getDataCadasto() {
        return this.dataCadasto;
    }

    public void setDataCadasto(LocalDate dataCadasto) {
        this.dataCadasto = dataCadasto;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " ";
    }

}
