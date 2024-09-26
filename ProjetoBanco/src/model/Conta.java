package model;

public abstract class Conta {

    private int numero;
    private String nomeCliente;
    private String nomeAgencia;
    private double saldo;


public Conta(int numero, String nomeCliente, String nomeAgencia){
    this.numero = numero;
    this.nomeCliente = nomeCliente;
    this.nomeAgencia = nomeAgencia;
    this.saldo =0;
}

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
   
    }

    public void sacar(double valor){
        if (this.saldo >= valor ) {
            this.saldo -= valor;
        }else{
            throw new IllegalArgumentException("Sem saldo");
        }
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    @Override
    public String toString() {
        
        return "\n==========Dados da conta ============\n"+
        "Numero: " + numero+"\n"+
        "Cliente: "+nomeCliente +"\n"+
        "Agencia: "+nomeAgencia+ "\n"+
        "Saldo: "+saldo+"\n";
    }

    //metodo abistrato para cobrar tarifas por transação
    abstract void cobrarTarifa(); //Metodo abstrato so dentro de classe abstrata
    
}