package br.com.alura.solid.heranca;

import java.util.Arrays;
import java.util.List;

public class TestaConta {

	public static void main(String[] args) {
		List<Conta> contas = Arrays.asList(new ContaComum(10.0), new ContaDeEstudante(12.0));
		for (Conta conta : contas) {
			conta.rende();

			System.out.println(conta.getSaldo());
		}
	}
	
}
