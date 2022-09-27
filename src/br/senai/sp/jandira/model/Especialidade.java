package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	private String nome;
	private String descricao;
	
	// Construtores da classe -> método construtor -> **tem que ter o MESMO NOME da classe** 
	public Especialidade(String nome) {
		this.nome = nome;
	}
	
	// Construtor default -> que não pede nada
	public Especialidade(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Especialidade() { // Construtor Default (Padrão)
		
	}
	
	// métodos de acesso aos atributos
	public void setNome(String nome) {
		
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\nDeve conter pelo menos 3 letras.");
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, "A descrição não é válida!\n Deve conter pelo menos 10 caracteres.");
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
}
