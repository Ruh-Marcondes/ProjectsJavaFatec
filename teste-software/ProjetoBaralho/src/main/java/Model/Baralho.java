package main.java.Model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Baralho {

   private ArrayList<Carta> cartas;

   public Baralho() {
    //Construtor que intancia o array list e chama o metodo montar que cria o baralho;
      this.cartas = new ArrayList<Carta>();
      montar();
      embaralhar();
   }
   
   private void embaralhar() {
      //Embaralhar a lista de cartas
      /*Duas formas 1-> usando o Collections.shuffle 
       Collections.shuffle(cartas,new Random());
       * 
       * 2-> Fazendo um embaralhamento na "mão";
      */
      Carta aux; //Variavel aux de Carta
      int auxI, auxJ; // Variavel auxiliar int
        Random ram = new Random();
        for(int i = 0; i < cartas.size(); i++){
            auxI = ram.nextInt(cartas.size()); // Atribui um número randomico a auxI
            auxJ = ram.nextInt(cartas.size());
            
            aux = cartas.get(auxI); // aux salva os dados da carta na posição auxI

            //Trocam as cartas de lugar
            cartas.set(auxI, cartas.get(auxJ)); 
            cartas.set(auxJ, aux); 

        }
   }

  private void montar() {
    // Monta o baralho
    for (Naipe naipe : Naipe.values()) {
        for (Valor valor : Valor.values()) {
            // Aqui você cria uma nova carta e adicionaria ao baralho
            Carta carta = new Carta(naipe, valor);
            cartas.add(carta); // "cartas" é a lista de cartas
        }
    }
}

public void exibir() {
    for (Carta carta : cartas) {
        System.out.println(carta.toString()); // Imprime a representação da carta
    }
}
   
}

