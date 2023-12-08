package br.com.escola.designpatterns.staticfactorymethos.solucao;

public enum DescontoEnum {
	
	DEZ_PORCENTO(10),
	TRINTA_PORCENTO(30),
	CINQUENTA_PORCENTO(50),
	SETENTA_PORCENTO(70),
	CEM_PORCENTO(100);
	
	private int desconto;

	private DescontoEnum (int desconto) {
		this.desconto = desconto;
		
	}
	
	public int getDesconto() {
		return desconto;
	}

}
