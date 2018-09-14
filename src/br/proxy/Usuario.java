package br.proxy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private List<String> permicoes;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.permicoes = new ArrayList<>();
	}

	public void autorizaAcesso(String classe, String metodo) {
		permicoes.add(classe+":"+metodo);		
	}

}
