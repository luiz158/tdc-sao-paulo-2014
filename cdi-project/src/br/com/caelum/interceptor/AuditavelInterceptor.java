package br.com.caelum.interceptor;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Auditavel
@Interceptor @Priority(Interceptor.Priority.APPLICATION)
public class AuditavelInterceptor {

	@AroundInvoke
	public Object audita(InvocationContext ctx) throws Exception {
		System.out.println("Auditando antes da chamado do metodo");
		
		Object retorno = ctx.proceed();
		
		System.out.println("Auditando depois da chamado do metodo");
		
		return retorno;
	}
	
}
