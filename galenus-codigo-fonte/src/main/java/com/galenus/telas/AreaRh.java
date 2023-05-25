package com.galenus.telas;


public class AreaRh extends javax.swing.JFrame {

    
    public AreaRh() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Cad_Fun = new javax.swing.JButton();
        Button_Alterar_Dados = new javax.swing.JButton();
        Button_Cad_Med = new javax.swing.JButton();
        Button_Visualizar_Cad = new javax.swing.JButton();
        Button_Sair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Cad_Fun.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Cad_Fun.setText("Cadastrar Funcionário");
        Button_Cad_Fun.setMargin(new java.awt.Insets(15, 14, 3, 14));
        Button_Cad_Fun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Cad_FunActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Cad_Fun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 360, 50));

        Button_Alterar_Dados.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Alterar_Dados.setText("Alterar Dados");
        Button_Alterar_Dados.setMargin(new java.awt.Insets(15, 14, 3, 14));
        Button_Alterar_Dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Alterar_DadosActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Alterar_Dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 360, 50));

        Button_Cad_Med.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Cad_Med.setText("Cadastrar Médico");
        Button_Cad_Med.setMargin(new java.awt.Insets(15, 14, 3, 14));
        Button_Cad_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Cad_MedActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Cad_Med, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 360, 50));

        Button_Visualizar_Cad.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        Button_Visualizar_Cad.setText("Visualizar Cadastro");
        Button_Visualizar_Cad.setMargin(new java.awt.Insets(15, 14, 3, 14));
        Button_Visualizar_Cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Visualizar_CadActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Visualizar_Cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 360, 50));

        Button_Sair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        Button_Sair.setText("Sair");
        Button_Sair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(Button_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RH.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Cad_FunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Cad_FunActionPerformed
        CadastraFuncionario.getRhFuncionarioCad().setVisible(true);
    }//GEN-LAST:event_Button_Cad_FunActionPerformed

    private void Button_Cad_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Cad_MedActionPerformed
        CadastraMedico telaMed = new CadastraMedico();
        telaMed.getRhMedicoCad().setVisible(true);
    }//GEN-LAST:event_Button_Cad_MedActionPerformed

    private void Button_Alterar_DadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Alterar_DadosActionPerformed
        AlterarCadastro.getRhAlterarCad().setVisible(true);
    }//GEN-LAST:event_Button_Alterar_DadosActionPerformed

    private void Button_Visualizar_CadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Visualizar_CadActionPerformed
        VisualizarCadastro.getRhVisualizarCad().setVisible(true);
    }//GEN-LAST:event_Button_Visualizar_CadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaRh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaRh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaRh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaRh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaRh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Alterar_Dados;
    private javax.swing.JButton Button_Cad_Fun;
    private javax.swing.JButton Button_Cad_Med;
    private javax.swing.JButton Button_Sair;
    private javax.swing.JButton Button_Visualizar_Cad;
    private javax.swing.JLabel Label_fundo;
    // End of variables declaration//GEN-END:variables

    
    private static AreaRh telaUnica;
    
    public static AreaRh getRhMain(){
        if(telaUnica == null){
            telaUnica = new AreaRh();
        }              
        return telaUnica;        
    }













}
