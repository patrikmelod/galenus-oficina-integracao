/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.galenus.telas;

import com.galenus.dao.*;
import com.galenus.model.*;
import com.galenus.util.NumUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author arthu
 */
@Component
@Slf4j
public class ConfirmaConsulta extends javax.swing.JFrame {

    private final AgendaPrimeiraDAO agendaPrimeiraDAO = new AgendaPrimeiraDAO();
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private final MedicoDAO medicoDAO = new MedicoDAO();
    private final PacienteDAO pacienteDAO = new PacienteDAO();
    private final AgendaDAO agendaDAO = new AgendaDAO();

    private static Medico medico = new Medico();
    private static Funcionario funcionario = new Funcionario();
    private static AgendaPrimeira agendaPrimeira = new AgendaPrimeira();

    /**
     * Creates new form RCP_Confirmar_Con
     */
    public ConfirmaConsulta() {
        initComponents();
        selectTbConta();
    }

    public void selectTbConta() {
        DefaultTableModel model = (DefaultTableModel) tbNomes.getModel();
        int posLin = 0;
        model.setRowCount(posLin);

        for (AgendaPrimeira agenda : agendaPrimeiraDAO.getAll()) {
            model.insertRow(posLin, new Object[]{agenda.getNomePaciente()});
            posLin++;
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

        txtField_Nome = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        txtField_CPF = new javax.swing.JTextField();
        cBoxPagamento = new javax.swing.JComboBox<>();
        cBoxDia = new javax.swing.JComboBox<>();
        cBoxMes = new javax.swing.JComboBox<>();
        cBoxAno = new javax.swing.JComboBox<>();
        cBoxHorario = new javax.swing.JComboBox<>();
        txtFieldPagamento = new javax.swing.JTextField();
        txtField_Medico = new javax.swing.JTextField();
        txFieldEspecialidade = new javax.swing.JTextField();
        txtField_Data = new javax.swing.JTextField();
        txtFieldHorario = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNomes = new javax.swing.JTable();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtField_Nome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtField_Nome.setForeground(new java.awt.Color(153, 153, 153));
        txtField_Nome.setText("Nome:");
        txtField_Nome.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtField_Nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtField_NomeFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtField_NomeFocusLost(evt);
            }
        });
        txtField_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtField_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 360, 50));

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
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 360, 50));

        txtField_CPF.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtField_CPF.setForeground(new java.awt.Color(153, 153, 153));
        txtField_CPF.setText("CPF:");
        txtField_CPF.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtField_CPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtField_CPFFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtField_CPFFocusLost(evt);
            }
        });
        getContentPane().add(txtField_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 360, 50));

        cBoxPagamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Dinheiro", "Cartão", "Plano de Saúde", "Retorno", " "}));
        cBoxPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 220, 50));

        cBoxDia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        cBoxDia.setBorder(null);
        cBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 70, 50));

        cBoxMes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
        cBoxMes.setBorder(null);
        cBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 510, 130, 50));

        cBoxAno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
        cBoxAno.setBorder(null);
        cBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAnoActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 90, 50));

        cBoxHorario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00"}));
        cBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(cBoxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 220, 50));

        txtFieldPagamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldPagamento.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldPagamento.setText("Pagamento:");
        txtFieldPagamento.setFocusable(false);
        txtFieldPagamento.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 360, 50));

        txtField_Medico.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtField_Medico.setForeground(new java.awt.Color(153, 153, 153));
        txtField_Medico.setText("Médico:");
        txtField_Medico.setFocusable(false);
        txtField_Medico.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtField_Medico.setRequestFocusEnabled(false);
        txtField_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_MedicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtField_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 360, 50));

        txFieldEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txFieldEspecialidade.setForeground(new java.awt.Color(153, 153, 153));
        txFieldEspecialidade.setText("Especialidade:");
        txFieldEspecialidade.setFocusable(false);
        txFieldEspecialidade.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txFieldEspecialidade.setRequestFocusEnabled(false);
        txFieldEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFieldEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 360, 50));

        txtField_Data.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtField_Data.setForeground(new java.awt.Color(153, 153, 153));
        txtField_Data.setText("Data:");
        txtField_Data.setFocusable(false);
        txtField_Data.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtField_Data.setRequestFocusEnabled(false);
        getContentPane().add(txtField_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 360, 50));

        txtFieldHorario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldHorario.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldHorario.setText("Hora:");
        txtFieldHorario.setFocusable(false);
        txtFieldHorario.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldHorario.setRequestFocusEnabled(false);
        getContentPane().add(txtFieldHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 360, 50));

        btConfirmar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 160, 40));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 640, 160, 40));

        tbNomes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String[]{
                        "Paciente"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbNomes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNomesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbNomes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 420));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Confirmar Consulta.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxMesActionPerformed

    private void cBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxDiaActionPerformed

    private void txtField_NomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField_NomeFocusGained
        if (txtField_Nome.getText().equals("Nome:")) {
            txtField_Nome.setForeground(new Color(0, 0, 0));
            txtField_Nome.setText("");
        }
    }//GEN-LAST:event_txtField_NomeFocusGained

    private void txtField_NomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField_NomeFocusLost
        if (txtField_Nome.getText().equals("")) {
            txtField_Nome.setText("Nome:");
            txtField_Nome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtField_NomeFocusLost

    private void txtField_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_MedicoActionPerformed

    private void cBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxHorarioActionPerformed

    private void cBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxAnoActionPerformed

    private void txtField_CPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField_CPFFocusGained
        if (txtField_CPF.getText().equals("CPF:")) {
            txtField_CPF.setForeground(new Color(0, 0, 0));
            txtField_CPF.setText("");
        }
    }//GEN-LAST:event_txtField_CPFFocusGained

    private void txtField_CPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtField_CPFFocusLost
        if (txtField_CPF.getText().equals("")) {
            txtField_CPF.setText("CPF:");
            txtField_CPF.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtField_CPFFocusLost

    private void txtFieldPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPagamentoActionPerformed

    private void cBoxPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxPagamentoActionPerformed

    private void txFieldEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFieldEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFieldEspecialidadeActionPerformed

    private void txtField_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_NomeActionPerformed

    }//GEN-LAST:event_txtField_NomeActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
            Paciente paciente = pacienteDAO.getByDoc(txtField_CPF.getText());

            if (paciente == null) {
                int opt = JOptionPane.showConfirmDialog(null, "Paciente não cadastrado. Deseja cadastrar?");
                if (opt == 0) {
                    CadastraPaciente cadastraPaciente = new CadastraPaciente();
                    cadastraPaciente.setVisible(true);
                }
            } else {
                Agenda agenda = new Agenda();

                agenda.setDocPaciente(txtField_CPF.getText());
                agenda.setMedicoCrm(medico.getCrm());
                agenda.setTelefone(txtFieldTelefone.getText());
                agenda.setDataHora(Timestamp.valueOf(cBoxAno.getSelectedItem() + "-" + new NumUtil().parseMonthToNumber((String) cBoxMes.getSelectedItem()) + "-" + cBoxDia.getSelectedItem() + " " + cBoxHorario.getSelectedItem() + ":00.000000000"));

                agendaDAO.save(agenda);
                JOptionPane.showMessageDialog(null, "Consulta confirmada.", "Sucesso", JOptionPane.PLAIN_MESSAGE);
                agendaPrimeiraDAO.delete(agendaPrimeira.getId());
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao confirmar consulta.", "Erro", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_btConfirmarActionPerformed

    private void tbNomesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNomesMouseClicked
        String valLin = tbNomes.getModel().getValueAt(tbNomes.getSelectedRow(), 0).toString();
        log.info(valLin.trim());
        agendaPrimeira = agendaPrimeiraDAO.getAllByName(valLin.trim());
        medico = medicoDAO.getByCrm(agendaPrimeira.getMedicoCrm());
        funcionario = funcionarioDAO.getByDoc(medico.getDocumento());

        txtField_Nome.setText(agendaPrimeira.getNomePaciente());
        txtField_Medico.setText(funcionario.getNome());
        txFieldEspecialidade.setText(medico.getEspecialidade());
        txtFieldTelefone.setText(agendaPrimeira.getTelefone());

        SimpleDateFormat diaF = new SimpleDateFormat("dd");
        SimpleDateFormat mesF = new SimpleDateFormat("MM");
        SimpleDateFormat anoF = new SimpleDateFormat("yyyy");
        SimpleDateFormat horaF = new SimpleDateFormat("HH:mm");

        cBoxAno.setSelectedItem(anoF.format(agendaPrimeira.getDataHora()));
        cBoxDia.setSelectedItem(diaF.format(agendaPrimeira.getDataHora()));
        cBoxMes.setSelectedItem(new NumUtil().parseNumberToMonth(mesF.format(agendaPrimeira.getDataHora())));
        cBoxHorario.setSelectedItem(horaF.format(agendaPrimeira.getDataHora()));
    }//GEN-LAST:event_tbNomesMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cBoxAno;
    private javax.swing.JComboBox<String> cBoxDia;
    private javax.swing.JComboBox<String> cBoxHorario;
    private javax.swing.JComboBox<String> cBoxMes;
    private javax.swing.JComboBox<String> cBoxPagamento;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbNomes;
    private javax.swing.JTextField txFieldEspecialidade;
    private javax.swing.JTextField txtFieldHorario;
    private javax.swing.JTextField txtFieldPagamento;
    private javax.swing.JTextField txtFieldTelefone;
    private javax.swing.JTextField txtField_CPF;
    private javax.swing.JTextField txtField_Data;
    private javax.swing.JTextField txtField_Medico;
    private javax.swing.JTextField txtField_Nome;
    // End of variables declaration//GEN-END:variables


}
