package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282211
 */
public class PanelPlanoDeSaude extends javax.swing.JPanel {

    private int linha;

    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tablePlanosDeSaude.getSelectedRow();
        return linha;
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanosDeSaude.getValueAt(
                getLinha(), 
                0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de planos de saude:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        setPreferredSize(new java.awt.Dimension(780, 290));
        setLayout(null);

        tablePlanosDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(10, 20, 760, 210);

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
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano de saúde que você deseja excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void editarPlanoDeSaude() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanosDeSaudeDialog planoDeSaudeDialog
                = new PlanosDeSaudeDialog(
                        null, 
                        true, 
                        planoDeSaude, 
                        OperacaoEnum.EDITAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }

    private void excluirPlanoDeSaude() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }

    }

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if (getLinha() != -1) {
            editarPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano de saúde que você deseja editar.",
                    "Planos de Saúde",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanosDeSaudeDialog planoDeSaudeDialog
                = new PlanosDeSaudeDialog(
                        null, 
                        true, 
                        OperacaoEnum.ADICIONAR);

        planoDeSaudeDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanosDeSaude());

        //definir a largura das colunas
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(200);
        tablePlanosDeSaude.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablePlanosDeSaude.getColumnModel().getColumn(4).setPreferredWidth(130);
    }

    private void ajustarTabela() {

        //impedir que o usuário movimente as colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //bloquear a edição das células da tabela
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
    }

}
