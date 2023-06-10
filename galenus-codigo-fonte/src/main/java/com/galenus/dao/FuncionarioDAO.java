package com.galenus.dao;

import com.galenus.config.DatabaseConfig;
import com.galenus.model.Funcionario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public void save(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario(documento, nome, nascimento, telefone, endereco, email, senha) " +
                "VALUES(?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getDocumento());
            pstm.setString(2, funcionario.getNome());
            pstm.setDate(3, funcionario.getNascimento());
            pstm.setString(4, funcionario.getTelefone());
            pstm.setString(5, funcionario.getEndereco());
            pstm.setString(6, funcionario.getEmail());
            pstm.setString(7, funcionario.getSenha());
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

    public void update(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET documento = ?, nome = ?, nascimento = ?, telefone = ?, endereco = ?, email = ?, senha = ?" +
                "WHERE documento = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getDocumento());
            pstm.setString(2, funcionario.getNome());
            pstm.setDate(3, (Date) funcionario.getNascimento());
            pstm.setString(4, funcionario.getTelefone());
            pstm.setString(5, funcionario.getEndereco());
            pstm.setString(6, funcionario.getEmail());
            pstm.setString(7, funcionario.getSenha());
            pstm.setString(8, funcionario.getDocumento());
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

    public Funcionario getByEmail(String email) {
        String sql = "SELECT * FROM funcionario WHERE email = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setDocumento(rset.getString("documento"));
                funcionario.setNome(rset.getString("nome"));
                funcionario.setNascimento(rset.getDate("nascimento"));
                funcionario.setTelefone(rset.getString("telefone"));
                funcionario.setEndereco(rset.getString("endereco"));
                funcionario.setEmail(rset.getString("email"));
                funcionario.setSenha(rset.getString("senha"));
                return funcionario;
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

    public Funcionario getByDoc(String documento) {
        String sql = "SELECT * FROM funcionario WHERE documento = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, documento);
            rset = pstm.executeQuery();

            if (rset.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setDocumento(rset.getString("documento"));
                funcionario.setNome(rset.getString("nome"));
                funcionario.setNascimento(rset.getDate("nascimento"));
                funcionario.setTelefone(rset.getString("telefone"));
                funcionario.setEndereco(rset.getString("endereco"));
                funcionario.setEmail(rset.getString("email"));
                funcionario.setSenha(rset.getString("senha"));
                return funcionario;
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

    public List<Funcionario> getAllMedicos(String especialidade) {
        String sql = "SELECT f.* FROM funcionario f, medico m " +
                "WHERE f.documento = m.documento AND m.especialidade = ?";
        List<Funcionario> funcionarios = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = DatabaseConfig.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, especialidade);
            rset = pstm.executeQuery();
            while (rset.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setDocumento(rset.getString("documento"));
                funcionario.setNome(rset.getString("nome"));
                funcionario.setNascimento(rset.getDate("nascimento"));
                funcionario.setTelefone(rset.getString("telefone"));
                funcionario.setEndereco(rset.getString("endereco"));
                funcionario.setEmail(rset.getString("email"));
                funcionario.setSenha(rset.getString("senha"));

                funcionarios.add(funcionario);
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
        return funcionarios;
    }
}