package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusAlves
 */
public class PlanosDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanosDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/br/senai/sp/jandira/imagens/planoDeSaude.png")));
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanosDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass()
                        .getResource("/br/senai/sp/jandira/imagens/planoDeSaude.png")));
        initComponents();

        planoDeSaude = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        textFieldNumero.setText(planoDeSaude.getNumero());
        textFieldOperadora.setText(planoDeSaude.getOperadora());
        textFieldCategoria.setText(planoDeSaude.getCategoria());
        textFieldValidade.setText(planoDeSaude.getValidade().toString());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Planos de Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/br/senai/sp/jandira/imagens/editar.png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/br/senai/sp/jandira/imagens/add.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanosDeSaude = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialidades - ADICIONAR");
        getContentPane().setLayout(null);

        panelPlanosDeSaude.setBackground(new java.awt.Color(0, 0, 102));
        panelPlanosDeSaude.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        labelTitulo.setText(" Planos de Saude - ADICIONAR");
        panelPlanosDeSaude.add(labelTitulo);
        labelTitulo.setBounds(20, 20, 360, 29);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(0, 0, 640, 70);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes dos planos de saude:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        panelDetalhes.setLayout(null);

        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(20, 40, 50, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 60, 90, 22);

        labelNumero.setText("Número:");
        panelDetalhes.add(labelNumero);
        labelNumero.setBounds(20, 90, 50, 16);

        textFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldNumero);
        textFieldNumero.setBounds(20, 110, 190, 22);

        labelOperadora.setText("Operadora:");
        panelDetalhes.add(labelOperadora);
        labelOperadora.setBounds(20, 140, 80, 16);

        textFieldOperadora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldOperadora);
        textFieldOperadora.setBounds(20, 160, 190, 22);

        labelCategoria.setText("Categoria:");
        panelDetalhes.add(labelCategoria);
        labelCategoria.setBounds(20, 190, 60, 16);
        panelDetalhes.add(textFieldCategoria);
        textFieldCategoria.setBounds(20, 210, 190, 22);

        labelValidade.setText("Validade:");
        panelDetalhes.add(labelValidade);
        labelValidade.setBounds(20, 240, 60, 16);
        panelDetalhes.add(textFieldValidade);
        textFieldValidade.setBounds(20, 260, 190, 22);

        buttonCancelar.setBackground(new java.awt.Color(0, 0, 102));
        buttonCancelar.setForeground(new java.awt.Color(204, 204, 204));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.setMaximumSize(new java.awt.Dimension(26, 26));
        buttonCancelar.setMinimumSize(new java.awt.Dimension(26, 26));
        buttonCancelar.setPreferredSize(new java.awt.Dimension(26, 26));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(520, 300, 40, 40);

        buttonSalvar.setBackground(new java.awt.Color(0, 0, 102));
        buttonSalvar.setForeground(new java.awt.Color(204, 204, 204));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar a especialidade");
        buttonSalvar.setMaximumSize(new java.awt.Dimension(26, 26));
        buttonSalvar.setMinimumSize(new java.awt.Dimension(26, 26));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(26, 26));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(570, 300, 40, 40);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 70, 620, 350);

        setSize(new java.awt.Dimension(654, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
    }//GEN-LAST:event_buttonSalvarActionPerformed
    }

    private void editar() {
        planoDeSaude.setNumero(textFieldNumero.getText());
        planoDeSaude.setOperadora(textFieldOperadora.getText());
        planoDeSaude.setCategoria(textFieldCategoria.getText());
        planoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ISO_DATE));


        PlanoDeSaudeDAO.atualizar(planoDeSaude);

        JOptionPane.showMessageDialog(
                null,
                "Plano de saúde atualizado com sucesso!",
                "Planos de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroActionPerformed

    private void adicionar() {
        // Criar um objeto especialidade
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setNumero(textFieldNumero.getText());
        novoPlanoDeSaude.setOperadora(textFieldOperadora.getText());
        novoPlanoDeSaude.setCategoria(textFieldCategoria.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(textFieldValidade.getText(), DateTimeFormatter.ISO_DATE));

        // Gravar o objeto, através do DAO.
        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucessso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldValidade;
    // End of variables declaration//GEN-END:variables
}
