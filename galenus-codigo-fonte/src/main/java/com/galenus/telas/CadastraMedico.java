package com.galenus.telas;

import com.galenus.model.Medico;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;


public class CadastraMedico extends javax.swing.JFrame {

    
    
    
    public CadastraMedico() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Cad = new javax.swing.JButton();
        Button_Limpar = new javax.swing.JButton();
        Button_Voltar = new javax.swing.JButton();
        textFieldNome = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldCpf = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldNascimento = new javax.swing.JTextField();
        textFieldSexo = new javax.swing.JTextField();
        textFieldEspecialidade = new javax.swing.JTextField();
        textFieldCrm = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldSenha = new javax.swing.JTextField();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Cad.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Cad.setText("Cadastrar");
        Button_Cad.setMargin(new java.awt.Insets(15, 14, 3, 14));
        getContentPane().add(Button_Cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 260, 50));

        Button_Limpar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Limpar.setText("Limpar");
        Button_Limpar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 160, 40));

        Button_Voltar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Voltar.setText("Voltar");
        Button_Voltar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        textFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNome.setText("Nome:");
        textFieldNome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNomeFocusLost(evt);
            }
        });
        getContentPane().add(textFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 360, 50));

        textFieldEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldEndereco.setForeground(new java.awt.Color(153, 153, 153));
        textFieldEndereco.setText("Endereço:");
        textFieldEndereco.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEnderecoFocusLost(evt);
            }
        });
        getContentPane().add(textFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 360, 50));

        textFieldCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldCpf.setForeground(new java.awt.Color(153, 153, 153));
        textFieldCpf.setText("CPF:");
        textFieldCpf.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCpfFocusLost(evt);
            }
        });
        getContentPane().add(textFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 360, 50));

        textFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldTelefone.setForeground(new java.awt.Color(153, 153, 153));
        textFieldTelefone.setText("Telefone:");
        textFieldTelefone.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(textFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 360, 50));

        textFieldNascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldNascimento.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNascimento.setText("Data de Nascimento:");
        textFieldNascimento.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNascimentoFocusLost(evt);
            }
        });
        getContentPane().add(textFieldNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 360, 50));

        textFieldSexo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldSexo.setForeground(new java.awt.Color(153, 153, 153));
        textFieldSexo.setText("Sexo:");
        textFieldSexo.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldSexoFocusLost(evt);
            }
        });
        getContentPane().add(textFieldSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 360, 50));

        textFieldEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldEspecialidade.setForeground(new java.awt.Color(153, 153, 153));
        textFieldEspecialidade.setText("Especialidade:");
        textFieldEspecialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEspecialidadeFocusLost(evt);
            }
        });
        getContentPane().add(textFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 360, 50));

        textFieldCrm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldCrm.setForeground(new java.awt.Color(153, 153, 153));
        textFieldCrm.setText("CRM:");
        textFieldCrm.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldCrm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldCrmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCrmFocusLost(evt);
            }
        });
        getContentPane().add(textFieldCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 360, 50));

        textFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        textFieldEmail.setText("CRM:");
        textFieldEmail.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldEmailFocusLost(evt);
            }
        });
        getContentPane().add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 360, 50));

        textFieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        textFieldSenha.setForeground(new java.awt.Color(153, 153, 153));
        textFieldSenha.setText("CRM:");
        textFieldSenha.setMargin(new java.awt.Insets(2, 10, 2, 6));
        textFieldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldSenhaFocusLost(evt);
            }
        });
        getContentPane().add(textFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 360, 50));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastrar Medico.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNomeFocusGained
        if(textFieldNome.getText().equals("Nome:")){
            textFieldNome.setForeground(new Color(0, 0, 0));
            textFieldNome.setText("");
        }
    }//GEN-LAST:event_textFieldNomeFocusGained

    private void textFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNomeFocusLost
        if(textFieldNome.getText().equals("")){
            textFieldNome.setText("Nome:");
            textFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldNomeFocusLost

    private void textFieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCpfFocusGained
        if(textFieldCpf.getText().equals("CPF:")){
            textFieldCpf.setForeground(new Color(0, 0, 0));
            textFieldCpf.setText("");
        }
    }//GEN-LAST:event_textFieldCpfFocusGained

    private void textFieldCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCpfFocusLost
        if(textFieldCpf.getText().equals("")){
            textFieldCpf.setText("CPF:");
            textFieldCpf.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldCpfFocusLost

    private void textFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEnderecoFocusGained
        if(textFieldEndereco.getText().equals("Endereço:")){
            textFieldEndereco.setForeground(new Color(0, 0, 0));
            textFieldEndereco.setText("");
        }
    }//GEN-LAST:event_textFieldEnderecoFocusGained

    private void textFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEnderecoFocusLost
        if(textFieldEndereco.getText().equals("")){
            textFieldEndereco.setText("Endereço:");
            textFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldEnderecoFocusLost

    private void textFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldTelefoneFocusGained
        if(textFieldTelefone.getText().equals("Telefone:")){
            textFieldTelefone.setForeground(new Color(0, 0, 0));
            textFieldTelefone.setText("");
        }
    }//GEN-LAST:event_textFieldTelefoneFocusGained

    private void textFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldTelefoneFocusLost
        if(textFieldTelefone.getText().equals("")){
            textFieldTelefone.setText("Telefone:");
            textFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldTelefoneFocusLost

    private void textFieldNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNascimentoFocusGained
        if(textFieldNascimento.getText().equals("Data de Nascimento:")){
            textFieldNascimento.setForeground(new Color(0, 0, 0));
            textFieldNascimento.setText("");
        }
    }//GEN-LAST:event_textFieldNascimentoFocusGained

    private void textFieldNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNascimentoFocusLost
        if(textFieldNascimento.getText().equals("")){
            textFieldNascimento.setText("Data de Nascimento:");
            textFieldNascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldNascimentoFocusLost

    private void textFieldSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSexoFocusGained
        if(textFieldSexo.getText().equals("Sexo:")){
            textFieldSexo.setForeground(new Color(0, 0, 0));
            textFieldSexo.setText("");
        }
    }//GEN-LAST:event_textFieldSexoFocusGained

    private void textFieldSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSexoFocusLost
        if(textFieldSexo.getText().equals("")){
            textFieldSexo.setText("Sexo:");
            textFieldSexo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldSexoFocusLost

    private void textFieldEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEspecialidadeFocusGained
        if(textFieldEspecialidade.getText().equals("Especialidade:")){
            textFieldEspecialidade.setForeground(new Color(0, 0, 0));
            textFieldEspecialidade.setText("");
        }
    }//GEN-LAST:event_textFieldEspecialidadeFocusGained

    private void textFieldEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEspecialidadeFocusLost
        if(textFieldEspecialidade.getText().equals("")){
            textFieldEspecialidade.setText("Especialidade:");
            textFieldEspecialidade.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldEspecialidadeFocusLost

    private void textFieldCrmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCrmFocusGained
        if(textFieldCrm.getText().equals("CRM:")){
            textFieldCrm.setForeground(new Color(0, 0, 0));
            textFieldCrm.setText("");
        }
    }//GEN-LAST:event_textFieldCrmFocusGained

    private void textFieldCrmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCrmFocusLost
        if(textFieldCrm.getText().equals("")){
            textFieldCrm.setText("CRM:");
            textFieldCrm.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_textFieldCrmFocusLost

    private void textFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailFocusGained

    private void textFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailFocusLost

    private void textFieldSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSenhaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSenhaFocusGained

    private void textFieldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldSenhaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSenhaFocusLost

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
            java.util.logging.Logger.getLogger(CadastraMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cad;
    private javax.swing.JButton Button_Limpar;
    private javax.swing.JButton Button_Voltar;
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JTextField textFieldCpf;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldEspecialidade;
    private javax.swing.JTextField textFieldNascimento;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldSenha;
    private javax.swing.JTextField textFieldSexo;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private CadastraMedico telaUnica;
    
    public CadastraMedico getRhMedicoCad(){
        if(telaUnica == null){
            telaUnica = new CadastraMedico();
        }
        return telaUnica;
    }

     private void cadEmail(Medico med){
        try{
            //med.setEmail(textFieldEmail.getText());
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Esse Email já está sendo utilizado", "ERRO de Cadastro", 0);
            textFieldEmail.setText("");
            textFieldEmail.requestFocus();
        }
    }
    
    private void cadSenha(Medico med){
        int aleatorio = (int) (0 + Math.random() * 999999);
        try{
            //med.setSenha(Integer.toString(aleatorio));
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Não foi possível cadastras a Senha", "ERRO de Cadastro", 0);
            textFieldSenha.setText("");
            textFieldSenha.requestFocus();
        }
    }
    
    private void cadCrm(Medico med){
        try{
            med.setCrm(textFieldCrm.getText());
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Esse Crm já está sendo utilizado", "ERRO de Cadastro", 0);
            textFieldCrm.setText("");
            textFieldCrm.requestFocus();
        }
    }
    
    private void cadCpf(Medico med){
        try{
            //med.setDocumento(textFieldCpf.getText());
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Esse Cpf já está sendo utilizado", "ERRO de Cadastro", 0);
            textFieldCpf.setText("");
            textFieldCpf.requestFocus();
        }
    }
    
    
}
