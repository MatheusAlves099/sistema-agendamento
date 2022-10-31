package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {

    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo plano de saude
    excluir um plano de saude, etc.
     */
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void gravar(Paciente p) { // Create
        pacientes.add(p);
    }

    public static ArrayList<Paciente> getPaciente() { // Read
        return pacientes;
    }

    public static Paciente getPaciente(Integer codigo) { // Read

        for (Paciente p : pacientes) {
            if (p.getCodigo()== codigo) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(Paciente pacienteAtualizado) { // Update
        for (Paciente p : pacientes) {
            if (p.getCodigo()== pacienteAtualizado.getCodigo()) {
                pacientes.set(pacientes.indexOf(p), pacienteAtualizado);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) { // Delete
        
        for (Paciente p : pacientes) {
            if (p.getCodigo() == codigo) {
                pacientes.remove(p);
                break;
            }
        }
    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDePacientes() {
        Paciente p1 = new Paciente("Joaquim Phoenix", LocalDate.of(1978, 10, 20), "(11)95653-1444", "14523626", "51521256");
        Paciente p2 = new Paciente("Joana Teixeira", LocalDate.of(1987, 12, 10), "(11)98787-1313", "14145536", "86724141");
        Paciente p3 = new Paciente("Luis Inácio", LocalDate.of(1990, 11, 29), "(11)99000-1313", "415262612", "51570135");
        Paciente p4 = new Paciente("Kiara Oliveira", LocalDate.of(1999, 12, 07), "(20)97777-8888", "514153241", "941401535");
        
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
    }

    public static DefaultTableModel getTabelaPacientes() {
        
        String[] titulo = {"CÓDIGO", "NOME", "DATA DE NASCIMENTO", "TELEFONE", "CPF", "PLANO DE SAÚDE"};
        String[][] dados = new String [pacientes.size()][6];
        
        for(Paciente p : pacientes){
            int i = pacientes.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNome();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][2] = p.getDataDeNascimento().format(barra);
            dados[i][3] = p.getTelefone();
            dados[i][4] = p.getCpf();
        }
        
        return new DefaultTableModel(dados, titulo);
    }
    
}
