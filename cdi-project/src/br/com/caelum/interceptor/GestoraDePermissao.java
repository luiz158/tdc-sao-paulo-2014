package br.com.caelum.interceptor;

@Auditavel @Logavel
public class GestoraDePermissao {

	public boolean permite() {
		System.out.println("Permitindo de forma sincrona");
		return false;
	}
	
}
