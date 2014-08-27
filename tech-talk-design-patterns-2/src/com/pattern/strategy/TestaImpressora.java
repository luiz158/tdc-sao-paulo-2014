package com.pattern.strategy;

public class TestaImpressora {

	public static void main(String[] args) {
//		String tipoImpressao = "HTML";
//		String tipoImpressao = "XML";
		String tipoImpressao = "PDF";
		
		MaquinaDeImprimir maquinaDeImprimir = new MaquinaDeImprimir();
		if (tipoImpressao.equals("HTML")) {
			maquinaDeImprimir.setImpressora(new ImpressoraHtml());
		}
		else if (tipoImpressao.equals("XML")) {
			maquinaDeImprimir.setImpressora(new ImpressoraXml());
		}
		else if (tipoImpressao.equals("PDF")) {
			maquinaDeImprimir.setImpressora(new ImpressoraPdf());
		}
		else if (tipoImpressao.equals("WORD")) {
			maquinaDeImprimir.setImpressora(new ImpressoraWord());
		}
		
		maquinaDeImprimir.imprime();
	}
	
}
