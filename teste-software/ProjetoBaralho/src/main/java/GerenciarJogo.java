package main.java;
import main.java.Model.Baralho;
import main.java.Model.Carta;


public class GerenciarJogo {
  
    private   Baralho baralho;
    public static void main(String[] args) {
      
        
        /**
         * Fluxo de pensamento 
         * -> Criar o baralho
         *  -> Criar carta a carta,  Nipe e Valor, (segue a ordem que tá lá)
         *  -> Add cada carta na lista de carta 
         * -> Embaralhar as cartas
         * -> Exibir as cartas embaralhadas 
         * 
         */

        GerenciarJogo gj = new GerenciarJogo(); //Cria um obje gj, pra criar um baralho
        gj.baralho = new Baralho();
        
        //baralho = new Baralho(); //cria um novo baralho
        //baralho.exibir();

        for(Carta carta :gj.baralho.getBaralho()){
            System.out.println(carta);

        }

        //Embaralhando as cartas

        gj.baralho.embaralhar();
    
        System.out.println("=========Baralho embaralhado========= \n");
        for(Carta carta :gj.baralho.getBaralho()){
            System.out.println(carta);

        }


    }
}
