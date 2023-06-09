package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public void update(Log log) {

        String sql = "UPDATE log_data SET id = ?, data_hora = ?, ip_maquina = ?, func_doc = ? " +
                "WHERE func_doc = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, log.getId());
            pstm.setTimestamp(2, log.getDataAcesso());
            pstm.setString(3, log.getIpMaquina());
            pstm.setString(4, log.getFuncDoc());
            pstm.setString(5, log.getFuncDoc());

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

    public List<Log> getLogs() {

        String sql = "SELECT * FROM log_data";

        List<Log> logs = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Log log = new Log();

                log.setId(rset.getInt("id"));
                log.setDataAcesso(rset.getTimestamp("data_hora"));
                log.setIpMaquina(rset.getString("ip_maquina"));
                log.setFuncDoc(rset.getString("func_doc"));

                logs.add(log);
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
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return logs;
    }
}


