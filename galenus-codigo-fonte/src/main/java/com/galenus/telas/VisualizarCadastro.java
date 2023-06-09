

package com.galenus.telas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.awt.Color;

@Component
@Slf4j
public class VisualizarCadastro extends javax.swing.JFrame {

    public VisualizarCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldCpf = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        txtFieldEndereco = new javax.swing.JTextField();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldSexo = new javax.swing.JTextField();
        txtFieldData = new javax.swing.JTextField();
        txtFieldEspecialidade = new javax.swing.JTextField();
        txtFieldCrm = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        txtFieldCpfBusca = new javax.swing.JTextField();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldCpf.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldCpf.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCpf.setText("CPF:");
        txtFieldCpf.setFocusable(false);
        txtFieldCpf.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCpfFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 360, 50));

        txtFieldTelefone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldTelefone.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldTelefone.setText("Telefone:");
        txtFieldTelefone.setFocusable(false);
        txtFieldTelefone.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 360, 50));

        txtFieldEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEndereco.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEndereco.setText("Endereço:");
        txtFieldEndereco.setFocusable(false);
        txtFieldEndereco.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEnderecoFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 360, 50));

        txtFieldNome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldNome.setText("Nome:");
        txtFieldNome.setFocusable(false);
        txtFieldNome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNomeFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 360, 50));

        txtFieldSexo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldSexo.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldSexo.setText("Sexo:");
        txtFieldSexo.setFocusable(false);
        txtFieldSexo.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldSexoFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 360, 50));

        txtFieldData.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldData.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldData.setText("Data de Nascimento:");
        txtFieldData.setFocusable(false);
        txtFieldData.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldDataFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 360, 50));

        txtFieldEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEspecialidade.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEspecialidade.setText("Especialidade:");
        txtFieldEspecialidade.setFocusable(false);
        txtFieldEspecialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 360, 50));

        txtFieldCrm.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldCrm.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCrm.setText("CRM:");
        txtFieldCrm.setFocusable(false);
        txtFieldCrm.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldCrm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCrmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCrmFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 360, 50));

        btVoltar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        btBuscar.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setFocusPainted(false);
        btBuscar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 200, 50));

        txtFieldCpfBusca.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldCpfBusca.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldCpfBusca.setText("CPF:");
        txtFieldCpfBusca.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldCpfBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCpfBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCpfBuscaFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldCpfBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 460, 50));
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusGained
        if(txtFieldEndereco.getText().equals("Endereço:")){
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusGained

    private void txtFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusLost
        if(txtFieldEndereco.getText().equals("")){
            txtFieldEndereco.setText("Endereço:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusLost

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

    private void txtFieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusGained
        if(txtFieldData.getText().equals("Data de Nascimento:")){
            txtFieldData.setForeground(new Color(0, 0, 0));
            txtFieldData.setText("");
        }
    }//GEN-LAST:event_txtFieldDataFocusGained

    private void txtFieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusLost
        if(txtFieldData.getText().equals("")){
            txtFieldData.setText("Data de Nascimento:");
            txtFieldData.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldDataFocusLost

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

    private void txtFieldCpfBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfBuscaFocusGained
        if(txtFieldCpfBusca.getText().equals("CPF:")){
            txtFieldCpfBusca.setForeground(new Color(0, 0, 0));
            txtFieldCpfBusca.setText("");
        }
    }//GEN-LAST:event_txtFieldCpfBuscaFocusGained

    private void txtFieldCpfBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfBuscaFocusLost
        if(txtFieldCpfBusca.getText().equals("")){
            txtFieldCpfBusca.setText("CPF:");
            txtFieldCpfBusca.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCpfBuscaFocusLost



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField txtFieldCpf;
    private javax.swing.JTextField txtFieldCpfBusca;
    private javax.swing.JTextField txtFieldCrm;
    private javax.swing.JTextField txtFieldData;
    private javax.swing.JTextField txtFieldEndereco;
    private javax.swing.JTextField txtFieldEspecialidade;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSexo;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables



}
