package br.com.logusti.test;

public class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome + "-modificado";
	}
		
	public String getNome() {
		return nome;
	}
		
}
