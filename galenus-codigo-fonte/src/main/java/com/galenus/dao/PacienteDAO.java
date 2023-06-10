package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Paciente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {
    public void save(Paciente paciente) {
        String sql = "INSERT INTO paciente(documento, nome, nascimento, sexo, telefone, endereco) " +
                "VALUES(?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, paciente.getDocumento());
            pstm.setString(2, paciente.getNome());
            pstm.setDate(3, paciente.getNascimento());
            pstm.setString(4, paciente.getSexo());
            pstm.setString(5, paciente.getTelefone());
            pstm.setString(6, paciente.getEndereco());


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

    public void update(Paciente paciente) {

        String sql = "UPDATE paciente SET documento = ?, nome = ?, nascimento = ?, sexo = ?,telefone = ?, endereco = ? " +
                "WHERE documento = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, paciente.getDocumento());
            pstm.setString(2, paciente.getNome());
            pstm.setDate(3, paciente.getNascimento());
            pstm.setString(3, paciente.getSexo());
            pstm.setString(5, paciente.getTelefone());
            pstm.setString(6, paciente.getEndereco());
            pstm.setString(7, paciente.getDocumento());

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

    public Paciente getByDoc(String documento) {

        String sql = "SELECT * FROM paciente WHERE documento = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, documento);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Paciente paciente = new Paciente();
                paciente.setDocumento(rset.getString("documento"));
                paciente.setNome(rset.getString("nome"));
                paciente.setNascimento(rset.getDate("nascimento"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setEndereco(rset.getString("endereco"));
                return paciente;
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

    public Paciente getByName(String nome) {

        String sql = "SELECT * FROM paciente WHERE nome = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, nome);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Paciente paciente = new Paciente();
                paciente.setDocumento(rset.getString("documento"));
                paciente.setNome(rset.getString("nome"));
                paciente.setNascimento(rset.getDate("nascimento"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setEndereco(rset.getString("endereco"));
                return paciente;
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

    public List<Paciente> getAll() {

        String sql = "SELECT * FROM paciente";

        List<Paciente> pacientes = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Paciente paciente = new Paciente();

                paciente.setDocumento(rset.getString("documento"));
                paciente.setNome(rset.getString("nome"));
                paciente.setNascimento(rset.getDate("nascimento"));
                paciente.setSexo(rset.getString("sexo"));
                paciente.setTelefone(rset.getString("telefone"));
                paciente.setEndereco(rset.getString("endereco"));

                pacientes.add(paciente);
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
        return pacientes;
    }
}
