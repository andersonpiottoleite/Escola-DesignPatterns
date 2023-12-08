package br.com.escola.designpatterns.staticfactorymethos.problema;

public class SimulaBolsaEstudos {
	
	public static void main(String[] args) {
		
		
		BolsaEstudosProuni bolsaEstudosProuni = new BolsaEstudosProuni();
		bolsaEstudosProuni.setPorcentagemDesconto(DescontoEnum.CEM_PORCENTO);
		
		BolsaEstudosEducaMaisBrasil bolsaEstudosEducaMaisBrasil = new BolsaEstudosEducaMaisBrasil();
		bolsaEstudosEducaMaisBrasil.setPorcentagemDesconto(DescontoEnum.CINQUENTA_PORCENTO);
		
		System.out.println(bolsaEstudosProuni.getPorcentagemDesconto());
		System.out.println(bolsaEstudosEducaMaisBrasil.getPorcentagemDesconto());
	}
}
