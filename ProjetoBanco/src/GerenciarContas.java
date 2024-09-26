import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Corrente;
import model.Poupanca;

public class GerenciarContas {

	private List<Conta> contas = new ArrayList<>();
	public static void main(String[] args) {
		Corrente c1 = new Corrente(11, "Enrico", "Inter",1300);


		Poupanca c2 = new Poupanca(12, "Cavalo dado", "Mogi Mirim", 26);	
		
		c1.depositar(1000);
		c2.depositar(1000);

		GerenciarContas gc = new GerenciarContas();
		gc.adicionarConta(c1);
		gc.adicionarConta(c2);
		gc.listarConta();

	}

	public void adicionarConta(Conta conta){
		contas.add(conta);
	}

	public void listarConta(){
		for(Conta conta : contas){
			conta.toString();
		}
	}
}
