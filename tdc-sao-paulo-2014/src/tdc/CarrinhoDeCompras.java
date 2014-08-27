package tdc;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class CarrinhoDeCompras {

	@Inject
	private Event<Item> evento;
	
	public void finalizaCompra() {
		Item itemComprado = new Item();

		evento.fire(itemComprado);
//		financeiro.emiteNota(itemComprado); 
//		
//		estoque.retira(itemComprado);
	}


}
