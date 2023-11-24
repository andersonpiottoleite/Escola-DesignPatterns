package br.com.escola.designpatterns.builder.solucao;

public class SimulaCadastroAluno {
	
	public static void main(String[] args) {
		/*
		 * uso do construtor de classe - OK
		 * necessidade de ordem dos tipos dos atributos - OK
		 * necessidade de lembranca - OK
		 * falta de intuitividade - OK
		 * erro de inversão de atributos - OK
		 * se for a classe de uma biblioteca, vc tem dificuldades de identificar qual parametros - OK
		 */

		/*
		 * uso dos sets - OK
		 * é verboso - OK
		 */
		
		
		Aluno aluno = new AlunoBuilder()
				.sobreNome("Souto")
				.email("bruno@gmail.com")
				.telefone("99999-9999")
				.apelido("Soltinho")
				.cpf("333.333.333-33")
				.idade(22)
				.nome("Bruno")
				.build();
		
		Aluno aluno2 = new Aluno.AlunoBuilderInterno()
				.sobreNome("Souto")
				.email("bruno@gmail.com")
				.telefone("99999-9999")
				.apelido("Soltinho")
				.cpf("333.333.333-33")
				.idade(22)
				.nome("Bruno")
				.build();
		
		// o java ja usa design patterns - não tenha medo irmão manda o código pa cima!
		StringBuilder sb = new StringBuilder().append("").append("").append("");
	}

}
