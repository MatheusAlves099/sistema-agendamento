package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	private String nome;
	private String descricao;
	
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
