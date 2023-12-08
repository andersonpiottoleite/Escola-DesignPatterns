package br.com.escola.designpatterns.staticfactorymethos.solucao;

public class BolsaEstudosFactory {

	public static BolsaEstudos criaBolsaEstudosConformeTipoBolsaEDescontoPadrao(TipoBolsaEnum tipoBolsa) {
		BolsaEstudos bolsaEstudos = null;
		
		if (TipoBolsaEnum.PROUNI.equals(tipoBolsa)) {
			bolsaEstudos = new BolsaEstudosProuni();
			bolsaEstudos.setPorcentagemDesconto(DescontoEnum.CEM_PORCENTO);

		} else if (TipoBolsaEnum.EDUCA_MAIS_BRASIL.equals(tipoBolsa)) {
			bolsaEstudos = new BolsaEstudosEducaMaisBrasil();
			bolsaEstudos.setPorcentagemDesconto(DescontoEnum.CINQUENTA_PORCENTO);
		}

		return bolsaEstudos;
	}
	
	public static BolsaEstudos criaBolsaEstudosConformeTipoBolsaEComDesconto(TipoBolsaEnum tipoBolsa, DescontoEnum descontoEnum) {
		if(descontoEnum == null) {
			throw new IllegalArgumentException("Você precisa informar um desconto seu getne boa!");
		}
		BolsaEstudos bolsaEstudos = null;
		
		if (TipoBolsaEnum.PROUNI.equals(tipoBolsa)) {
			bolsaEstudos = new BolsaEstudosProuni();
			bolsaEstudos.setPorcentagemDesconto(descontoEnum);

		} else if (TipoBolsaEnum.EDUCA_MAIS_BRASIL.equals(tipoBolsa)) {
			bolsaEstudos = new BolsaEstudosEducaMaisBrasil();
			bolsaEstudos.setPorcentagemDesconto(descontoEnum);
		}

		return bolsaEstudos;
	}

}
