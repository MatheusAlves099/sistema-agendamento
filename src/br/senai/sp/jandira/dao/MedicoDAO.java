package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Especialidade;
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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282211\\java\\projeto-agenda\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282211\\java\\projeto-agenda\\Medico-temp.txt";
    //private final static String URL = "C:\\Users\\Matheus\\Desktop\\Medico.txt";
    //private final static String URL_TEMP = "C:\\Users\\Matheus\\Desktop\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void gravar(Medico m) { // Create
        medicos.add(m);

        //*** GRAVAR EM ARQUIVO ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
        }
    }

    public static ArrayList<Medico> getMedico() { // Read
        return medicos;
    }

    public static Medico getMedico(Integer codigo) { // Read

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }

        return null;
    }

    public static void atualizar(Medico medicoAtualizado) { // Update
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }

            atualizarArquivo();
        }
    }

    public static void excluir(Integer codigo) { // Delete

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
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
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            // Excluir o arquivo atual
            arquivoAtual.delete();

            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Criar uma lista inicial de medicos
    public static void criarListaDeMedicos() {

        //*** LEITURA DE ARQUIVO ***
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Medico m = new Medico(
                        vetor[1], 
                        vetor[2], 
                        vetor[3], 
                        vetor[4], 
                        LocalDate.parse(vetor[5]), 
                        codigoSeparado(linha), 
                        Integer.valueOf(vetor[0]));

                // Guardar o plano de saúde na lista
                medicos.add(m);

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

    public static DefaultTableModel getTabelaMedicos() {

        String[] titulo = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][5];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();

            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            dados[i][4] = m.getDataDeNascimento().format(barra);
            i++;
        }

        return new DefaultTableModel(dados, titulo);
    }

    public static ArrayList<Especialidade> codigoSeparado(String linha) {
        String[] vetor = linha.split(";");

        int codigoDaEspecialidade = 6;

        ArrayList<Especialidade> codigos = new ArrayList<>();
        while (codigoDaEspecialidade < vetor.length) {
            codigos.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoDaEspecialidade])));
            codigoDaEspecialidade++;
        }
        return codigos;
    }

    public static DefaultListModel<Especialidade> getListaEspecialidades() {

        DefaultListModel<Especialidade> listaDeEspecialidades = new DefaultListModel<Especialidade>();
        
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            for (Especialidade percorrer : codigoSeparado(linha)) {
                listaDeEspecialidades.addElement(percorrer);
            }
            
            leitor.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro, favor tentar montar a lista novamente.");
        }
        return listaDeEspecialidades;
    }
    
        public static Path getPath() {
        return PATH;
    }

}
