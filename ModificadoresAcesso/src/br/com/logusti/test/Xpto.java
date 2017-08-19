package br.com.logusti.test;
import br.com.logusti.pacotea.FooPublic;
import br.com.logusti.pacotea.FooDefault;
import br.com.logusti.pacotea.FooProtected;


public class Xpto extends FooProtected {
	
	
	
	public static void main(String[] args) {
//		FooProtected fooA = new FooProtected();
//		FooDefault fooDefault = new FooDefault("Jose", "Antonio");
//		
		
		Pessoa pessoa = new Pessoa("gilluan");
		
		System.out.println(pessoa.getNome());
		//pessoa.setNome("gilluan");
		System.out.println(pessoa.getNome());
		
	}
	
	
	
	
	
	
	
	
	
	
}
