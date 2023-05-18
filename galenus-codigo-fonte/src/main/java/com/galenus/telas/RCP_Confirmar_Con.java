/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.galenus;

import java.awt.Color;

/**
 *
 * @author arthu
 */
public class RCP_Confirmar_Con extends javax.swing.JFrame {

    /**
     * Creates new form RCP_Confirmar_Con
     */
    public RCP_Confirmar_Con() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextField_Nome = new javax.swing.JTextField();
        TextField_Telefone = new javax.swing.JTextField();
        TextField_CPF = new javax.swing.JTextField();
        ComboBox_Pagamento = new javax.swing.JComboBox<>();
        ComboBox_Medico = new javax.swing.JComboBox<>();
        ComboBox_Especialidade = new javax.swing.JComboBox<>();
        ComboBox_Data_dia = new javax.swing.JComboBox<>();
        ComboBox_Data_mes = new javax.swing.JComboBox<>();
        ComboBox_Data_ano = new javax.swing.JComboBox<>();
        ComboBox_Horario = new javax.swing.JComboBox<>();
        TextField_Pagamento = new javax.swing.JTextField();
        TextField_Medico = new javax.swing.JTextField();
        TextField_Especialidade = new javax.swing.JTextField();
        TextField_Data = new javax.swing.JTextField();
        TextField_Horario = new javax.swing.JTextField();
        Button_Confirmar = new javax.swing.JButton();
        Button_Sair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextField_Nome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Nome.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Nome.setText("Nome:");
        TextField_Nome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_NomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_NomeFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 360, 50));

        TextField_Telefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Telefone.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Telefone.setText("Telefone:");
        TextField_Telefone.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_TelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_TelefoneFocusLost(evt);
            }
        });
        TextField_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_TelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 360, 50));

        TextField_CPF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_CPF.setForeground(new java.awt.Color(153, 153, 153));
        TextField_CPF.setText("CPF:");
        TextField_CPF.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_CPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_CPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_CPFFocusLost(evt);
            }
        });
        getContentPane().add(TextField_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 360, 50));

        ComboBox_Pagamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão", "Plano de Saúde", "Retorno", " " }));
        ComboBox_Pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_PagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 220, 50));

        ComboBox_Medico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_MedicoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 220, 50));

        ComboBox_Especialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_Especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_EspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 220, 50));

        ComboBox_Data_dia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Data_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ComboBox_Data_dia.setBorder(null);
        ComboBox_Data_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_Data_diaActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Data_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 70, 50));

        ComboBox_Data_mes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Data_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro ", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        ComboBox_Data_mes.setBorder(null);
        ComboBox_Data_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_Data_mesActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Data_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 510, 130, 50));

        ComboBox_Data_ano.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Data_ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        ComboBox_Data_ano.setBorder(null);
        ComboBox_Data_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_Data_anoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Data_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 90, 50));

        ComboBox_Horario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ComboBox_Horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              08 : 00", "              08 : 30", "              09 : 00", "              09 : 30", "              10 : 00", "              10 : 30", "              11 : 00", "              11 : 30", "              13 : 00", "              13 : 30", "              14 : 00", "              14 : 30", "              15 : 00", "              15 : 30", "              16 : 00", "              16 : 30", "              17 : 00" }));
        ComboBox_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_HorarioActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 220, 50));

        TextField_Pagamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Pagamento.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Pagamento.setText("Pagamento:");
        TextField_Pagamento.setFocusable(false);
        TextField_Pagamento.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 360, 50));

        TextField_Medico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Medico.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Medico.setText("Médico:");
        TextField_Medico.setFocusable(false);
        TextField_Medico.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Medico.setRequestFocusEnabled(false);
        TextField_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_MedicoActionPerformed(evt);
            }
        });
        getContentPane().add(TextField_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 360, 50));

        TextField_Especialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Especialidade.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Especialidade.setText("Especialidade:");
        TextField_Especialidade.setFocusable(false);
        TextField_Especialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Especialidade.setRequestFocusEnabled(false);
        getContentPane().add(TextField_Especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 360, 50));

        TextField_Data.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Data.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Data.setText("Data:");
        TextField_Data.setFocusable(false);
        TextField_Data.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Data.setRequestFocusEnabled(false);
        getContentPane().add(TextField_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 360, 50));

        TextField_Horario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Horario.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Horario.setText("Hora:");
        TextField_Horario.setFocusable(false);
        TextField_Horario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Horario.setRequestFocusEnabled(false);
        getContentPane().add(TextField_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 360, 50));

        Button_Confirmar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Confirmar.setText("Confirmar");
        Button_Confirmar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 160, 40));

        Button_Sair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Sair.setText("Sair");
        Button_Sair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Confirmar Consulta.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_TelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_TelefoneFocusGained
        if(TextField_Telefone.getText().equals("Telefone:")){
            TextField_Telefone.setForeground(new Color(0, 0, 0));
            TextField_Telefone.setText("");
        }
    }//GEN-LAST:event_TextField_TelefoneFocusGained

    private void TextField_TelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_TelefoneFocusLost
        if(TextField_Telefone.getText().equals("")){
            TextField_Telefone.setText("Telefone:");
            TextField_Telefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_TelefoneFocusLost

    private void TextField_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_TelefoneActionPerformed

    private void ComboBox_Data_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_Data_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_Data_mesActionPerformed

    private void ComboBox_EspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_EspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_EspecialidadeActionPerformed

    private void ComboBox_Data_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_Data_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_Data_diaActionPerformed

    private void ComboBox_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_MedicoActionPerformed

    private void TextField_NomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_NomeFocusGained
        if(TextField_Nome.getText().equals("Nome:")){
            TextField_Nome.setForeground(new Color(0, 0, 0));
            TextField_Nome.setText("");
        }
    }//GEN-LAST:event_TextField_NomeFocusGained

    private void TextField_NomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_NomeFocusLost
        if(TextField_Nome.getText().equals("")){
            TextField_Nome.setText("Nome:");
            TextField_Nome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_NomeFocusLost

    private void TextField_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_MedicoActionPerformed

    private void ComboBox_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_HorarioActionPerformed

    private void ComboBox_Data_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_Data_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_Data_anoActionPerformed

    private void TextField_CPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CPFFocusGained
        if(TextField_CPF.getText().equals("CPF:")){
            TextField_CPF.setForeground(new Color(0, 0, 0));
            TextField_CPF.setText("");
        }
    }//GEN-LAST:event_TextField_CPFFocusGained

    private void TextField_CPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CPFFocusLost
        if(TextField_CPF.getText().equals("")){
            TextField_CPF.setText("CPF:");
            TextField_CPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_CPFFocusLost

    private void TextField_PagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PagamentoActionPerformed

    private void ComboBox_PagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_PagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_PagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RCP_Confirmar_Con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RCP_Confirmar_Con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RCP_Confirmar_Con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RCP_Confirmar_Con.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RCP_Confirmar_Con().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Confirmar;
    private javax.swing.JButton Button_Sair;
    private javax.swing.JComboBox<String> ComboBox_Data_ano;
    private javax.swing.JComboBox<String> ComboBox_Data_dia;
    private javax.swing.JComboBox<String> ComboBox_Data_mes;
    private javax.swing.JComboBox<String> ComboBox_Especialidade;
    private javax.swing.JComboBox<String> ComboBox_Horario;
    private javax.swing.JComboBox<String> ComboBox_Medico;
    private javax.swing.JComboBox<String> ComboBox_Pagamento;
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JTextField TextField_CPF;
    private javax.swing.JTextField TextField_Data;
    private javax.swing.JTextField TextField_Especialidade;
    private javax.swing.JTextField TextField_Horario;
    private javax.swing.JTextField TextField_Medico;
    private javax.swing.JTextField TextField_Nome;
    private javax.swing.JTextField TextField_Pagamento;
    private javax.swing.JTextField TextField_Telefone;
    // End of variables declaration//GEN-END:variables

    private static RCP_Confirmar_Con telaUnica;
    
    public static RCP_Confirmar_Con getRcpConfirmarCon(){
        if(telaUnica == null){
            telaUnica = new RCP_Confirmar_Con();
        }
        return telaUnica;
    }

}
