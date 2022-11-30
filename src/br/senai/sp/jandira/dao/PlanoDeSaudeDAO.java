package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    //private final static String URL = "C:\\Users\\22282211\\java\\projeto-agenda\\PlanoDeSaude.txt";
    //private final static String URL_TEMP = "C:\\Users\\22282211\\java\\projeto-agenda\\PlanoDeSaude-temp.txt";
    private final static String URL = "C:\\Users\\Matheus\\Desktop\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\Matheus\\Desktop\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static void gravar(PlanoDeSaude p) { // Create
        planosDeSaude.add(p);

        //*** GRAVAR EM ARQUIVO ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
    }

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() { // Read
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // Read

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) { // Update
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(planoDeSaudeAtualizado.getCodigo())) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoDeSaudeAtualizado);
                break;
            }

            atualizarArquivo();
        }
    }

    public static void excluir(Integer codigo) { // Delete

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                planosDeSaude.remove(p);
                break;
            }
        }

        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        // PASSO 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo temporário
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário, exceto o registro que
            // não teremos mais
            for (PlanoDeSaude p : planosDeSaude) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            // Excluir o arquivo atual
            arquivoAtual.delete();

            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Criar uma lista inicial de planos de saúde
    public static void criarListaDePlanosDeSaude() {

        //*** LEITURA DE ARQUIVO ***
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));

                // Guardar o plano de saúde na lista
                planosDeSaude.add(p);

                // Ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo.");
        }

    }

    public static DefaultTableModel getTabelaPlanosDeSaude() {

        String[] titulo = {"CÓDIGO", "NUMERO", "OPERADORA", "CATEGORIA", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude p : planosDeSaude) {
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
