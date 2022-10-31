package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private LocalDate dataDeNascimento;
    private String telefone;
    private String rg;
    private String cpf;
    private Endereco endereco;
    private PlanoDeSaude planoDeSaude;

    public Paciente(String nome, LocalDate dataDeNascimento, String telefone, String rg, String cpf) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        gerarCodigo();
    }

    public Paciente() {
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

}
