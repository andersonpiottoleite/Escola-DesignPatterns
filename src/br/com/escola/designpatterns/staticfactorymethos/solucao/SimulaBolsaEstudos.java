package br.com.escola.designpatterns.staticfactorymethos.solucao;

import java.util.Calendar;

public class SimulaBolsaEstudos {
	
	public static void main(String[] args) {
		
		BolsaEstudos bolsaProuni = BolsaEstudosFactory.criaBolsaEstudosConformeTipoBolsaEDescontoPadrao(TipoBolsaEnum.PROUNI);
		System.out.println(bolsaProuni.getPorcentagemDesconto());
		
		BolsaEstudos bolsaEstudosEducamaisBrasil = BolsaEstudosFactory.criaBolsaEstudosConformeTipoBolsaEDescontoPadrao(TipoBolsaEnum.EDUCA_MAIS_BRASIL);
		System.out.println(bolsaEstudosEducamaisBrasil.getPorcentagemDesconto());
		
		BolsaEstudos bolsaComDesconto = BolsaEstudosFactory.criaBolsaEstudosConformeTipoBolsaEComDesconto(TipoBolsaEnum.EDUCA_MAIS_BRASIL, DescontoEnum.DEZ_PORCENTO);
		
		System.out.println(bolsaComDesconto.getPorcentagemDesconto());
		
		// java já usa os static factory methods...
		Calendar instance = Calendar.getInstance();
		String valoremEmString = String.valueOf("10");
	}
}
