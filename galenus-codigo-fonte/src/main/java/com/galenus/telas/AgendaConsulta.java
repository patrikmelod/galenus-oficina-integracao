/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.galenus.telas;

import com.galenus.dao.AgendaPrimeiraDAO;
import com.galenus.dao.FuncionarioDAO;
import com.galenus.dao.MedicoDAO;
import com.galenus.model.AgendaPrimeira;
import com.galenus.model.Funcionario;
import com.galenus.model.Medico;
import com.galenus.util.NumUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.sql.Timestamp;

/**
 * @author arthu
 */
@Component
@Slf4j
public class AgendaConsulta extends javax.swing.JFrame {

    private final MedicoDAO medicoDAO = new MedicoDAO();
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private final AgendaPrimeiraDAO agendaPrimeiraDAO = new AgendaPrimeiraDAO();

    /**
     * Creates new form RCP_Cad_Agendar_Con
     */
    public AgendaConsulta() {
        initComponents();
        cBoxMedico.removeAllItems();
        cBoxEspecialidade.removeAllItems();
        cBoxEspecialidade.addItem("");
        cBoxMedico.addItem("");

        for (Medico medico : medicoDAO.getAll()) {
            cBoxEspecialidade.addItem(medico.getEspecialidade());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        cBoxMes = new javax.swing.JComboBox<>();
        cBoxDia = new javax.swing.JComboBox<>();
        cBoxAno = new javax.swing.JComboBox<>();
        cBoxHora = new javax.swing.JComboBox<>();
        cBoxMedico = new javax.swing.JComboBox<>();
        cBoxEspecialidade = new javax.swing.JComboBox<>();
        txtFieldHora = new javax.swing.JTextField();
        txtFieldMedico = new javax.swing.JTextField();
        txtFieldData = new javax.swing.JTextField();
        txtFieldEspecialidade = new javax.swing.JTextField();
        btAgendar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 360, 50));

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
        txtFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 360, 50));

        cBoxMes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Janeiro ", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
        cBoxMes.setBorder(null);
        cBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 480, 130, 50));

        cBoxDia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        cBoxDia.setBorder(null);
        cBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 70, 50));

        cBoxAno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        cBoxAno.setBorder(null);
        cBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAnoActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 90, 50));

        cBoxHora.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"08:00", "08  30", "              09 : 00", "              09 : 30", "              10 : 00", "              10 : 30", "              11 : 00", "              11 : 30", "              13 : 00", "              13 : 30", "              14 : 00", "              14 : 30", "              15 : 00", "              15 : 30", "              16 : 00", "              16 : 30", "              17 : 00"}));
        cBoxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 220, 50));

        cBoxMedico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        cBoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 220, 50));

        cBoxEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        cBoxEspecialidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxEspecialidadeItemStateChanged(evt);
            }
        });
        cBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 220, 50));

        txtFieldHora.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldHora.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldHora.setText("Hora:");
        txtFieldHora.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldHora.setRequestFocusEnabled(false);
        txtFieldHora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldHoraFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldHoraFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 360, 50));

        txtFieldMedico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldMedico.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldMedico.setText("Médico:");
        txtFieldMedico.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldMedico.setRequestFocusEnabled(false);
        txtFieldMedico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldMedicoFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldMedicoFocusLost(evt);
            }
        });
        txtFieldMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 360, 50));

        txtFieldData.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldData.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldData.setText("Data:");
        txtFieldData.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldData.setRequestFocusEnabled(false);
        txtFieldData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldDataFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldDataFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 360, 50));

        txtFieldEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEspecialidade.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEspecialidade.setText("Especialidade:");
        txtFieldEspecialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEspecialidade.setRequestFocusEnabled(false);
        txtFieldEspecialidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEspecialidadeFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 360, 50));

        btAgendar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btAgendar.setText("Agendar");
        btAgendar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 160, 40));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agencia Consulta.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusGained
        if (txtFieldNome.getText().equals("Nome:")) {
            txtFieldNome.setForeground(new Color(0, 0, 0));
            txtFieldNome.setText("");
        }
    }//GEN-LAST:event_txtFieldNomeFocusGained

    private void txtFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusLost
        if (txtFieldNome.getText().equals("")) {
            txtFieldNome.setText("Nome:");
            txtFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNomeFocusLost

    private void txtFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusGained
        if (txtFieldTelefone.getText().equals("Telefone:")) {
            txtFieldTelefone.setForeground(new Color(0, 0, 0));
            txtFieldTelefone.setText("");
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusGained

    private void txtFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusLost
        if (txtFieldTelefone.getText().equals("")) {
            txtFieldTelefone.setText("Telefone:");
            txtFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusLost

    private void txtFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTelefoneActionPerformed

    private void txtFieldEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEspecialidadeFocusGained

    private void txtFieldEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEspecialidadeFocusLost

    private void cBoxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxEspecialidadeActionPerformed

    }//GEN-LAST:event_cBoxEspecialidadeActionPerformed

    private void txtFieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDataFocusGained

    private void txtFieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDataFocusLost

    private void txtFieldMedicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldMedicoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMedicoFocusGained

    private void txtFieldMedicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldMedicoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMedicoFocusLost

    private void txtFieldMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMedicoActionPerformed

    private void cBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxDiaActionPerformed

    private void cBoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMedicoActionPerformed


    }//GEN-LAST:event_cBoxMedicoActionPerformed

    private void cBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxMesActionPerformed

    private void cBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxAnoActionPerformed

    private void txtFieldHoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldHoraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldHoraFocusGained

    private void txtFieldHoraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldHoraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldHoraFocusLost

    private void cBoxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxHoraActionPerformed

    private void cBoxEspecialidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxEspecialidadeItemStateChanged
        cBoxMedico.removeAllItems();
        for (Funcionario funcionario : funcionarioDAO.getAllMedicos((String) cBoxEspecialidade.getSelectedItem())) {
            cBoxMedico.addItem(funcionario.getNome());
        }
    }//GEN-LAST:event_cBoxEspecialidadeItemStateChanged

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        AgendaPrimeira agendaPrimeira = new AgendaPrimeira();
        Medico medico = medicoDAO.getByName((String) cBoxMedico.getSelectedItem());

        agendaPrimeira.setNomePaciente(txtFieldNome.getText());
        agendaPrimeira.setTelefone(txtFieldTelefone.getText());
        agendaPrimeira.setMedicoCrm(medico.getCrm());
        agendaPrimeira.setDataHora(Timestamp.valueOf(cBoxAno.getSelectedItem() + "-" + new NumUtil().parseMonth((String) cBoxMes.getSelectedItem()) + "-" + cBoxDia.getSelectedItem() + " " + cBoxHora.getSelectedItem() + ":00.000000000"));

        agendaPrimeiraDAO.save(agendaPrimeira);

        JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        dispose();
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cBoxAno;
    private javax.swing.JComboBox<String> cBoxDia;
    private javax.swing.JComboBox<String> cBoxEspecialidade;
    private javax.swing.JComboBox<String> cBoxHora;
    private javax.swing.JComboBox<String> cBoxMedico;
    private javax.swing.JComboBox<String> cBoxMes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField txtFieldData;
    private javax.swing.JTextField txtFieldEspecialidade;
    private javax.swing.JTextField txtFieldHora;
    private javax.swing.JTextField txtFieldMedico;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables

}
