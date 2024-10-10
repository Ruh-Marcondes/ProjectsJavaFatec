package Model;

public class Caixa {
    public double getSaldo() {
        return saldo;
    }

    public  boolean depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if (this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;


}
