package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    public void save(Medico medico) {
        String sql = "INSERT INTO medico(crm, especialidade, documento) " +
                "VALUES(?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, medico.getCrm());
            pstm.setString(2, medico.getEspecialidade());
            pstm.setString(3, medico.getDocumento());

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

    public void update(Medico medico) {

        String sql = "UPDATE medico SET crm = ?, especialidade = ?, documento = ? " +
                "WHERE crm = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, medico.getCrm());
            pstm.setString(2, medico.getEspecialidade());
            pstm.setString(3, medico.getDocumento());
            pstm.setString(4, medico.getCrm());

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

    public Medico getByCrm(String crm) {

        String sql = "SELECT * FROM medico WHERE crm = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, crm);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Medico medico = new Medico();
                medico.setCrm(rset.getString("crm"));
                medico.setEspecialidade(rset.getString("especialidade"));
                medico.setDocumento(rset.getString("documento"));
                return medico;
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
        return null;
    }

    public Medico getByDoc(String documento){

        String sql = "SELECT * FROM medico WHERE documento = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, documento);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Medico medico = new Medico();
                medico.setCrm(rset.getString("crm"));
                medico.setEspecialidade(rset.getString("especialidade"));
                medico.setDocumento(rset.getString("documento"));
                return medico;
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
        return null;
    }

    public Medico getByName(String nome){

        String sql = "SELECT m.* FROM medico m, funcionario f WHERE f.nome = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, nome);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Medico medico = new Medico();
                medico.setCrm(rset.getString("crm"));
                medico.setEspecialidade(rset.getString("especialidade"));
                medico.setDocumento(rset.getString("documento"));
                return medico;
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
        return null;
    }

    public List<Medico> getAll() {

        String sql = "SELECT * FROM medico";

        List<Medico> medicos = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Medico medico = new Medico();
                medico.setCrm(rset.getString("crm"));
                medico.setEspecialidade(rset.getString("especialidade"));
                medico.setDocumento(rset.getString("documento"));

                medicos.add(medico);
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
        return medicos;
    }
}
