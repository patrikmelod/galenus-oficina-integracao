package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {

    public void save(Consulta consulta) {
        String sql = "INSERT INTO consulta(pagamento, hip_diagnostico, conduta, tratamento, hist_clinica, motivo_cons, alergias, diagostico, doencas_cron, medico_crm, data_hora, paciente_documento) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, consulta.getPagamento());
            pstm.setString(2, consulta.getHipDiagnostico());
            pstm.setString(3, consulta.getConduta());
            pstm.setString(4, consulta.getTratamento());
            pstm.setString(5, consulta.getHistClinica());
            pstm.setString(6, consulta.getMotivoCons());
            pstm.setString(7, consulta.getAlergias());
            pstm.setString(8, consulta.getDiagostico());
            pstm.setString(9, consulta.getDoencasCron());
            pstm.setString(10, consulta.getMedicoCrm());
            pstm.setTimestamp(11, consulta.getDataHora());
            pstm.setString(12, consulta.getPacienteDoc());


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

    public void update(Consulta consulta) {

        String sql = "UPDATE consulta SET pagamento= ?,hip_diagnostico= ?,conduta= ?,tratamento= ?,hist_clinica= ?,motivo_cons= ?,alergias= ?,diagostico= ?,doencas_cron= ?,medico_crm= ?,data_hora= ?,paciente_documento= ?" +
                " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, consulta.getPagamento());
            pstm.setString(2, consulta.getHipDiagnostico());
            pstm.setString(3, consulta.getConduta());
            pstm.setString(4, consulta.getTratamento());
            pstm.setString(5, consulta.getHistClinica());
            pstm.setString(6, consulta.getMotivoCons());
            pstm.setString(7, consulta.getAlergias());
            pstm.setString(8, consulta.getDiagostico());
            pstm.setString(9, consulta.getDoencasCron());
            pstm.setString(10, consulta.getMedicoCrm());
            pstm.setTimestamp(11, consulta.getDataHora());
            pstm.setString(12, consulta.getPacienteDoc());
            pstm.setInt(13, consulta.getId());

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

    public List<Consulta> getByPacDoc(String pacDoc) {

        String sql = "SELECT * FROM consulta WHERE paciente_nome = ?";

        List<Consulta> consultas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, pacDoc);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Consulta consulta = new Consulta();
                consulta.setPagamento(rset.getString("pagamento"));
                consulta.setHipDiagnostico(rset.getString("hip_diagnostico"));
                consulta.setConduta(rset.getString("conduta"));
                consulta.setTratamento(rset.getString("tratamento"));
                consulta.setHistClinica(rset.getString("hist_clinica"));
                consulta.setMotivoCons(rset.getString("motivo_cons"));
                consulta.setAlergias(rset.getString("alergias"));
                consulta.setDiagostico(rset.getString("diagostico"));
                consulta.setDoencasCron(rset.getString("doencas_cron"));
                consulta.setMedicoCrm(rset.getString("medico_crm"));
                consulta.setDataHora(rset.getTimestamp("data_hora"));
                consulta.setPacienteDoc(rset.getString("paciente_documento"));

                consultas.add(consulta);
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
        return consultas;
    }

    public List<Consulta> getAll() {

        String sql = "SELECT * FROM consulta";

        List<Consulta> consultas = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Consulta consulta = new Consulta();
                consulta.setPagamento(rset.getString("pagamento"));
                consulta.setHipDiagnostico(rset.getString("hip_diagnostico"));
                consulta.setConduta(rset.getString("conduta"));
                consulta.setTratamento(rset.getString("tratamento"));
                consulta.setHistClinica(rset.getString("hist_clinica"));
                consulta.setMotivoCons(rset.getString("motivo_cons"));
                consulta.setAlergias(rset.getString("alergias"));
                consulta.setDiagostico(rset.getString("diagostico"));
                consulta.setDoencasCron(rset.getString("doencas_cron"));
                consulta.setMedicoCrm(rset.getString("medico_crm"));
                consulta.setDataHora(rset.getTimestamp("data_hora"));
                consulta.setPacienteDoc(rset.getString("paciente_documento"));

                consultas.add(consulta);
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
        return consultas;
    }
}