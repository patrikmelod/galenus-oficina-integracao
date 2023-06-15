package com.galenus.telas;

import com.galenus.dao.AgendaDAO;
import com.galenus.dao.FuncionarioDAO;
import com.galenus.dao.MedicoDAO;
import com.galenus.dao.PacienteDAO;
import com.galenus.model.Agenda;
import com.galenus.model.Funcionario;
import com.galenus.model.Medico;
import com.galenus.model.Paciente;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.util.List;

@Slf4j
public class AreaRecepcao extends javax.swing.JFrame {

    private final AgendaDAO agendaDAO = new AgendaDAO();
    private final PacienteDAO pacienteDAO = new PacienteDAO();
    private final MedicoDAO medicoDAO = new MedicoDAO();
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    private static AreaRecepcao INSTANCE;

    private AreaRecepcao() {
        initComponents();
    }

    public static AreaRecepcao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AreaRecepcao();
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

        btAgendarConsulta = new javax.swing.JButton();
        btConfirmarConsulta = new javax.swing.JButton();
        btCancelarConsulta = new javax.swing.JButton();
        btCadastrarPaciente = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Label_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAgendarConsulta.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btAgendarConsulta.setText("Agendar Consulta");
        btAgendarConsulta.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btAgendarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 360, 50));

        btConfirmarConsulta.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btConfirmarConsulta.setText("Confirmar Consulta");
        btConfirmarConsulta.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btConfirmarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btConfirmarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 360, 50));

        btCancelarConsulta.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCancelarConsulta.setText("Cancelar Consulta");
        btCancelarConsulta.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btCancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelarConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 360, 50));

        btCadastrarPaciente.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        btCadastrarPaciente.setText("Cadastrar Paciente");
        btCadastrarPaciente.setMargin(new java.awt.Insets(15, 14, 3, 14));
        btCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 360, 50));

        btSair.setFont(new java.awt.Font("Constantia", 1, 20)); // NOI18N
        btSair.setText("Sair");
        btSair.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 160, 40));

        Label_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Recepção.png"))); // NOI18N
        getContentPane().add(Label_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setInstanceNull() {
        INSTANCE = null;
    }

    private void btCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarPacienteActionPerformed
        CadastraPaciente.getInstance().setVisible(true);
    }//GEN-LAST:event_btCadastrarPacienteActionPerformed

    private void btConfirmarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarConsultaActionPerformed
        ConfirmaConsulta.getInstance().setVisible(true);
    }//GEN-LAST:event_btConfirmarConsultaActionPerformed

    private void btAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarConsultaActionPerformed
        AgendaConsulta ac = new AgendaConsulta();
        ac.setVisible(true);
    }//GEN-LAST:event_btAgendarConsultaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
        Login.getInstance().setVisible(true);
        setInstanceNull();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarConsultaActionPerformed
        try {
            String documento = JOptionPane.showInputDialog("Qual o documento do paciente que deseja cancelar a consulta?");

            List<Agenda> agendas = agendaDAO.getByPacDoc(documento);

            Medico medico;
            Funcionario funcionario;
            Paciente paciente;

            if (agendas.size() == 1) {
                medico = medicoDAO.getByCrm(agendas.get(0).getMedicoCrm());
                funcionario = funcionarioDAO.getByDoc(medico.getDocumento());
                paciente = pacienteDAO.getByDoc(agendas.get(0).getDocPaciente());

                int opt = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a consulta do(a) Sr(a) " + paciente.getNome() +
                        "\nMédico: " + funcionario.getNome() + "\nConsulta: " + medico.getEspecialidade());

                if (opt == 0) {
                    agendaDAO.delete(documento);
                    JOptionPane.showMessageDialog(null, "Consulta desmarcada.", "Sucesso", JOptionPane.PLAIN_MESSAGE);
                }
            } else if (agendas.size() > 1) {
                StringBuilder consultas = new StringBuilder();

                for (Agenda agenda : agendas) {
                    medico = medicoDAO.getByCrm(agenda.getMedicoCrm());
                    funcionario = funcionarioDAO.getByDoc(medico.getDocumento());
                    consultas.append(agenda.getId()).append(". Médico: ").append(funcionario.getNome()).append(" | Consulta: ").append(medico.getEspecialidade()).append("\n");
                }
                String opt = JOptionPane.showInputDialog("Paciente tem mais de uma consulta marcada. Qual delas deseja cancelar?\n" + consultas);
                agendaDAO.deleteById(Integer.valueOf(opt));
                JOptionPane.showMessageDialog(null, "Consulta desmarcada.", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Paciente não possui consulta marcada.", "Info", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado. Tente novamente.", "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btCancelarConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_fundo;
    private javax.swing.JButton btAgendarConsulta;
    private javax.swing.JButton btCadastrarPaciente;
    private javax.swing.JButton btCancelarConsulta;
    private javax.swing.JButton btConfirmarConsulta;
    private javax.swing.JButton btSair;
    // End of variables declaration//GEN-END:variables
}
