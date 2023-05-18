/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.galenus;

import java.awt.Color;


public class Rh_Visualizar_Cad extends javax.swing.JFrame {

    public Rh_Visualizar_Cad() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextField_CPF = new javax.swing.JTextField();
        TextField_Telefone = new javax.swing.JTextField();
        TextField_Endereco = new javax.swing.JTextField();
        TextField_Nome = new javax.swing.JTextField();
        TextField_Sexo = new javax.swing.JTextField();
        TextField_Nascimento = new javax.swing.JTextField();
        TextField_Especialidade = new javax.swing.JTextField();
        TextField_CRM = new javax.swing.JTextField();
        Button_Limpar = new javax.swing.JButton();
        Button_Voltar = new javax.swing.JButton();
        Button_Buscar = new javax.swing.JButton();
        TextField_CPF_Busca = new javax.swing.JTextField();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextField_CPF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_CPF.setForeground(new java.awt.Color(153, 153, 153));
        TextField_CPF.setText("CPF:");
        TextField_CPF.setFocusable(false);
        TextField_CPF.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_CPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_CPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_CPFFocusLost(evt);
            }
        });
        getContentPane().add(TextField_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 360, 50));

        TextField_Telefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Telefone.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Telefone.setText("Telefone:");
        TextField_Telefone.setFocusable(false);
        TextField_Telefone.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_TelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_TelefoneFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 360, 50));

        TextField_Endereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Endereco.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Endereco.setText("Endereço:");
        TextField_Endereco.setFocusable(false);
        TextField_Endereco.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Endereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_EnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_EnderecoFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 360, 50));

        TextField_Nome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Nome.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Nome.setText("Nome:");
        TextField_Nome.setFocusable(false);
        TextField_Nome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_NomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_NomeFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 360, 50));

        TextField_Sexo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Sexo.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Sexo.setText("Sexo:");
        TextField_Sexo.setFocusable(false);
        TextField_Sexo.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Sexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_SexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_SexoFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 360, 50));

        TextField_Nascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Nascimento.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Nascimento.setText("Data de Nascimento:");
        TextField_Nascimento.setFocusable(false);
        TextField_Nascimento.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Nascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_NascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_NascimentoFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 360, 50));

        TextField_Especialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_Especialidade.setForeground(new java.awt.Color(153, 153, 153));
        TextField_Especialidade.setText("Especialidade:");
        TextField_Especialidade.setFocusable(false);
        TextField_Especialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_Especialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_EspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_EspecialidadeFocusLost(evt);
            }
        });
        getContentPane().add(TextField_Especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 360, 50));

        TextField_CRM.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_CRM.setForeground(new java.awt.Color(153, 153, 153));
        TextField_CRM.setText("CRM:");
        TextField_CRM.setFocusable(false);
        TextField_CRM.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_CRM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_CRMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_CRMFocusLost(evt);
            }
        });
        getContentPane().add(TextField_CRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 360, 50));

        Button_Limpar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Limpar.setText("Limpar");
        Button_Limpar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 160, 40));

        Button_Voltar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Voltar.setText("Voltar");
        Button_Voltar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Button_Buscar.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Buscar.setText("Buscar");
        Button_Buscar.setFocusPainted(false);
        Button_Buscar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 200, 50));

        TextField_CPF_Busca.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TextField_CPF_Busca.setForeground(new java.awt.Color(153, 153, 153));
        TextField_CPF_Busca.setText("CPF:");
        TextField_CPF_Busca.setMargin(new java.awt.Insets(2, 10, 2, 6));
        TextField_CPF_Busca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField_CPF_BuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField_CPF_BuscaFocusLost(evt);
            }
        });
        getContentPane().add(TextField_CPF_Busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 460, 50));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Visualizar Cadastro.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void TextField_EnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_EnderecoFocusGained
        if(TextField_Endereco.getText().equals("Endereço:")){
            TextField_Endereco.setForeground(new Color(0, 0, 0));
            TextField_Endereco.setText("");
        }
    }//GEN-LAST:event_TextField_EnderecoFocusGained

    private void TextField_EnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_EnderecoFocusLost
        if(TextField_Endereco.getText().equals("")){
            TextField_Endereco.setText("Endereço:");
            TextField_Endereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_EnderecoFocusLost

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

    private void TextField_SexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_SexoFocusGained
        if(TextField_Sexo.getText().equals("Sexo:")){
            TextField_Sexo.setForeground(new Color(0, 0, 0));
            TextField_Sexo.setText("");
        }
    }//GEN-LAST:event_TextField_SexoFocusGained

    private void TextField_SexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_SexoFocusLost
        if(TextField_Sexo.getText().equals("")){
            TextField_Sexo.setText("Sexo:");
            TextField_Sexo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_SexoFocusLost

    private void TextField_NascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_NascimentoFocusGained
        if(TextField_Nascimento.getText().equals("Data de Nascimento:")){
            TextField_Nascimento.setForeground(new Color(0, 0, 0));
            TextField_Nascimento.setText("");
        }
    }//GEN-LAST:event_TextField_NascimentoFocusGained

    private void TextField_NascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_NascimentoFocusLost
        if(TextField_Nascimento.getText().equals("")){
            TextField_Nascimento.setText("Data de Nascimento:");
            TextField_Nascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_NascimentoFocusLost

    private void TextField_EspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_EspecialidadeFocusGained
        if(TextField_Especialidade.getText().equals("Especialidade:")){
            TextField_Especialidade.setForeground(new Color(0, 0, 0));
            TextField_Especialidade.setText("");
        }
    }//GEN-LAST:event_TextField_EspecialidadeFocusGained

    private void TextField_EspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_EspecialidadeFocusLost
        if(TextField_Especialidade.getText().equals("")){
            TextField_Especialidade.setText("Especialidade:");
            TextField_Especialidade.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_EspecialidadeFocusLost

    private void TextField_CRMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CRMFocusGained
        if(TextField_CRM.getText().equals("CRM:")){
            TextField_CRM.setForeground(new Color(0, 0, 0));
            TextField_CRM.setText("");
        }
    }//GEN-LAST:event_TextField_CRMFocusGained

    private void TextField_CRMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CRMFocusLost
        if(TextField_CRM.getText().equals("")){
            TextField_CRM.setText("CRM:");
            TextField_CRM.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_CRMFocusLost

    private void TextField_CPF_BuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CPF_BuscaFocusGained
        if(TextField_CPF_Busca.getText().equals("CPF:")){
            TextField_CPF_Busca.setForeground(new Color(0, 0, 0));
            TextField_CPF_Busca.setText("");
        }
    }//GEN-LAST:event_TextField_CPF_BuscaFocusGained

    private void TextField_CPF_BuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField_CPF_BuscaFocusLost
        if(TextField_CPF_Busca.getText().equals("")){
            TextField_CPF_Busca.setText("CPF:");
            TextField_CPF_Busca.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_TextField_CPF_BuscaFocusLost

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
            java.util.logging.Logger.getLogger(Rh_Visualizar_Cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rh_Visualizar_Cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rh_Visualizar_Cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rh_Visualizar_Cad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rh_Visualizar_Cad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Buscar;
    private javax.swing.JButton Button_Limpar;
    private javax.swing.JButton Button_Voltar;
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JTextField TextField_CPF;
    private javax.swing.JTextField TextField_CPF_Busca;
    private javax.swing.JTextField TextField_CRM;
    private javax.swing.JTextField TextField_Endereco;
    private javax.swing.JTextField TextField_Especialidade;
    private javax.swing.JTextField TextField_Nascimento;
    private javax.swing.JTextField TextField_Nome;
    private javax.swing.JTextField TextField_Sexo;
    private javax.swing.JTextField TextField_Telefone;
    // End of variables declaration//GEN-END:variables

    private static Rh_Visualizar_Cad telaUnica;
    
    public static Rh_Visualizar_Cad getRhVisualizarCad(){
        if(telaUnica == null){
            telaUnica = new Rh_Visualizar_Cad();
        }
        return telaUnica;
    }










}
