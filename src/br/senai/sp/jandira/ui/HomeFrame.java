package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda2.png")));
        initPanels();
    }

    // Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    
    // Constantes
    private final int POS_X = 10;
    private final int POS_Y = 150;
    private final int LARGURA = 780;
    private final int ALTURA = 290;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelText = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelSisacon = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        labelDados = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelSite = new javax.swing.JLabel();
        panelSeparador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 102));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        HeaderPanel.setLayout(null);

        labelIcon.setBackground(new java.awt.Color(255, 255, 255));
        labelIcon.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        labelIcon.setForeground(new java.awt.Color(255, 255, 255));
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda2.png"))); // NOI18N
        HeaderPanel.add(labelIcon);
        labelIcon.setBounds(30, 10, 64, 70);

        labelText.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        labelText.setForeground(new java.awt.Color(255, 255, 255));
        labelText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelText.setText("Sistema para Agendamento de Consultas");
        HeaderPanel.add(labelText);
        labelText.setBounds(100, 30, 410, 30);

        getContentPane().add(HeaderPanel);
        HeaderPanel.setBounds(0, 0, 800, 90);

        buttonHome.setBackground(new java.awt.Color(0, 0, 102));
        buttonHome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/homet-32.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar para o início.");
        buttonHome.setBorder(new javax.swing.border.MatteBorder(null));
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 100, 40, 40);

        buttonAgenda1.setBackground(new java.awt.Color(0, 0, 102));
        buttonAgenda1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonAgenda1.setForeground(new java.awt.Color(255, 255, 255));
        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda3.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Lista os agendamentos.");
        buttonAgenda1.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAgenda1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(70, 100, 40, 40);

        buttonPacientes.setBackground(new java.awt.Color(0, 0, 102));
        buttonPacientes.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonPacientes.setForeground(new java.awt.Color(255, 255, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Lista os pacientes.");
        buttonPacientes.setBorder(new javax.swing.border.MatteBorder(null));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(120, 100, 40, 40);

        buttonMedicos.setBackground(new java.awt.Color(0, 0, 102));
        buttonMedicos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonMedicos.setForeground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedicos.setToolTipText("Lista os médicos.");
        buttonMedicos.setBorder(new javax.swing.border.MatteBorder(null));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(170, 100, 40, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(0, 0, 102));
        buttonEspecialidades.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/especialidades.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Lista as especialidades.");
        buttonEspecialidades.setBorder(new javax.swing.border.MatteBorder(null));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(220, 100, 40, 40);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(0, 0, 102));
        buttonPlanoDeSaude.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonPlanoDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/planoDeSaude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Lista os planos de saúde.");
        buttonPlanoDeSaude.setBorder(new javax.swing.border.MatteBorder(null));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(270, 100, 40, 40);

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saida.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do programa.");
        buttonSair.setBorder(new javax.swing.border.MatteBorder(null));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(750, 100, 40, 40);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        panelHome.setForeground(new java.awt.Color(255, 255, 255));
        panelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelHome.setLayout(null);

        labelSisacon.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        labelSisacon.setForeground(new java.awt.Color(255, 0, 51));
        labelSisacon.setText("SISACON");
        panelHome.add(labelSisacon);
        labelSisacon.setBounds(20, 30, 180, 50);

        labelSistema.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        labelSistema.setForeground(new java.awt.Color(0, 0, 0));
        labelSistema.setText("Sistema para Agendamento de Consultas");
        panelHome.add(labelSistema);
        labelSistema.setBounds(20, 70, 270, 17);

        labelDados.setBackground(new java.awt.Color(204, 204, 204));
        labelDados.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        labelDados.setForeground(new java.awt.Color(0, 0, 0));
        labelDados.setText("Dados para contato:");
        panelHome.add(labelDados);
        labelDados.setBounds(630, 100, 130, 17);

        labelEmail.setBackground(new java.awt.Color(204, 204, 204));
        labelEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(labelEmail);
        labelEmail.setBounds(590, 120, 170, 15);

        labelTelefone.setBackground(new java.awt.Color(204, 204, 204));
        labelTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTelefone.setText("Telefone: (11) 94252-0991");
        labelTelefone.setToolTipText("");
        panelHome.add(labelTelefone);
        labelTelefone.setBounds(620, 140, 140, 15);

        labelSite.setBackground(new java.awt.Color(204, 204, 204));
        labelSite.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelSite.setForeground(new java.awt.Color(0, 0, 0));
        labelSite.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelSite.setText("Site: www.sisacon.com.br");
        panelHome.add(labelSite);
        labelSite.setBounds(630, 160, 130, 15);

        panelSeparador.setBackground(new java.awt.Color(255, 0, 51));
        panelSeparador.setMinimumSize(new java.awt.Dimension(740, 5));
        panelSeparador.setPreferredSize(new java.awt.Dimension(50, 50));
        panelSeparador.setLayout(null);
        panelHome.add(panelSeparador);
        panelSeparador.setBounds(20, 90, 740, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 150, 780, 290);
        panelHome.getAccessibleContext().setAccessibleName("Lista de especialidades:");

        setSize(new java.awt.Dimension(816, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        panelEspecialidades.setVisible(true);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(true);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel labelDados;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelSisacon;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelText;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelSeparador;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        panelEspecialidades = new PanelEspecialidades();
                panelEspecialidades.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
            
        panelPlanoDeSaude = new PanelPlanoDeSaude();
                panelPlanoDeSaude.setBounds(
                POS_X, 
                POS_Y, 
                LARGURA, 
                ALTURA);
        
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
        
    }

}
