package model;

public class Corrente extends Conta {

    private double limite;


    public Corrente(int numero, String nomeCliente, String nomeAgencia, double limite) {
        super(numero, nomeCliente, nomeAgencia);
        this.limite = limite;
       
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    @Override
    public void sacar(double valor) {
       
        if (valor <=(getSaldo()+limite)) {
            setSaldo(getSaldo()-valor );

            
        }else{
            throw new IllegalArgumentException("Saque inválido");
        }

    }
    @Override
    public String toString() {
        
        return super.toString() +
        "limite: "+limite+"\n"; 
    }

    @Override
     void cobrarTarifa() {
       
        throw new UnsupportedOperationException("Unimplemented method 'cobrarTarifa'");
    }
}
