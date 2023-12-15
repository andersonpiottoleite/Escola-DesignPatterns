package br.com.escola.designpatterns.singleton.solucao;

public class EmailUtil {
	
	private static EmailUtil INSTANCE = null; // LAZY
	//private static EmailUtil INSTANCE = new EmailUtil(); // EAGER

	private EmailUtil() {
	}
	
	public static EmailUtil getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EmailUtil();
		}
		return INSTANCE;
	}
	
	public void enviaEmail(String email) {
		System.out.println("email enviado para: ".concat(email));
	}

}
