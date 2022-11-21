package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusAlves
 */
public class MedicosDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/br/senai/sp/jandira/imagens/medico.png")));
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass()
                        .getResource("/br/senai/sp/jandira/imagens/medico.png")));
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCRM.setText(medico.getCrm());
        textFieldNome.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        textFieldEmail.setText(medico.getEmail());
        formattedTextFieldDataDeNascimento.setText(medico.getDataDeNascimento()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void preencherTitulo() {
        labelTitulo.setText("Médicos - " + operacao);

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
        labelCRM = new javax.swing.JLabel();
        textFieldCRM = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelEmail1 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelDataDeNascimento1 = new javax.swing.JLabel();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        jScrollPaneEspecialidades = new javax.swing.JScrollPane();
        jListListaDeEspecialidades = new javax.swing.JList<>();
        labelListaDeEspecialidadesDoMedico = new javax.swing.JLabel();
        jScrollPaneEspecialidadesDoMedico = new javax.swing.JScrollPane();
        jListListaDeEspecialidadesDoMedico = new javax.swing.JList<>();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonDireita = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialidades - ADICIONAR");
        getContentPane().setLayout(null);

        panelPlanosDeSaude.setBackground(new java.awt.Color(0, 0, 102));
        panelPlanosDeSaude.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        labelTitulo.setText(" Médicos - ADICIONAR");
        panelPlanosDeSaude.add(labelTitulo);
        labelTitulo.setBounds(20, 20, 360, 29);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setBounds(0, 0, 640, 70);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes dos medicos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
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

        labelCRM.setText("CRM:");
        panelDetalhes.add(labelCRM);
        labelCRM.setBounds(150, 40, 50, 16);

        textFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCRMActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCRM);
        textFieldCRM.setBounds(150, 60, 120, 22);

        labelNome.setText("Nome do(a) médico(a):");
        panelDetalhes.add(labelNome);
        labelNome.setBounds(300, 40, 160, 16);

        textFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldNome);
        textFieldNome.setBounds(300, 60, 310, 22);

        labelTelefone.setText("Telefone:");
        panelDetalhes.add(labelTelefone);
        labelTelefone.setBounds(20, 120, 70, 16);

        textFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldTelefone);
        textFieldTelefone.setBounds(20, 140, 150, 22);

        labelEmail1.setText("E-mail:");
        panelDetalhes.add(labelEmail1);
        labelEmail1.setBounds(190, 120, 60, 16);

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldEmail);
        textFieldEmail.setBounds(190, 140, 250, 22);

        labelDataDeNascimento1.setText("Data de Nascimento:");
        panelDetalhes.add(labelDataDeNascimento1);
        labelDataDeNascimento1.setBounds(460, 120, 130, 16);

        formattedTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        panelDetalhes.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(460, 140, 140, 22);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelListaDeEspecialidades.setText("Lista de especialidades:");
        panelDetalhes.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(20, 200, 140, 16);

        jListListaDeEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fisioterapia", "Clínico Geral", "Pediatria", "Gastroenterologia", "Oftamologia" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneEspecialidades.setViewportView(jListListaDeEspecialidades);

        panelDetalhes.add(jScrollPaneEspecialidades);
        jScrollPaneEspecialidades.setBounds(20, 220, 120, 110);

        labelListaDeEspecialidadesDoMedico.setText("Especialidades do médico:");
        panelDetalhes.add(labelListaDeEspecialidadesDoMedico);
        labelListaDeEspecialidadesDoMedico.setBounds(210, 200, 160, 16);

        jScrollPaneEspecialidadesDoMedico.setViewportView(jListListaDeEspecialidadesDoMedico);

        panelDetalhes.add(jScrollPaneEspecialidadesDoMedico);
        jScrollPaneEspecialidadesDoMedico.setBounds(210, 220, 120, 110);

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

        buttonDireita.setBackground(new java.awt.Color(0, 153, 0));
        buttonDireita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonDireita.setText(">");
        buttonDireita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitaActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonDireita);
        buttonDireita.setBounds(160, 240, 30, 18);

        buttonEsquerda.setBackground(new java.awt.Color(255, 0, 51));
        buttonEsquerda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEsquerda.setText("<");
        buttonEsquerda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdaActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonEsquerda);
        buttonEsquerda.setBounds(160, 280, 30, 18);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 70, 620, 350);

        setSize(new java.awt.Dimension(654, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence s = " ";

        if (textFieldCRM.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um CRM.");
            textFieldCRM.requestFocus();

        } else if (textFieldNome.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um nome.");
            textFieldNome.requestFocus();

        } else if (textFieldTelefone.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um telefone.");
            textFieldTelefone.requestFocus();

        } else if (textFieldEmail.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um email.");
            textFieldEmail.requestFocus();

        } else if (formattedTextFieldDataDeNascimento.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar uma data de nascimento.");
            formattedTextFieldDataDeNascimento.requestFocus();

        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    }

    private void editar() {
        medico.setCrm(textFieldCRM.getText());
        medico.setNome(textFieldNome.getText());
        medico.setTelefone(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(
                null,
                "Médico atualizado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCRMActionPerformed

    private void textFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefoneActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed

    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed
        DefaultListModel listModel = new DefaultListModel();
        DefaultListModel listModelUsuario = new DefaultListModel();
        Object[] selecao = jListListaDeEspecialidades.getSelectedValues();

        for (Object valor : selecao) {
            listModelUsuario.addElement(valor);
        }
        jListListaDeEspecialidadesDoMedico.setModel(listModelUsuario);
    }//GEN-LAST:event_buttonDireitaActionPerformed

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed
        DefaultListModel listModel = new DefaultListModel();
        DefaultListModel listModelUsuario = new DefaultListModel();
        Object[] selecao = jListListaDeEspecialidadesDoMedico.getSelectedValues();
        jListListaDeEspecialidadesDoMedico.getSelectedIndex();
        for (Object valor : selecao) {
            listModelUsuario.removeElement(valor);
        }
        jListListaDeEspecialidadesDoMedico.setModel(listModelUsuario);
    }//GEN-LAST:event_buttonEsquerdaActionPerformed

    private void formattedTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldDataDeNascimentoActionPerformed

    private void adicionar() {
        // Criar um objeto medico
        Medico novoMedico = new Medico();
        novoMedico.setCrm(textFieldCRM.getText());
        novoMedico.setNome(textFieldNome.getText());
        novoMedico.setTelefone(textFieldTelefone.getText());
        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Gravar o objeto, através do DAO.
        MedicoDAO.gravar(novoMedico);
        JOptionPane.showMessageDialog(this,
                "Médico gravado com sucessso!",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JList<String> jListListaDeEspecialidades;
    private javax.swing.JList<String> jListListaDeEspecialidadesDoMedico;
    private javax.swing.JScrollPane jScrollPaneEspecialidades;
    private javax.swing.JScrollPane jScrollPaneEspecialidadesDoMedico;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento1;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelListaDeEspecialidadesDoMedico;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelPlanosDeSaude;
    private javax.swing.JTextField textFieldCRM;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

}
