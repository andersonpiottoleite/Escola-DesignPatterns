package br.com.escola.designpatterns.builder.problema;

public class SimulaCadastroAluno {
	
	public static void main(String[] args) {
		/*
		 * uso do construtor de classe
		 * necessidade de ordem dos tipos dos atributos
		 * necessidade de lembranca
		 * falta de intuitividade
		 * erro de inversão de atributos
		 * se for a classe de uma biblioteca, vc tem dificuldades de identificar qual parametros 
		 */
		
		Aluno aluno = new Aluno("Anderson", "Piotto", "333.333.333-33", "11 97525-9353", 38, "Piolho", "piottok10@gmail");
		
		
		/*
		 * uso dos sets
		 * é verboso 
		 */
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Anderson");
		aluno2.setCpf("333.333.333-33");
		aluno2.setEmail("piottok10@gmail");
		aluno2.setIdade(38);
		aluno2.setSobreNome("Piotto");
		aluno2.setTelefone("11 97525-9353");
		aluno2.setApelido("Piolho");
		
	}

}
