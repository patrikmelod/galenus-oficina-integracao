package com.galenus.controller;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.AgendaPrimeira;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaPrimeiraDAO {

    public void save(AgendaPrimeira agendaPrimeira) {
        String sql = "INSERT INTO agenda_primeira(telefone, data_hora, medico_crm, paciente_nome) " +
                "VALUES(?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, agendaPrimeira.getTelefone());
            pstm.setTimestamp(2, agendaPrimeira.getDataHora());
            pstm.setString(3, agendaPrimeira.getMedicoCrm());
            pstm.setString(4, agendaPrimeira.getNomePaciente());
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

    public AgendaPrimeira getAllByName(String nome) {
        String sql = "SELECT * FROM agenda_primeira WHERE paciente_nome = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            rset = pstm.executeQuery();

            if (rset.next()) {
                AgendaPrimeira agendaPrimeira = new AgendaPrimeira();
                agendaPrimeira.setId(rset.getInt("id"));
                agendaPrimeira.setTelefone(rset.getString("telefone"));
                agendaPrimeira.setDataHora(rset.getTimestamp("data_hora"));
                agendaPrimeira.setMedicoCrm(rset.getString("medico_crm"));
                agendaPrimeira.setNomePaciente(rset.getString("paciente_nome"));
                return agendaPrimeira;
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
        return null;
    }

    public List<AgendaPrimeira> getAllNew() {
        String sql = "SELECT * FROM agenda_primeira WHERE data_hora > CURRENT_DATE";
        List<AgendaPrimeira> agendaPrimeiras = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                AgendaPrimeira agendaPrimeira = new AgendaPrimeira();
                agendaPrimeira.setId(rset.getInt("id"));
                agendaPrimeira.setTelefone(rset.getString("telefone"));
                agendaPrimeira.setDataHora(rset.getTimestamp("data_hora"));
                agendaPrimeira.setMedicoCrm(rset.getString("medico_crm"));
                agendaPrimeira.setNomePaciente(rset.getString("paciente_nome"));
                agendaPrimeiras.add(agendaPrimeira);
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
        return agendaPrimeiras;
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM agenda_primeira WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
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
    }
}
