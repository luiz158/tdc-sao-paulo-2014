package br.com.caelum.interceptor;

@Gestora
public class GestoraDePermissaoAssincrona extends GestoraDePermissao {

	@Override
	public boolean permite() {
		System.out.println("Permitindo de forma assincrona");
		return super.permite();
	}
	
}
