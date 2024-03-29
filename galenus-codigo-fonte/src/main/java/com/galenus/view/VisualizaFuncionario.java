package com.galenus.view;

import com.galenus.controller.FuncionarioDAO;
import com.galenus.controller.MedicoDAO;
import com.galenus.model.Funcionario;
import com.galenus.model.Medico;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Slf4j
public class VisualizaFuncionario extends javax.swing.JFrame {

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private final MedicoDAO medicoDAO = new MedicoDAO();

    private static Funcionario fun = null;
    private static Medico med = null;

    public VisualizaFuncionario() {
        initComponents();
        btSalvar.setVisible(false);
        btSalvar.setEnabled(false);
        txtFieldEmail.setFocusable(false);
        txtFieldEndereco.setFocusable(false);
        txtFieldNome.setFocusable(false);
        txtFieldSenha.setFocusable(false);
        txtFieldTelefone.setFocusable(false);
        txtFieldData.setFocusable(false);
        txtFieldEspecialidade.setFocusable(false);
        txtFieldCrm.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBuscar = new javax.swing.JButton();
        btDesativar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        txtFieldCpfBusca = new javax.swing.JTextField();
        txtFieldEndereco = new javax.swing.JTextField();
        txtFieldNome = new javax.swing.JTextField();
        txtFieldData = new javax.swing.JTextField();
        txtFieldEspecialidade = new javax.swing.JTextField();
        txtFieldCrm = new javax.swing.JTextField();
        txtFieldEmail = new javax.swing.JTextField();
        txtFieldSenha = new javax.swing.JTextField();
        txtFieldTelefone = new javax.swing.JTextField();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btBuscar.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setFocusPainted(false);
        btBuscar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 200, 50));

        btDesativar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btDesativar.setText("Desativar Acesso");
        btDesativar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btDesativar.setFocusable(false);
        btDesativar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesativarActionPerformed(evt);
            }
        });
        getContentPane().add(btDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 220, 40));

        btEditar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btEditar.setText("Editar");
        btEditar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 160, 40));

        btSalvar.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 160, 40));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

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
        getContentPane().add(txtFieldCpfBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, 50));

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
        getContentPane().add(txtFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 360, 50));

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
        getContentPane().add(txtFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 360, 50));

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
        getContentPane().add(txtFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 360, 50));

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
        getContentPane().add(txtFieldEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 360, 50));

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
        getContentPane().add(txtFieldCrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 360, 50));

        txtFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldEmail.setText("Email:");
        txtFieldEmail.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldEmailFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 360, 50));

        txtFieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldSenha.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldSenha.setText("Senha:");
        txtFieldSenha.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtFieldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldSenhaFocusLost(evt);
            }
        });
        getContentPane().add(txtFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 360, 50));

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
        getContentPane().add(txtFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 360, 50));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Visualizar Cadastro.png"))); // NOI18N
        labelFundo.setAlignmentY(0.0F);
        labelFundo.setDoubleBuffered(true);
        labelFundo.setFocusable(false);
        labelFundo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelFundo.setRequestFocusEnabled(false);
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 720));

        pack();
        setLocationRelativeTo(null);
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

    private void txtFieldEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusGained
        if (txtFieldEndereco.getText().equals("Endereço:")) {
            txtFieldEndereco.setForeground(new Color(0, 0, 0));
            txtFieldEndereco.setText("");
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusGained

    private void txtFieldTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusGained
        if (txtFieldTelefone.getText().equals("Telefone:")) {
            txtFieldTelefone.setForeground(new Color(0, 0, 0));
            txtFieldTelefone.setText("");
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusGained

    private void txtFieldCpfBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfBuscaFocusGained
        if (txtFieldCpfBusca.getText().equals("CPF:")) {
            txtFieldCpfBusca.setForeground(new Color(0, 0, 0));
            txtFieldCpfBusca.setText("");
        }
    }//GEN-LAST:event_txtFieldCpfBuscaFocusGained

    private void txtFieldCpfBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCpfBuscaFocusLost
        if (txtFieldCpfBusca.getText().equals("")) {
            txtFieldCpfBusca.setText("CPF:");
            txtFieldCpfBusca.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCpfBuscaFocusLost

    private void txtFieldEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEnderecoFocusLost
        if (txtFieldEndereco.getText().equals("")) {
            txtFieldEndereco.setText("Endereço:");
            txtFieldEndereco.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEnderecoFocusLost

    private void txtFieldTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldTelefoneFocusLost
        if (txtFieldTelefone.getText().equals("")) {
            txtFieldTelefone.setText("Telefone:");
            txtFieldTelefone.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldTelefoneFocusLost

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        fun = funcionarioDAO.getByDoc(txtFieldCpfBusca.getText());
        med = medicoDAO.getByDoc(txtFieldCpfBusca.getText());

        if (fun == null) {
            int opt = JOptionPane.showConfirmDialog(null, "Funcionário não cadastrado. Deseja cadastrá-lo?");

            if (opt == 0) {
                dispose();
                CadastraFuncionario cf = new CadastraFuncionario();
                cf.setVisible(true);
            }
        }

        txtFieldNome.setText(fun.getNome());
        txtFieldTelefone.setText(fun.getTelefone());
        txtFieldEndereco.setText(fun.getEndereco());
        txtFieldEmail.setText(fun.getEmail());
        txtFieldSenha.setText(fun.getSenha());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        txtFieldData.setText(formatter.format(fun.getNascimento()));

        txtFieldCrm.setText("N/A");
        txtFieldEspecialidade.setText("N/A");

        if (med != null) {
            txtFieldCrm.setText(med.getCrm());
            txtFieldEspecialidade.setText(med.getEspecialidade());
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        fun.setNome(txtFieldNome.getText());
        fun.setTelefone(txtFieldTelefone.getText());
        fun.setEndereco(txtFieldEndereco.getText());
        fun.setEmail(txtFieldEmail.getText());
        fun.setSenha(txtFieldSenha.getText());
        try {
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            fun.setNascimento(new Date(fmt.parse(txtFieldData.getText()).getTime()));
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Data inválida.", "Erro", JOptionPane.PLAIN_MESSAGE);
        }

        if (med != null) {
            med.setCrm(txtFieldCrm.getText());
            med.setEspecialidade(txtFieldEspecialidade.getText());
            medicoDAO.update(med);
        }
        funcionarioDAO.update(fun);

        JOptionPane.showMessageDialog(null, "Alteração salva com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesativarActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja desativar acesso do usuário?");

        if (opt == 0) {
            fun.setEmail("DESATIVADO");
            funcionarioDAO.update(fun);
            JOptionPane.showMessageDialog(null, "Usuário desativado.", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_btDesativarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        btEditar.setVisible(false);
        btEditar.setEnabled(false);
        btSalvar.setVisible(true);
        btSalvar.setEnabled(true);

        txtFieldEmail.setFocusable(true);
        txtFieldEndereco.setFocusable(true);
        txtFieldNome.setFocusable(true);
        txtFieldSenha.setFocusable(true);
        txtFieldTelefone.setFocusable(true);
        txtFieldData.setFocusable(true);
        txtFieldEspecialidade.setFocusable(true);
        txtFieldCrm.setFocusable(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtFieldDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusGained
        if (txtFieldData.getText().equals("Data de Nascimento:")) {
            txtFieldData.setForeground(new Color(0, 0, 0));
            txtFieldData.setText("");
        }
    }//GEN-LAST:event_txtFieldDataFocusGained

    private void txtFieldDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldDataFocusLost
        if (txtFieldData.getText().equals("")) {
            txtFieldData.setText("Data de Nascimento:");
            txtFieldData.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldDataFocusLost

    private void txtFieldEspecialidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusGained
        if (txtFieldEspecialidade.getText().equals("Especialidade:")) {
            txtFieldEspecialidade.setForeground(new Color(0, 0, 0));
            txtFieldEspecialidade.setText("");
        }
    }//GEN-LAST:event_txtFieldEspecialidadeFocusGained

    private void txtFieldEspecialidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEspecialidadeFocusLost
        if (txtFieldEspecialidade.getText().equals("")) {
            txtFieldEspecialidade.setText("Especialidade:");
            txtFieldEspecialidade.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEspecialidadeFocusLost

    private void txtFieldCrmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCrmFocusGained
        if (txtFieldCrm.getText().equals("CRM:")) {
            txtFieldCrm.setForeground(new Color(0, 0, 0));
            txtFieldCrm.setText("");
        }
    }//GEN-LAST:event_txtFieldCrmFocusGained

    private void txtFieldCrmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCrmFocusLost
        if (txtFieldCrm.getText().equals("")) {
            txtFieldCrm.setText("CRM:");
            txtFieldCrm.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldCrmFocusLost

    private void txtFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusGained
        if (txtFieldEmail.getText().equals("Email:")) {
            txtFieldEmail.setForeground(new Color(0, 0, 0));
            txtFieldEmail.setText("");
        }
    }//GEN-LAST:event_txtFieldEmailFocusGained

    private void txtFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldEmailFocusLost
        if (txtFieldEmail.getText().equals("")) {
            txtFieldEmail.setText("Email:");
            txtFieldEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldEmailFocusLost

    private void txtFieldSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSenhaFocusGained
        if (txtFieldSenha.getText().equals("Senha:")) {
            txtFieldSenha.setForeground(new Color(0, 0, 0));
            txtFieldSenha.setText("");
        }
    }//GEN-LAST:event_txtFieldSenhaFocusGained

    private void txtFieldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldSenhaFocusLost
        if (txtFieldSenha.getText().equals("")) {
            txtFieldSenha.setText("Senha:");
            txtFieldSenha.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtFieldSenhaFocusLost

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btDesativar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JTextField txtFieldCpfBusca;
    private javax.swing.JTextField txtFieldCrm;
    private javax.swing.JTextField txtFieldData;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldEndereco;
    private javax.swing.JTextField txtFieldEspecialidade;
    private javax.swing.JTextField txtFieldNome;
    private javax.swing.JTextField txtFieldSenha;
    private javax.swing.JTextField txtFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
