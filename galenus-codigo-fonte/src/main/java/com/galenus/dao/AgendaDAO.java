package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {

    public void save(Agenda agenda) {
        String sql = "INSERT INTO agenda(telefone, data_hora, medico_crm, paciente_doc) " +
                "VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, agenda.getTelefone());
            pstm.setTimestamp(2, agenda.getDataHora());
            pstm.setString(3, agenda.getMedicoCrm());
            pstm.setString(4, agenda.getDocPaciente());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Agenda agenda) {

        String sql = "UPDATE agenda SET telefone = ?, data_hora = ?, medico_crm = ?, paciente_doc = ? " +
                "WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, agenda.getTelefone());
            pstm.setTimestamp(2, agenda.getDataHora());
            pstm.setString(3, agenda.getMedicoCrm());
            pstm.setString(4, agenda.getDocPaciente());
            pstm.setInt(5, agenda.getId());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Agenda> getByPacDoc(String pacDoc) {

        String sql = "SELECT * FROM agenda WHERE paciente_doc = ?";

        List<Agenda> agendas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, pacDoc);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Agenda agenda = new Agenda();
                agenda.setTelefone(rset.getString("telefone"));
                agenda.setDataHora(rset.getTimestamp("data_hora"));
                agenda.setMedicoCrm(rset.getString("medico_crm"));
                agenda.setDocPaciente(rset.getString("paciente_doc"));

                agendas.add(agenda);
            }
        } catch (Exception e) {
            System.out.println("Não há funcionário com o email informado");
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return agendas;
    }

    public List<Agenda> getAll() {

        String sql = "SELECT * FROM agenda";

        List<Agenda> agendas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Agenda agenda = new Agenda();
                agenda.setTelefone(rset.getString("telefone"));
                agenda.setDataHora(rset.getTimestamp("data_hora"));
                agenda.setMedicoCrm(rset.getString("medico_crm"));
                agenda.setDocPaciente(rset.getString("paciente_doc"));

                agendas.add(agenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return agendas;
    }
}
