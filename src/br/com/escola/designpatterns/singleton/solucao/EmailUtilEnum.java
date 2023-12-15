package br.com.escola.designpatterns.singleton.solucao;

public enum EmailUtilEnum {
	
	INSTANCE;

	private EmailUtilEnum() {
	}
	
	public static EmailUtilEnum getInstance() {
		return INSTANCE;
	}
	
	public void enviaEmail(String email) {
		System.out.println("email enviado para: ".concat(email));
	}

}
