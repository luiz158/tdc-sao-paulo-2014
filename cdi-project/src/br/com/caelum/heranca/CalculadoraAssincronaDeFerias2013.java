package br.com.caelum.heranca;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;
import javax.interceptor.Interceptor;

@Alternative
@Priority(Interceptor.Priority.APPLICATION + 1)
@Specializes //Neste caso esta sera a classe mae e ela tambem pode definir os proprios qualificadores
public class CalculadoraAssincronaDeFerias2013 extends CalculadoraDeFerias2013 {

}
