package br.com.logusti.pacoteb;

import br.com.logusti.pacotea.FooProtected;
import br.com.logusti.pacotea.Teste;



@Teste
public class Bar extends FooProtected {
	public Bar(String nome) {
		this.nome = nome;
	}
}
