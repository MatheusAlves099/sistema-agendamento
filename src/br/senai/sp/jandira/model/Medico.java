package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String telefone;
    private String email;
    private String crm;
    private ArrayList<Especialidade> especialidades;
    private LocalDate dataDeNascimento;

    public Medico(String crm, String nome, String telefone) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        gerarCodigo();
    }

    public Medico(String crm, String nome, String telefone, String email, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades, Integer codigo) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.especialidades = especialidades;
        this.contador = codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Medico() {
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

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public String convertendoArrayParaString(ArrayList<Especialidade> list) {
        ArrayList<String> codigo = new ArrayList<String>();
        for (Especialidade e : list) {
            codigo.add(e.getCodigo().toString());
        }
        
        return String.join(";", codigo);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return 
                this.codigo + ";"
                + this.crm + ";" 
                + this.nome + ";" 
                + this.telefone + ";" 
                + this.email + ";" 
                + this.dataDeNascimento + ";"
                + convertendoArrayParaString(this.especialidades);
    }

}
