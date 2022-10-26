package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    /*
    Essa classe será responsável pela persistência de dados
    dos planos de saude, por exemplo, adicionar um novo plano de saude
    excluir um plano de saude, etc.
     */
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { // Create
        planosDeSaude.add(p);
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() { // Read
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // Read

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo()== codigo) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) { // Update
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo()== planoDeSaudeAtualizado.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) { // Delete
        
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                planosDeSaude.remove(p);
                break;
            }
        }
    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaDePlanosDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Gold", "2901-0144-1414", LocalDate.of(1980, 8, 20));
        PlanoDeSaude p2 = new PlanoDeSaude("Bradesco", "Silver", "2421-1911-4040", LocalDate.of(2000, 9, 12));
        PlanoDeSaude p3 = new PlanoDeSaude("NotreDame", "Bronze", "2121-1110-0991", LocalDate.of(1999, 8, 10));
        PlanoDeSaude p4 = new PlanoDeSaude("Porto Seguro", "Gold Plus", "9013-8741-0194", LocalDate.of(1987, 7, 14));
        
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
        planosDeSaude.add(p4);
    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {
        
        String[] titulo = {"CÓDIGO", "NUMERO", "OPERADORA", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String [planosDeSaude.size()][5];
        
        for(PlanoDeSaude p : planosDeSaude){
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);
        }
        
        return new DefaultTableModel(dados, titulo);
    }
    
}
