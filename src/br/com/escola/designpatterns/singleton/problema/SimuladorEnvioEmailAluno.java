package br.com.escola.designpatterns.singleton.problema;

public class SimuladorEnvioEmailAluno {
	
	public static void main(String[] args) {
		EmailUtil emailUtil = new EmailUtil();
		emailUtil.enviaEmail("piottok10@gmail.com");
		
		EmailUtil emailUtil2 = new EmailUtil();
		emailUtil2.enviaEmail("joseP89@gmail.com");
		
		EmailUtil emailUtil3 = new EmailUtil();
		emailUtil3.enviaEmail("vitoria-casc@gmail.com");
		
		System.out.println(emailUtil.hashCode());
		System.out.println(emailUtil2.hashCode());
		System.out.println(emailUtil3.hashCode());
	}

}
