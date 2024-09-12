import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;

public class GerenciarProdutos {
 
    private List<Produto> produtos;
    private Scanner sc;
    public static void main(String[] args) {
        
        GerenciarProdutos gp = new GerenciarProdutos();

        gp.produtos = new ArrayList<>(); //Cria a lista de produtos
        gp.sc = new Scanner(System.in);

        //Loop de menu
        int opc = 0;
        do{
            gp.menu();
            System.out.println("Escolha a operação: ");
            opc = Integer.parseInt(gp.sc.nextLine());
            
            switch (opc) {
                case 1:
                    gp.execCadastrar();
                    break;
            
                case 4:
                    gp.execSair();
                break;
                default:
                    break;
            }


        }while( opc !=4);

    }

    //Metodos
   private void execCadastrar(){

    }

    private void exeConsultar(){

    }
   private void exeConsultarPornome(){

    }
   private void execAlterarDisponibilidade(){

    }
    private void execSair(){
        System.out.println("Saindo do sistema");
    }

    private void menu(){
        System.out.println("=========Menu==========");
        System.out.println("1. Cadastrar novo Produto");
        System.out.println("2. Listar produtos cadastrador");
        System.out.println("3. Consultar produto");
        System.out.println("4. Sair");

    }
}
