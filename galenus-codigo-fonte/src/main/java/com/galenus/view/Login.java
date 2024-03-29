package com.galenus.view;

import com.galenus.controller.FuncionarioDAO;
import com.galenus.controller.LogDAO;
import com.galenus.controller.MedicoDAO;
import com.galenus.model.Funcionario;
import com.galenus.model.Log;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
public class Login extends javax.swing.JFrame {

    private final LogDAO logDAO = new LogDAO();
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    private static String email;

    private static Login INSTANCE;

    private Login() {
        initComponents();
    }

    public static Login getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Login();
        }
        return INSTANCE;
    }

    public String getMedicoCrm() {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        MedicoDAO medicoDAO = new MedicoDAO();

        log.info(email);
        Funcionario funcionario = funcionarioDAO.getByEmail(email);

        return medicoDAO.getByDoc(funcionario.getDocumento()).getCrm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldEmail = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1240, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFieldEmail.setBorder(null);
        txtFieldEmail.setMargin(new java.awt.Insets(2, 10, 2, 6));
        getContentPane().add(txtFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 330, 316, 50));

        btEntrar.setFont(new java.awt.Font("Constantia", 1, 33)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(31, 79, 231));
        btEntrar.setText("Entrar");
        btEntrar.setBorderPainted(false);
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEntrar.setFocusable(false);
        btEntrar.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 160, 50));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setMargin(new java.awt.Insets(4, 6, 2, 6));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 310, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 79, 231));
        jLabel1.setText(" Email:");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 380, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 79, 231));
        jLabel2.setText(" Senha:");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 380, 50));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Inicio.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setInstanceNull() {
        INSTANCE = null;
    }

    public void salvaLog() {
        Log login = new Log();
        login.setDataAcesso(new Timestamp(System.currentTimeMillis()));
        try {
            login.setIpMaquina(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        logDAO.save(login);
    }

    public boolean validaLogin(String email, String senha) {
        Funcionario funcionario = funcionarioDAO.getByEmail(email);
        if (funcionario != null) {
            return funcionario.getSenha().equals(senha);
        }
        return false;
    }

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        email = txtFieldEmail.getText();
        String senha = Arrays.toString(passwordField.getPassword()).replace("[", "").replace("]", "").replace(" ", "").replace(",", "");

        log.info(senha);
        if (validaLogin(email, senha)) {
            if (email.contains("@medico")) {
                AreaMedico.getInstance().setVisible(true);
                salvaLog();
                dispose();
                setInstanceNull();
            } else if (email.contains("@recepcao")) {
                dispose();
                AreaRecepcao.getInstance().setVisible(true);
                salvaLog();
                setInstanceNull();
            } else if (email.contains("@rh")) {
                dispose();
                AreaRh.getInstance().setVisible(true);
                salvaLog();
                setInstanceNull();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtFieldEmail;
    // End of variables declaration//GEN-END:variables
}