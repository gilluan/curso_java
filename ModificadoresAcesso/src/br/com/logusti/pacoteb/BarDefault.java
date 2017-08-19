package br.com.logusti.pacoteb;

import br.com.logusti.pacotea.FooDefault;

public class BarDefault extends FooDefault {

	public BarDefault() {
		super("nome", "sobrenome");
	}
	
	
	public void usarFooDefault() {
		FooDefault fooDefault = new FooDefault("teste", "sobrenome");
		//fooDefault.
	}
	
	
}
