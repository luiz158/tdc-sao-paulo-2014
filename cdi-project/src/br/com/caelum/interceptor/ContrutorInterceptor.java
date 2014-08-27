package br.com.caelum.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundConstruct;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor @Logavel @Priority(Interceptor.Priority.APPLICATION)
public class ContrutorInterceptor {

	@AroundConstruct
	public Object interceptaContrutor(InvocationContext ctx) throws Exception {
		System.out.println("Antes do Construtor");
		
		Object retorno = ctx.proceed();
		Object objetoRecemCriado = ctx.getTarget().getClass().getSuperclass().getName();
		System.out.println("Objeto criado: " + objetoRecemCriado);
		
		System.out.println("Apos do Construtor");
		return retorno;
	}
	
}
