package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtores da classe -> método construtor -> **tem que ter o MESMO NOME da classe** 
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }

    public Especialidade() { // Construtor default (padrão) -> que não pede nada
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    // métodos de acesso aos atributos
    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }
    
    public String toString() {
        return nome;
    }

    public void setDescricao(String descricao) {

        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não é uma descrição válida!\n Favor digitar novamente.",
                    "Erro",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }

}
