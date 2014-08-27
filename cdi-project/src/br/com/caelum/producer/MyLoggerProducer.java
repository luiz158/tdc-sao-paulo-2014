package br.com.caelum.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MyLoggerProducer {

	@Produces
	public MyLogger create(InjectionPoint ip) {
		return MyLoggerFactory.get(ip.getMember().getDeclaringClass());
	}
	
}
