package br.com.escola.designpatterns.builder.problema;

public class Aluno {

	private String nome;
	private String sobreNome;
	private String cpf;
	private String email;
	private int idade;
	private String apelido;
	private String telefone;

	public Aluno() {
	}

	public Aluno(String nome, String sobreNome, String cpf, String email, int idade, String apelido, String telefone) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.apelido = apelido;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
