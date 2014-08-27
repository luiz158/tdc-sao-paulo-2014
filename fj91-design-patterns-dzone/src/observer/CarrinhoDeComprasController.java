package observer;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasController {

	private List<Observer> observadores = new ArrayList<>();
	
	public void finaliza(Usuario usuario, Produto produto) {
		//macumba de finalizacao
		
		notificaTodoMundo();
	}

	private void notificaTodoMundo() {
		for (Observer obs : observadores) {
			obs.executa();
		}
	}

	public void registraObservador(Observer observer) {
		this.observadores.add(observer);
	}

}
