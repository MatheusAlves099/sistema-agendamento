package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PacienteDAO;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author MatheusAlves
 */
public class PacientesDialog extends javax.swing.JDialog {

    private Paciente paciente;
    private OperacaoEnum operacao;

    public PacientesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png")));
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PacientesDialog(
            java.awt.Frame parent,
            boolean modal,
            Paciente p,
            OperacaoEnum operacao) {

        super(parent, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                getClass()
                        .getResource("/br/senai/sp/jandira/imagens/paciente.png")));
        initComponents();

        paciente = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textFieldCodigo.setText(paciente.getCodigo().toString());
        textFieldNome.setText(paciente.getNome());
        formattedTextFieldDataDeNascimento.setText(paciente.getDataDeNascimento()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        textFieldTelefone.setText(paciente.getTelefone());
        textFieldCpf.setText(paciente.getCpf());

    }

    private void preencherTitulo() {
        labelTitulo.setText("Pacientes - " + operacao);

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

        panelPacientes = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelDataDeNascimento = new javax.swing.JLabel();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        textFieldCpf = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        textFieldEndereco = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelPlanoDeSaude = new javax.swing.JLabel();
        textFieldPlanoDeSaude = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialidades - ADICIONAR");
        getContentPane().setLayout(null);

        panelPacientes.setBackground(new java.awt.Color(0, 0, 102));
        panelPacientes.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add.png"))); // NOI18N
        labelTitulo.setText(" Pacientes - ADICIONAR");
        panelPacientes.add(labelTitulo);
        labelTitulo.setBounds(20, 20, 360, 29);

        getContentPane().add(panelPacientes);
        panelPacientes.setBounds(0, 0, 640, 70);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes dos pacientes:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 51))); // NOI18N
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

        labelNome.setText("Nome:");
        panelDetalhes.add(labelNome);
        labelNome.setBounds(20, 90, 50, 16);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldNome);
        textFieldNome.setBounds(20, 110, 190, 22);

        labelDataDeNascimento.setText("Data de Nascimento:");
        panelDetalhes.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(20, 140, 120, 16);
        panelDetalhes.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(20, 160, 190, 22);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTelefone.setText("Telefone:");
        panelDetalhes.add(labelTelefone);
        labelTelefone.setBounds(20, 190, 60, 16);
        panelDetalhes.add(textFieldTelefone);
        textFieldTelefone.setBounds(20, 210, 190, 22);

        labelCpf.setText("CPF:");
        panelDetalhes.add(labelCpf);
        labelCpf.setBounds(20, 240, 60, 16);

        textFieldCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCpfActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCpf);
        textFieldCpf.setBounds(20, 260, 190, 22);

        labelEndereco.setText("Endereco:");
        panelDetalhes.add(labelEndereco);
        labelEndereco.setBounds(350, 50, 60, 16);

        textFieldEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnderecoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldEndereco);
        textFieldEndereco.setBounds(350, 70, 190, 22);

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

        labelPlanoDeSaude.setText("Plano de Saúde:");
        panelDetalhes.add(labelPlanoDeSaude);
        labelPlanoDeSaude.setBounds(350, 120, 100, 16);

        textFieldPlanoDeSaude.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPlanoDeSaudeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldPlanoDeSaude);
        textFieldPlanoDeSaude.setBounds(350, 140, 190, 22);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 70, 620, 350);
        panelDetalhes.getAccessibleContext().setAccessibleName("Detalhes dos pacientes:");

        setSize(new java.awt.Dimension(654, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCpfActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        CharSequence s = " ";

        if (textFieldNome.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um nome.");
            textFieldNome.requestFocus();

        } else if (textFieldCpf.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar uma cpf.");
            textFieldCpf.requestFocus();

        } else if (textFieldTelefone.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null,
                    "Campo vazio!\nFavor digitar um telefone.");
            textFieldTelefone.requestFocus();

        } else if (formattedTextFieldDataDeNascimento.getText().contains(s) == true) {
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
        paciente.setNome(textFieldNome.getText());
        paciente.setCpf(textFieldCpf.getText());
        paciente.setTelefone(textFieldTelefone.getText());
        paciente.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PacienteDAO.atualizar(paciente);

        JOptionPane.showMessageDialog(
                null,
                "Paciente atualizado com sucesso!",
                "Pacientes",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnderecoActionPerformed

    private void textFieldPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPlanoDeSaudeActionPerformed

    private void adicionar() {
        // Criar um objeto especialidade
        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(textFieldNome.getText());
        novoPaciente.setCpf(textFieldCpf.getText());
        novoPaciente.setTelefone(textFieldTelefone.getText());
        novoPaciente.setDataDeNascimento(LocalDate.parse(
                formattedTextFieldDataDeNascimento.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Gravar o objeto, através do DAO.
        PacienteDAO.gravar(novoPaciente);
        JOptionPane.showMessageDialog(this,
                "Paciente gravado com sucessso!",
                "Paciente",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPlanoDeSaude;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelPacientes;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCpf;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPlanoDeSaude;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
