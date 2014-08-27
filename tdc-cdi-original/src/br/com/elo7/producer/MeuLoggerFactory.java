package br.com.elo7.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MeuLoggerFactory {

	@Produces
	public MeuLogger get(InjectionPoint ip) {
		Class<?> declaringClass = ip.getMember().getDeclaringClass();
		return new MeuLogger(declaringClass);
	}
	
}
