package br.com.escola.designpatterns.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimuladorEnvioEmailAluno {
	
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		EmailUtil emailUtil = EmailUtil.getInstance();
		emailUtil.enviaEmail("piottok10@gmail.com");
		
		EmailUtil emailUtil2 = EmailUtil.getInstance();
		emailUtil2.enviaEmail("joseP89@gmail.com");
		
		EmailUtil emailUtil3 = EmailUtil.getInstance();
		emailUtil3.enviaEmail("vitoria-casc@gmail.com");

		System.out.println(emailUtil.hashCode());
		System.out.println(emailUtil2.hashCode());
		System.out.println(emailUtil3.hashCode());
		
		// tempo de compilação
		//new EmailUtil();
		
		// tempo de execução
		Constructor<?>[] constructors = EmailUtil.class.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			EmailUtil newInstance = (EmailUtil) constructor.newInstance();
			newInstance.enviaEmail("TESTE TRAVESSURA");
			System.out.println(newInstance.hashCode());
		}
		
		
		EmailUtilEnum emailUtilEnum = EmailUtilEnum.getInstance();
		emailUtilEnum.enviaEmail("teste1-protecao@gmail.com");
		
		EmailUtilEnum emailUtilEnum2 = EmailUtilEnum.INSTANCE;
		emailUtilEnum2.enviaEmail("teste2-protecao@gmail.com");
		
		EmailUtilEnum emailUtilEnum3 = EmailUtilEnum.INSTANCE;
		emailUtilEnum3.enviaEmail("teste3-protecao@gmail.com");
		
		System.out.println(emailUtilEnum.hashCode());
		System.out.println(emailUtilEnum2.hashCode());
		System.out.println(emailUtilEnum3.hashCode());
		
		/*Constructor<?>[] constructorsEnum = EmailUtilEnum.class.getDeclaredConstructors();
		for (Constructor<?> constructorEnum : constructorsEnum) {
			constructorEnum.setAccessible(true);
			EmailUtilEnum newInstance = (EmailUtilEnum) constructorEnum.newInstance();
			newInstance.enviaEmail("TESTE TRAVESSURA NO ENUM");
			System.out.println(newInstance.hashCode());
		}*/
	}
}
