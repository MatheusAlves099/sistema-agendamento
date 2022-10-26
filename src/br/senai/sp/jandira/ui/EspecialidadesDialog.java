package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusAlves
 */
public class EspecialidadesDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/br/senai/sp/jandira/imagens/agenda2.png")));
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass()
                        .getResource("/br/senai/sp/jandira/imagens/agenda2.png")));
        initComponents();

        especialidade = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoDaEsp.setText(especialidade.getDescricao());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Especialidades - " + operacao);

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

        panelEspecialidades = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricaoDaEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoDaEsp = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialidades - ADICIONAR");
        getContentPane().setLayout(null);

        panelEspecialidades.setBackground(new java.awt.Color(0, 0, 102));
        panelEspecialidades.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        labelTitulo.setText(" Especialidades - ADICIONAR");
        panelEspecialidades.add(labelTitulo);
        labelTitulo.setBounds(20, 20, 330, 29);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setBounds(0, 0, 680, 70);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes das especialidades:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
        panelDetalhes.setLayout(null);

        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(40, 50, 50, 16);

        textFieldCodigo.setEditable(false);
        panelDetalhes.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 70, 64, 22);

        labelNomeDaEspecialidade.setText("Nome da Especialidade:");
        panelDetalhes.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(40, 120, 150, 16);

        textFieldNomeDaEspecialidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(40, 140, 260, 22);

        labelDescricaoDaEspecialidade.setText("Descrição da Especialidade:");
        panelDetalhes.add(labelDescricaoDaEspecialidade);
        labelDescricaoDaEspecialidade.setBounds(40, 190, 160, 16);
        panelDetalhes.add(textFieldDescricaoDaEsp);
        textFieldDescricaoDaEsp.setBounds(40, 210, 430, 22);

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

        setSize(new java.awt.Dimension(654, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence s = " ";

        if (textFieldNomeDaEspecialidade.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo vazio!\nFavor digitar um nome da especialidade.");
            textFieldNomeDaEspecialidade.requestFocus();
            
        } else if (textFieldDescricaoDaEsp.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Campo vazio!\nFavor digitar uma operadora.");
            textFieldDescricaoDaEsp.requestFocus();

        } else if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editar();
    }//GEN-LAST:event_buttonSalvarActionPerformed
        }

    

    private void editar() {
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoDaEsp.getText());

        EspecialidadeDAO.atualizar(especialidade);

        JOptionPane.showMessageDialog(
                null,
                "Especialidade atualizada com sucesso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void adicionar() {
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoDaEsp.getText());

        // Gravar o objeto, através do DAO.
        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucessso!",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoDaEsp;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
