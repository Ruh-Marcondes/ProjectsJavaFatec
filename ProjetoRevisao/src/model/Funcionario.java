package model;

public class Funcionario  extends Pessoa{
    private double salario;
    private int[][] horasTrabalhadas; // Matriz para registrar horas por dia e semana

    // Construtor
    public Funcionario(String nome, int idade, double salario, int[][] horasTrabalhadas) {
        super(nome, idade); // Chama o construtor da superclasse
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Funcionário: " + nome + ", Idade: " + idade + ", Salário: " + salario);
    }

    public void mostrarHorasTrabalhadas() {
        System.out.println("Horas trabalhadas:");
        for (int[] semana : horasTrabalhadas) {
            for (int dia : semana) {
                System.out.print(dia + " ");
            }
            System.out.println();
        }
    }
}
