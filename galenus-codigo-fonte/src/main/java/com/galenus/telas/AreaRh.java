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
        btVisualizarDados = new javax.swing.JButton();
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

        btVisualizarDados.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btVisualizarDados.setText("Visualizar Funcionário");
        btVisualizarDados.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btVisualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btVisualizarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 360, 50));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RH.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncionarioActionPerformed
        CadastraFuncionario cadastraFuncionario = new CadastraFuncionario();
        cadastraFuncionario.setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncionarioActionPerformed

    private void btVisualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarDadosActionPerformed
        VisualizaFuncionario alterarCadastro = new VisualizaFuncionario();
        alterarCadastro.setVisible(true);
    }//GEN-LAST:event_btVisualizarDadosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btCadastrarFuncionario;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVisualizarDados;
    // End of variables declaration//GEN-END:variables


}
