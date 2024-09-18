package model;

abstract public class Pessoa {
    protected String nome;
    protected int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato (a ser implementado pelas subclasses)
    public abstract void mostrarInformacoes();

      // Getters e Setters
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
