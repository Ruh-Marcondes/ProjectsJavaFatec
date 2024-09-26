package model;

public class Poupanca extends Conta{

    private int diaAniversario;

    public Poupanca(int numero, String nomeCliente, String nomeAgencia,int diaAniversario) {
        super(numero, nomeCliente, nomeAgencia); //super chama da classe que eu extend
        

        this.diaAniversario = diaAniversario;
    }

    public int getdiaAniversario(){
        return diaAniversario;
    }

    public void setdiaAniversario(int diaAniversario){
        this.diaAniversario = diaAniversario;
    }
    
    @Override
    public String toString() {
        
        return super.toString()+
        "Data: "+diaAniversario+"\n";
    }

    @Override
    void cobrarTarifa() {
       
        throw new UnsupportedOperationException("Unimplemented method 'cobrarTarifa'");
    }
}
