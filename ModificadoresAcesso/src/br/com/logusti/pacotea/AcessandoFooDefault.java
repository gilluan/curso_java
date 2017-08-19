package br.com.logusti.pacotea;

public class AcessandoFooDefault extends FooDefault {

	public AcessandoFooDefault() {
		super("nome", "sobrenome");
		this.sobrenome = "outro sobrenome";
	}
	
	@Override
	void imprimeSobrenome() {
		super.imprimeSobrenome();
	}
	
	
	
	public void usarFooDefault() {
		FooDefault fooDefault = new FooDefault("teste", "sobrenome");
		fooDefault.nome = "antonio";
		fooDefault.sobrenome = "teste";
		fooDefault.imprimeNome();
		fooDefault.imprimeSobrenome();
	}
}
