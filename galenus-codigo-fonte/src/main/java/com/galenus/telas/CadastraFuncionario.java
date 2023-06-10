package com.galenus.telas;

import com.galenus.dao.FuncionarioDAO;
import com.galenus.dao.MedicoDAO;
import com.galenus.model.Funcionario;
import com.galenus.model.Medico;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

@Slf4j
public class CadastraFuncionario extends javax.swing.JFrame {

    public CadastraFuncionario() {
        initComponents();
        txtFieldCrm.setEnabled(false);
        txtFieldEspecialidade.setEnabled(false);
        btCadastrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldCpf = new javax.swing.JTextField();
        txtFieldEndereco = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        txtFieldNascimento = new javax.swing.JTextField();
        cBoxTipoFunc = new javax.swing.JComboBox<>();
        txtFieldCrm = new javax.swing.JTextField();
        txtFieldEspecialidade = new javax.swing.JTextField();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 360, 50));

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
        getContentPane().add(txtFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 360, 50));

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
        getContentPane().add(txtFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 360, 50));

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
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 360, 50));

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
        getContentPane().add(txtFieldNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 360, 50));

        cBoxTipoFunc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecione", "Recepção", "Recursos Humanos", "Médico"}));
        cBoxTipoFunc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxTipoFuncItemStateChanged(evt);
            }
        });
        getContentPane().add(cBoxTipoFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 360, 50));

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
        getContentPane().add(txtFieldCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 360, 50));

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
        getContentPane().add(txtFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 360, 50));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastrar Funcionário.png"))); // NOI18N
        Label_fundo.setToolTipText("");
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusLost
        if (txtFieldNascimento.getText().equals("")) {
            txtFieldNascimento.setText("Data de Nascimento:");
            txtFieldNascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusLost

    private void txtFieldNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNascimentoFocusGained
        if (txtFieldNascimento.getText().equals("Data de Nascimento:")) {
            txtFieldNascimento.setForeground(new Color(0, 0, 0));
            txtFieldNascimento.setText("");
        }
    }//GEN-LAST:event_txtFieldNascimentoFocusGained

    private void txtFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusLost
        if (txtFieldTelefone.getText().equals("")) {
            txtFieldTelefone.setText("Telefone:");
            txtFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusLost

    private void txtFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusGained
        if (txtFieldTelefone.getText().equals("Telefone:")) {
            txtFieldTelefone.setForeground(new Color(0, 0, 0));
            txtFieldTelefone.setText("");
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusGained

    //GEN-FIRST:event_txtFieldCpfFocusLost
    private void txtFieldCpfFocusLost(java.awt.event.FocusEvent evt) {
        if (txtFieldCpf.getText().equals("")) {
            txtFieldCpf.setText("CPF:");
            txtFieldCpf.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCpfFocusLost

    private void txtFieldCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfFocusGained
        if (txtFieldCpf.getText().equals("CPF:")) {
            txtFieldCpf.setForeground(new Color(0, 0, 0));
            txtFieldCpf.setText("");
        }
    }//GEN-LAST:event_txtFieldCpfFocusGained

    private void txtFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusLost
        if (txtFieldNome.getText().equals("")) {
            txtFieldNome.setText("Nome:");
            txtFieldNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldNomeFocusLost

    private void txtFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNomeFocusGained
        if (txtFieldNome.getText().equals("Nome:")) {
            txtFieldNome.setForeground(new Color(0, 0, 0));
            txtFieldNome.setText("");
        }
    }//GEN-LAST:event_txtFieldNomeFocusGained

    private void txtFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusLost
        if (txtFieldEndereco.getText().equals("")) {
            txtFieldEndereco.setText("Endereço:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusLost

    private void txtFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {
        if (txtFieldEndereco.getText().equals("Endereço:")) {
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }

    private void txtFieldCrmFocusGained(java.awt.event.FocusEvent evt) {
        if (txtFieldEndereco.getText().equals("CRM:")) {
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }

    private void txtFieldCrmFocusLost(java.awt.event.FocusEvent evt) {
        if (txtFieldEndereco.getText().equals("")) {
            txtFieldEndereco.setText("CRM:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }

    private void txtFieldEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {
        if (txtFieldEndereco.getText().equals("Especialidade:")) {
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }

    private void txtFieldEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusGained
        if (txtFieldEndereco.getText().equals("")) {
            txtFieldEndereco.setText("Especialidade:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusGained

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            MedicoDAO medicoDAO = new MedicoDAO();

            Funcionario fun = new Funcionario();
            fun.setNome(txtFieldNome.getText());
            fun.setDocumento(txtFieldCpf.getText());

            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            fun.setNascimento(new Date(fmt.parse(txtFieldNascimento.getText()).getTime()));

            fun.setEndereco(txtFieldEndereco.getText());
            fun.setTelefone(txtFieldTelefone.getText());
            fun.setSenha("1234");

            if (Objects.equals(cBoxTipoFunc.getSelectedItem(), "Recepção")) {
                fun.setEmail(txtFieldNome.getText().toLowerCase().trim().replace(" ", "") + "@recepcao.com");

                funcionarioDAO.save(fun);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!\nEmail: " + fun.getEmail() + "\nSenha: " + fun.getSenha(), "Sucesso", JOptionPane.PLAIN_MESSAGE);
                dispose();
            } else if (Objects.equals(cBoxTipoFunc.getSelectedItem(), "Recursos Humanos")) {
                fun.setEmail(txtFieldNome.getText().toLowerCase().trim().replace(" ", "") + "@rh.com");

                funcionarioDAO.save(fun);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!\nEmail: " + fun.getEmail() + "\nSenha: " + fun.getSenha(), "Sucesso", JOptionPane.PLAIN_MESSAGE);
                dispose();
            } else if (Objects.equals(cBoxTipoFunc.getSelectedItem(), "Médico")) {
                Medico medico = new Medico();
                fun.setEmail(txtFieldNome.getText().toLowerCase().trim().replace(" ", "") + "@medico.com");
                medico.setCrm(txtFieldCrm.getText());
                medico.setEspecialidade(txtFieldEspecialidade.getText());
                medico.setDocumento(txtFieldCpf.getText());

                funcionarioDAO.save(fun);
                medicoDAO.save(medico);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!\nEmail: " + fun.getEmail() + "\nSenha: " + fun.getSenha(), "Sucesso", JOptionPane.PLAIN_MESSAGE);
                dispose();
            }
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Data inválida.", "Erro", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar paciente.", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cBoxTipoFuncItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxTipoFuncItemStateChanged
        if (!Objects.equals(cBoxTipoFunc.getSelectedItem(), "Médico")) {
            txtFieldCrm.setEnabled(false);
            txtFieldEspecialidade.setEnabled(false);
        } else {
            txtFieldCrm.setEnabled(true);
            txtFieldEspecialidade.setEnabled(true);
        }

        btCadastrar.setEnabled(!Objects.equals(cBoxTipoFunc.getSelectedItem(), "Selecione"));
    }//GEN-LAST:event_cBoxTipoFuncItemStateChanged

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cBoxTipoFunc;
    private javax.swing.JTextField txtFieldCpf;
    private javax.swing.JTextField txtFieldCrm;
    private javax.swing.JTextField txtFieldEndereco;
    private javax.swing.JTextField txtFieldEspecialidade;
    private javax.swing.JTextField txtFieldNascimento;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables

}
