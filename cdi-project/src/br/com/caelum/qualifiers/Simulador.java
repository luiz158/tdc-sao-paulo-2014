package br.com.caelum.qualifiers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Qualifier
public @interface Simulador {

	PlanoDeCargos planoDeCargos() default PlanoDeCargos.VERSAO_2005;
	
}
