package br.com.logusti.pacotea;

public class FooDefault extends FooProtected {
	
	String sobrenome;
	
	public FooDefault (String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	void imprimeSobrenome() {
		System.out.println("Sobrenome" + this.sobrenome);
	}
	
	@Override
	protected void imprimeNome() {
			super.imprimeNome();
	}
	

}
