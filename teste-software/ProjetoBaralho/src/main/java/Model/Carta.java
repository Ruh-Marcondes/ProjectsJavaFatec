package main.java.Model;

public class Carta {

   private Naipe naipe;
    private Valor val;

    public Carta(Naipe naipe, Valor val) {
        this.naipe = naipe;
        this.val = val;
    }
    
    public Carta() {
        // Construtor padrão
    }

    public Naipe getNaipe() {
        return this.naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getVal() {
        return this.val;
    }

    public void setVal(Valor val) {
        this.val = val;
    }

     // Sobrescrevendo o método toString()
     @Override
     public String toString() {
         return  val + " de "+ naipe;
     }
    
}