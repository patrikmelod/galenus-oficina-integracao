package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ConsultaDAO {

    public void save(Consulta consulta) {
        String sql = "INSERT INTO consulta(conduta, tratamento, hist_clinica, motivo_cons, diagostico, doencas_cron, medico_crm, data_hora, paciente_documento) " +
                "VALUES(?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, consulta.getConduta());
            pstm.setString(2, consulta.getTratamento());
            pstm.setString(3, consulta.getHistClinica());
            pstm.setString(4, consulta.getSintomas());
            pstm.setString(5, consulta.getDiagostico());
            pstm.setString(6, consulta.getDoencasCron());
            pstm.setString(7, consulta.getMedicoCrm());
            pstm.setTimestamp(8, consulta.getDataHora());
            pstm.setString(9, consulta.getPacienteDoc());
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
}
