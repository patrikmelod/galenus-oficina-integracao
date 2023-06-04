package com.galenus.telas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.awt.Color;

/**
 *
 * @author arthu
 */
@Component
@Slf4j
public class AreaMedico extends javax.swing.JFrame {

    /**
     * Creates new form Med_Main
     */
    public AreaMedico() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbHorario = new javax.swing.JTable();
        txtFieldCpfBusca = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btCadConsulta = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbHorario.setFont(new java.awt.Font("Constantia", 0, 20)); // NOI18N
        tbHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHorario.setColumnSelectionAllowed(true);
        tbHorario.setGridColor(new java.awt.Color(255, 255, 255));
        tbHorario.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbHorario);
        tbHorario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 500, 340));

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
        txtFieldCpfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCpfBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldCpfBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 360, 50));

        btConsultar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btConsultar.setText("Acessar Consulta");
        btConsultar.setFocusPainted(false);
        btConsultar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 220, 50));

        btCadConsulta.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btCadConsulta.setText("Cadastrar Consulta");
        btCadConsulta.setFocusPainted(false);
        btCadConsulta.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btCadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btCadConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 220, 50));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Área do Médico.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtFieldCpfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCpfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCpfBuscaActionPerformed

    private void btCadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadConsultaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(AreaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btCadConsulta;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHorario;
    private javax.swing.JTextField txtFieldCpfBusca;
    // End of variables declaration//GEN-END:variables
}
