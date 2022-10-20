package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade
    excluir uma especialidade, etc.
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { // Create
        especialidades.add(e);
    }

    public static ArrayList<Especialidade> getEspecialidades() { // Read
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { // Read

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) { // Update
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) { // Delete

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida e estuda do coração.");
        Especialidade e2 = new Especialidade("Otorrinolaringologia", "Cuida e estuda doenças do ouvido.");
        Especialidade e3 = new Especialidade("Pediatria", "Cuida e estuda as doenças das crianças.");
        Especialidade e4 = new Especialidade("Nefrologia", "Cuida e estuda do rim.");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }

    public static DefaultTableModel getTabelaEspecialidades() {
        
        String[] titulo = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String [especialidades.size()][3];
        
        for(Especialidade e : especialidades){
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
        }
        
        return new DefaultTableModel(dados, titulo);
    }
    
}
