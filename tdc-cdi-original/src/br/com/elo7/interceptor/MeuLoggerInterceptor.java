package br.com.elo7.interceptor;

import java.lang.reflect.Method;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import br.com.elo7.producer.MeuLogger;

@Logger
@Interceptor
public class MeuLoggerInterceptor {

	@Inject
	private MeuLogger logger;
	
	@AroundInvoke
	public Object escreveLog(InvocationContext ctx) throws Exception {
		Method method = ctx.getMethod();
		
		logger.info(method.getName());
		
		Object resultadoDoMetodo = ctx.proceed();
		
		return resultadoDoMetodo;
	}
	
}
