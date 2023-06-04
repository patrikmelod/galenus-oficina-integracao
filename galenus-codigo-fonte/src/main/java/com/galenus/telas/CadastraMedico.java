package com.galenus.telas;

import com.galenus.model.Medico;
import java.awt.Color;
import javax.swing.JOptionPane;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CadastraMedico extends javax.swing.JFrame {

    
    
    
    public CadastraMedico() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        txtFieldNome = new javax.swing.JTextField();
        ttFieldEndereco = new javax.swing.JTextField();
        txtFieldCpf = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        txtFieldNascimento = new javax.swing.JTextField();
        txtFieldSexo = new javax.swing.JTextField();
        txtFieldEspecialidade = new javax.swing.JTextField();
        txtFieldCrm = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldSenha = new javax.swing.JTextField();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCadastrar.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setMargin(new java.awt.Insets(15, 14, 3, 14));
        getContentPane().add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 260, 50));

        btVoltar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        txtFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldNome.setText("Nome:");
        txtFieldNome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNomeFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 360, 50));

        ttFieldEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ttFieldEndereco.setForeground(new java.awt.Color(153, 153, 153));
        ttFieldEndereco.setText("Endereço:");
        ttFieldEndereco.setMargin(new java.awt.Insets(2, 10, 2, 6));
        ttFieldEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ttFieldEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ttFieldEnderecoFocusLost(evt);
            }
        });
        getContentPane().add(ttFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 360, 50));

        txtFieldCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldCpf.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCpf.setText("CPF:");
        txtFieldCpf.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCpfFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 360, 50));

        txtFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldTelefone.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldTelefone.setText("Telefone:");
        txtFieldTelefone.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 360, 50));

        txtFieldNascimento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldNascimento.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldNascimento.setText("Data de Nascimento:");
        txtFieldNascimento.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNascimentoFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 360, 50));

        txtFieldSexo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldSexo.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldSexo.setText("Sexo:");
        txtFieldSexo.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldSexoFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 360, 50));

        txtFieldEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEspecialidade.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEspecialidade.setText("Especialidade:");
        txtFieldEspecialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 360, 50));

        txtFieldCrm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldCrm.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCrm.setText("CRM:");
        txtFieldCrm.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldCrm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCrmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCrmFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 360, 50));

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

    private void txtFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusGained
        if(txtFieldNome.getText().equals("Nome:")){
            txtFieldNome.setForeground(new Color(0, 0, 0));
            txtFieldNome.setText("");
        }
    }//GEN-LAST:event_txtFieldNomeFocusGained

    private void txtFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusLost
        if(txtFieldNome.getText().equals("")){
            txtFieldNome.setText("Nome:");
            txtFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNomeFocusLost

    private void txtFieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfFocusGained
        if(txtFieldCpf.getText().equals("CPF:")){
            txtFieldCpf.setForeground(new Color(0, 0, 0));
            txtFieldCpf.setText("");
        }
    }//GEN-LAST:event_txtFieldCpfFocusGained

    private void txtFieldCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfFocusLost
        if(txtFieldCpf.getText().equals("")){
            txtFieldCpf.setText("CPF:");
            txtFieldCpf.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCpfFocusLost

    private void ttFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ttFieldEnderecoFocusGained
        if(ttFieldEndereco.getText().equals("Endereço:")){
            ttFieldEndereco.setForeground(new Color(0, 0, 0));
            ttFieldEndereco.setText("");
        }
    }//GEN-LAST:event_ttFieldEnderecoFocusGained

    private void ttFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ttFieldEnderecoFocusLost
        if(ttFieldEndereco.getText().equals("")){
            ttFieldEndereco.setText("Endereço:");
            ttFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_ttFieldEnderecoFocusLost

    private void txtFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusGained
        if(txtFieldTelefone.getText().equals("Telefone:")){
            txtFieldTelefone.setForeground(new Color(0, 0, 0));
            txtFieldTelefone.setText("");
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusGained

    private void txtFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusLost
        if(txtFieldTelefone.getText().equals("")){
            txtFieldTelefone.setText("Telefone:");
            txtFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusLost

    private void txtFieldNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusGained
        if(txtFieldNascimento.getText().equals("Data de Nascimento:")){
            txtFieldNascimento.setForeground(new Color(0, 0, 0));
            txtFieldNascimento.setText("");
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusGained

    private void txtFieldNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusLost
        if(txtFieldNascimento.getText().equals("")){
            txtFieldNascimento.setText("Data de Nascimento:");
            txtFieldNascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusLost

    private void txtFieldSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSexoFocusGained
        if(txtFieldSexo.getText().equals("Sexo:")){
            txtFieldSexo.setForeground(new Color(0, 0, 0));
            txtFieldSexo.setText("");
        }
    }//GEN-LAST:event_txtFieldSexoFocusGained

    private void txtFieldSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSexoFocusLost
        if(txtFieldSexo.getText().equals("")){
            txtFieldSexo.setText("Sexo:");
            txtFieldSexo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldSexoFocusLost

    private void txtFieldEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusGained
        if(txtFieldEspecialidade.getText().equals("Especialidade:")){
            txtFieldEspecialidade.setForeground(new Color(0, 0, 0));
            txtFieldEspecialidade.setText("");
        }
    }//GEN-LAST:event_txtFieldEspecialidadeFocusGained

    private void txtFieldEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusLost
        if(txtFieldEspecialidade.getText().equals("")){
            txtFieldEspecialidade.setText("Especialidade:");
            txtFieldEspecialidade.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEspecialidadeFocusLost

    private void txtFieldCrmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCrmFocusGained
        if(txtFieldCrm.getText().equals("CRM:")){
            txtFieldCrm.setForeground(new Color(0, 0, 0));
            txtFieldCrm.setText("");
        }
    }//GEN-LAST:event_txtFieldCrmFocusGained

    private void txtFieldCrmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCrmFocusLost
        if(txtFieldCrm.getText().equals("")){
            txtFieldCrm.setText("CRM:");
            txtFieldCrm.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCrmFocusLost

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldSenha;
    private javax.swing.JTextField ttFieldEndereco;
    private javax.swing.JTextField txtFieldCpf;
    private javax.swing.JTextField txtFieldCrm;
    private javax.swing.JTextField txtFieldEspecialidade;
    private javax.swing.JTextField txtFieldNascimento;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSexo;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables

 
    
    
}
