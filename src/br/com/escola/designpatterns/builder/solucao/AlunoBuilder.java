package br.com.escola.designpatterns.builder.solucao;

import br.com.escola.designpatterns.builder.solucao.Aluno;

public class AlunoBuilder {
	
	private String nome;
	private String sobreNome;
	private String cpf;
	private String email;
	private int idade;
	private String apelido;
	private String telefone;
	
	public AlunoBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}
	public AlunoBuilder sobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
		return this;
	}
	public AlunoBuilder cpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
	public AlunoBuilder email(String email) {
		this.email = email;
		return this;
	}
	public AlunoBuilder idade(int idade) {
		this.idade = idade;
		return this;
	}
	public AlunoBuilder apelido(String apelido) {
		this.apelido = apelido;
		return this;
	}
	public AlunoBuilder telefone(String telefone) {
		this.telefone = telefone;
		return this;
	}
	
	public Aluno build() {
		//return new Aluno(nome, sobreNome, cpf, email, idade, apelido, telefone);
		return null;
	}

}
