package br.com.escola.designpatterns.singleton.problema;

public class EmailUtil {
	
	public EmailUtil() {
	}
	
	public void enviaEmail(String email) {
		System.out.println("email enviado para: ".concat(email));
	}

}
