package com.galenus.telas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AreaRh extends javax.swing.JFrame {

    
    public AreaRh() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrarFuncionario = new javax.swing.JButton();
        btAlterarDados = new javax.swing.JButton();
        btCadastrarMedico = new javax.swing.JButton();
        btVisualizarCadastro = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCadastrarFuncionario.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCadastrarFuncionario.setText("Cadastrar Funcionário");
        btCadastrarFuncionario.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 360, 50));

        btAlterarDados.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btAlterarDados.setText("Alterar Dados");
        btAlterarDados.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 360, 50));

        btCadastrarMedico.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCadastrarMedico.setText("Cadastrar Médico");
        btCadastrarMedico.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btCadastrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 360, 50));

        btVisualizarCadastro.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btVisualizarCadastro.setText("Visualizar Cadastro");
        btVisualizarCadastro.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btVisualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btVisualizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 360, 50));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RH.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncionarioActionPerformed

    }//GEN-LAST:event_btCadastrarFuncionarioActionPerformed

    private void btCadastrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarMedicoActionPerformed

    }//GEN-LAST:event_btCadastrarMedicoActionPerformed

    private void btAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarDadosActionPerformed
 
    }//GEN-LAST:event_btAlterarDadosActionPerformed

    private void btVisualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarCadastroActionPerformed

    }//GEN-LAST:event_btVisualizarCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btAlterarDados;
    private javax.swing.JButton btCadastrarFuncionario;
    private javax.swing.JButton btCadastrarMedico;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVisualizarCadastro;
    // End of variables declaration//GEN-END:variables















}
