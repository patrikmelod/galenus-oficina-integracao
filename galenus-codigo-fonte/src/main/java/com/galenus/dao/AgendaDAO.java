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

        String sql = "INSERT INTO agenda(telefone, data_hora, medico_crm, paciente_doc, pagamento) " +
                "VALUES(?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, agenda.getTelefone());
            pstm.setTimestamp(2, agenda.getDataHora());
            pstm.setString(3, agenda.getMedicoCrm());
            pstm.setString(4, agenda.getDocPaciente());
            pstm.setString(5, agenda.getPagamento());

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

        String sql = "UPDATE agenda SET telefone = ?, data_hora = ?, medico_crm = ?, paciente_doc = ?, pagamento = ? " +
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
            pstm.setString(5, agenda.getPagamento());
            pstm.setInt(6, agenda.getId());

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
                agenda.setId(rset.getInt("id"));
                agenda.setTelefone(rset.getString("telefone"));
                agenda.setDataHora(rset.getTimestamp("data_hora"));
                agenda.setMedicoCrm(rset.getString("medico_crm"));
                agenda.setDocPaciente(rset.getString("paciente_doc"));
                agenda.setPagamento(rset.getString("pagamento"));

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

    public List<Agenda> getAllByDate(String crm) {

        String sql = "SELECT * FROM agenda WHERE data_hora > CURRENT_DATE AND medico_crm = ?";

        List<Agenda> agendas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, crm);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Agenda agenda = new Agenda();
                agenda.setId(rset.getInt("id"));
                agenda.setTelefone(rset.getString("telefone"));
                agenda.setDataHora(rset.getTimestamp("data_hora"));
                agenda.setMedicoCrm(rset.getString("medico_crm"));
                agenda.setDocPaciente(rset.getString("paciente_doc"));
                agenda.setPagamento(rset.getString("pagamento"));

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
                agenda.setId(rset.getInt("id"));
                agenda.setTelefone(rset.getString("telefone"));
                agenda.setDataHora(rset.getTimestamp("data_hora"));
                agenda.setMedicoCrm(rset.getString("medico_crm"));
                agenda.setDocPaciente(rset.getString("paciente_doc"));
                agenda.setPagamento(rset.getString("pagamento"));

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

    public void delete(String docPac) {

        String sql = "DELETE FROM agenda WHERE paciente_doc = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, docPac);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Não há funcionário com o email informado");
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

    public void deleteById(Integer id) {

        String sql = "DELETE FROM agenda WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Não há funcionário com o email informado");
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
