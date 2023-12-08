package br.com.escola.designpatterns.staticfactorymethos.solucao;

public abstract class BolsaEstudos {

	private DescontoEnum porcentagemDesconto;

	public DescontoEnum getPorcentagemDesconto() {
		return porcentagemDesconto;
	}

	public void setPorcentagemDesconto(DescontoEnum porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}

}
