package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PacienteDAO;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282211
 */
public class PanelPaciente extends javax.swing.JPanel {

    private int linha;

    public PanelPaciente() {
        initComponents();
        PacienteDAO.criarListaDePacientes();
        ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tablePacientes.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tablePacientes.getValueAt(
                getLinha(), 
                0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPacientes = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de pacientes:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 290));
        setLayout(null);

        tablePacientes.setBackground(new java.awt.Color(255, 255, 255));
        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        scrollPacientes.setViewportView(tablePacientes);

        add(scrollPacientes);
        scrollPacientes.setBounds(10, 20, 760, 210);

        buttonExcluir.setBackground(new java.awt.Color(0, 0, 102));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonExcluir.setBorder(new javax.swing.border.MatteBorder(null));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(630, 240, 40, 40);

        buttonEditar.setBackground(new java.awt.Color(0, 0, 102));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/editar.png"))); // NOI18N
        buttonEditar.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(680, 240, 40, 40);

        buttonAdicionar.setBackground(new java.awt.Color(0, 0, 102));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        buttonAdicionar.setToolTipText("");
        buttonAdicionar.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(730, 240, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if (getLinha() != -1) {
            excluirPaciente();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o paciente que você deseja excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void editarPaciente() {
        
        Paciente paciente = PacienteDAO.getPaciente(getCodigo());
        
        PacientesDialog pacienteDialog
                = new PacientesDialog(null, 
                        true, 
                        paciente, 
                        OperacaoEnum.EDITAR);

        pacienteDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirPaciente() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PacienteDAO.excluir(getCodigo());
            preencherTabela();
        }

    }

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if (getLinha() != -1) {
            editarPaciente();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o paciente que você deseja editar.",
                    "Planos de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PacientesDialog pacienteDialog
                = new PacientesDialog(
                        null, 
                        true, 
                        OperacaoEnum.ADICIONAR);

        pacienteDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollPacientes;
    private javax.swing.JTable tablePacientes;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tablePacientes.setModel(PacienteDAO.getTabelaPacientes());

        //definir a largura das colunas
        tablePacientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePacientes.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePacientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablePacientes.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablePacientes.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablePacientes.getColumnModel().getColumn(4).setPreferredWidth(130);
        tablePacientes.getColumnModel().getColumn(5).setPreferredWidth(130);
    }

    private void ajustarTabela() {

        //impedir que o usuário movimente as colunas
        tablePacientes.getTableHeader().setReorderingAllowed(false);

        //bloquear a edição das células da tabela
        tablePacientes.setDefaultEditor(Object.class, null);
    }

}
