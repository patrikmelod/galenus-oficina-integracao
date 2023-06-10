package com.galenus.telas;

import com.galenus.dao.PacienteDAO;
import com.galenus.model.Paciente;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Slf4j
public class CadastraPaciente extends javax.swing.JFrame {

    private static CadastraPaciente INSTANCE;

    private CadastraPaciente() {
        initComponents();
    }

    public static CadastraPaciente getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CadastraPaciente();
        }
        return INSTANCE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldNome = new javax.swing.JTextField();
        txtFieldCpf = new javax.swing.JTextField();
        txtFieldNascimento = new javax.swing.JTextField();
        txtFieldSexo = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        txtFieldEndereco = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

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
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 235, 360, 50));

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
        getContentPane().add(txtFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 335, 360, 50));

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
        getContentPane().add(txtFieldNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 435, 360, 50));

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
        getContentPane().add(txtFieldSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 435, 360, 50));

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
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 335, 360, 50));

        txtFieldEndereco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEndereco.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEndereco.setText("Endereço:");
        txtFieldEndereco.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEnderecoFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEnderecoFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 235, 360, 50));

        btCadastrar.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 260, 50));

        btVoltar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastrar Paciente.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setInstanceNull() {
        INSTANCE = null;
    }

    public void setTxtFieldCpf(String cpf) {
        txtFieldCpf.setText(cpf);
    }

    public void setTxtFieldNome(String nome) {
        txtFieldNome.setText(nome);
    }

    public void setTxtFieldTelefone(String tel) {
        txtFieldTelefone.setText(tel);
    }

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

    private void txtFieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfFocusGained
        if (txtFieldCpf.getText().equals("CPF:")) {
            txtFieldCpf.setForeground(new Color(0, 0, 0));
            txtFieldCpf.setText("");
        }
    }//GEN-LAST:event_txtFieldCpfFocusGained

    private void txtFieldCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfFocusLost
        if (txtFieldCpf.getText().equals("")) {
            txtFieldCpf.setText("CPF:");
            txtFieldCpf.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCpfFocusLost

    private void txtFieldNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusGained
        if (txtFieldNascimento.getText().equals("Data de Nascimento:")) {
            txtFieldNascimento.setForeground(new Color(0, 0, 0));
            txtFieldNascimento.setText("");
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusGained

    private void txtFieldNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusLost
        if (txtFieldNascimento.getText().equals("")) {
            txtFieldNascimento.setText("Data de Nascimento:");
            txtFieldNascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusLost

    private void txtFieldSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSexoFocusGained
        if (txtFieldSexo.getText().equals("Sexo:")) {
            txtFieldSexo.setForeground(new Color(0, 0, 0));
            txtFieldSexo.setText("");
        }
    }//GEN-LAST:event_txtFieldSexoFocusGained

    private void txtFieldSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSexoFocusLost
        if (txtFieldSexo.getText().equals("")) {
            txtFieldSexo.setText("Sexo:");
            txtFieldSexo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldSexoFocusLost

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

    private void txtFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusGained
        if (txtFieldEndereco.getText().equals("Endereço:")) {
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusGained

    private void txtFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusLost
        if (txtFieldEndereco.getText().equals("")) {
            txtFieldEndereco.setText("Endereço:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusLost

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
        setInstanceNull();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            PacienteDAO pacienteDAO = new PacienteDAO();
            Paciente paciente = new Paciente();

            paciente.setNome(txtFieldNome.getText());
            paciente.setSexo(txtFieldSexo.getText());
            paciente.setDocumento(txtFieldCpf.getText());
            paciente.setTelefone(txtFieldTelefone.getText());
            paciente.setEndereco(txtFieldEndereco.getText());

            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            paciente.setNascimento(new Date(fmt.parse(txtFieldNascimento.getText()).getTime()));

            pacienteDAO.save(paciente);
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            dispose();
            setInstanceNull();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Data inválida.", "Erro", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente.", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField txtFieldCpf;
    private javax.swing.JTextField txtFieldEndereco;
    private javax.swing.JTextField txtFieldNascimento;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSexo;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
