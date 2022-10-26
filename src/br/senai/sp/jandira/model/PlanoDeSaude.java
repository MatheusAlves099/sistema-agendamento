package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PlanoDeSaude {

    private static int contador = 99;
    private Integer codigo;
    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        gerarCodigo();
    }

    public PlanoDeSaude() {
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setOperadora(String operadora) {
            this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
            this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
            this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
            this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

}
