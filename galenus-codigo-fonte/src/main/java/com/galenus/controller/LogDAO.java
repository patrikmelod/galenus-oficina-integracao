package com.galenus.controller;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogDAO {

    public void save(Log log) {
        String sql = "INSERT INTO log_data(data_hora, ip_maquina, func_doc) " +
                "VALUES(?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setTimestamp(1, log.getDataAcesso());
            pstm.setString(2, log.getIpMaquina());
            pstm.setString(3, log.getFuncDoc());
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