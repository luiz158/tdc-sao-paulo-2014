package tdc;

import javax.enterprise.event.Observes;

public class SistemaEstoque {

	public void retira(@Observes Item itemComprado) {
		System.out.println("Retirando o item");
	}

}
